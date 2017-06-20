package com.vegprotein.part2;








import android.app.ListActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import com.vegprotein.part2.R;

public class MainActivity extends ListActivity {
	
	/*to change UI of the simple list view create .xml ie mytextview.xml
	 * ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, values);
		        setListAdapter(adapter);
		        
		        what the fuckkkkk android.R.layout.simple_list_item_1
		        
		        it is a simple adapter 
	 * 
	 * 
	 * 
	*/
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		String[] values = new String[] { "INTRODUCTION", "LIST OF FOOD ITEMS", "PROTEIN FOOD","ENERGY FOODS","WEIGHT GAIN FOODS",
				"TOP 15 HEALTHIEST FOODS" };
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				R.layout.mytextview, values);
		        setListAdapter(adapter);
		        // healthiest
		        // Energy foods
		        //foods to loose weight
		        // foods to gain weight
		        //http://www.self.com/fooddiet/2010/03/20-superfoods-slideshow#slide=19
		      
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		String item = (String) getListAdapter().getItem(position);
		
		if(item == "PROTEIN FOOD")
		{
		Intent intent = new Intent(MainActivity.this, List.class);
        startActivity(intent); 
		}
		
		if(item == "LIST OF FOOD ITEMS")
		{
		Intent intent = new Intent(MainActivity.this, ExpandableList.class);
        startActivity(intent);  
		}
		
		if(item == "INTRODUCTION")
		{
		Intent intent = new Intent(MainActivity.this, Int.class);
        startActivity(intent);  
		}
		
		if(item == "TOP 15 HEALTHIEST FOODS")
		{
		Intent intent = new Intent(MainActivity.this, Top15.class);
        startActivity(intent);  
		}
		
		if(item == "ENERGY FOODS")
		{
		Intent intent = new Intent(MainActivity.this, Energy.class);
        startActivity(intent);  
		}
				
		if(item == "WEIGHT GAIN FOODS")
		{
		Intent intent = new Intent(MainActivity.this, Gain.class);
        startActivity(intent);  
		}
		
		
		
		
		
		//Toast.makeText(this, item + " selected", Toast.LENGTH_LONG).show();
	}
	
	
	
	
	
}