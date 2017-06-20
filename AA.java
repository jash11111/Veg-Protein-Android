package com.vegprotein.part2;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;
import com.vegprotein.part2.R;

public class AA extends  ArrayAdapter<String> {
    
	private final Context context;
	private final String[] values;
	
	public AA(Context context, String[] values) {// constructor.....
		super(context, R.layout.activity_main1, values);
		this.context = context;
		this.values = values;
	}
	
	
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) context
			.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
 
		View rowView = inflater.inflate(R.layout.activity_main1, parent, false);
		TextView textView = (TextView) rowView.findViewById(R.id.label);
		ImageView imageView = (ImageView) rowView.findViewById(R.id.logo);
		textView.setText(values[position]);
		
		// Change icon based on name
				String s = values[position];
		 
				System.out.println(s);
		 
				if (s.equals("Cottage Cheese"))
					imageView.setImageResource(R.drawable.cheese);
		        else if (s.equals("Quinoa"))
					imageView.setImageResource(R.drawable.quinoa);
		        else if (s.equals("Seitan"))
					imageView.setImageResource(R.drawable.seitan);
		        else if (s.equals("Egg"))
					imageView.setImageResource(R.drawable.egg);
				else if (s.equals("Milk"))
					imageView.setImageResource(R.drawable.milk);
				else if (s.equals("Yogurt"))
					imageView.setImageResource(R.drawable.y);
				else if (s.equals("Paneer"))
					imageView.setImageResource(R.drawable.paneer);
				else if (s.equals("Tofu"))
					imageView.setImageResource(R.drawable.tofu);
				else if (s.equals("Peanut Butter"))
					imageView.setImageResource(R.drawable.peanut);
				else if (s.equals("Kidney Beans"))
					imageView.setImageResource(R.drawable.rajma);
				else if (s.equals("Oat Meal"))
					imageView.setImageResource(R.drawable.oat);
				else if (s.equals("Black Beans"))
					imageView.setImageResource(R.drawable.black);
				else if (s.equals("ChickPeas"))
					imageView.setImageResource(R.drawable.chick);
				else if (s.equals("Soyabean"))
					imageView.setImageResource(R.drawable.sss);
				else 
					imageView.setImageResource(R.drawable.whey);
				return rowView;
			}
		}
