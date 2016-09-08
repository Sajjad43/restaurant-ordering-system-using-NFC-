package com.example.nfc;

import java.util.ArrayList;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

 
public class Receip_adapter extends ArrayAdapter<Pay>{

	
	
	
	

    private final Context context;
    private final ArrayList<Pay> itemsArrayList;

    public Receip_adapter(Context context, ArrayList<Pay> itemsArrayList) {

        super(context, R.layout.pay, itemsArrayList);

        this.context = context;
        this.itemsArrayList = itemsArrayList;
        
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // 1. Create inflater
        LayoutInflater inflater = (LayoutInflater) context
            .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // 2. Get rowView from inflater
        View rowView = inflater.inflate(R.layout.pay, parent, false);

        // 3. Get the two text view from the rowView
        TextView  food = (TextView) rowView.findViewById(R.id.food);
        TextView  quantity = (TextView) rowView.findViewById(R.id.quantity);
       
        TextView price = (TextView) rowView.findViewById(R.id.price);

        
        
        // 4. Set the text for textView
         
        food.setText(itemsArrayList.get(position).getName());

        food.setTextSize(20);
        food.setTextColor( Color.DKGRAY);
        
        price.setText(itemsArrayList.get(position).getPrice());
        
        quantity.setText(itemsArrayList.get(position).getQuantity());
        
        
         if(position%2!=0)
        		rowView.setBackgroundColor(Color.CYAN);
        	
         
        
        
        
        
        
        
        // 5. retrn rowView
        return rowView;
    }

	
	
	
	
	
	
	
	
	
	
	
}
