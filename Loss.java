package com.vegprotein.part2;





import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.view.View;

public class Loss extends ListActivity {
	 
	static final String[] FOOD_LIST = 
               new String[] {"Whey","Egg","Milk","Yogurt","Paneer","Tofu","Cottage Cheese","Quinoa","Seitan","Peanut Butter","Kidney Beans","Oat Meal","Black Beans","ChickPeas","Soyabean"};
 
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        
		
		
		
		
		
		setListAdapter(new LossAA(this, FOOD_LIST));
		
	}
 
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
 
		//get selected items
		String item = (String) getListAdapter().getItem(position);
		Toast.makeText(this, item, Toast.LENGTH_SHORT).show();
 
		if(item == "Whey")
		{
		Intent intent = new Intent(Loss.this, Whey.class);
		
        startActivity(intent);  
       
		}
		
		
		/*
		switch(item){
		case "Whey":
			Intent intent = new Intent(List.this, Whey.class);
	        startActivity(intent);*/
		}
			
		
		
		
		}

		
