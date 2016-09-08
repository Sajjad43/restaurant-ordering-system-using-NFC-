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

 

public class Nav_adapter extends ArrayAdapter<Nav>{
	
	
	 private final Context context;
   private final ArrayList<Nav> itemsArrayList;

   public Nav_adapter(Context context, ArrayList<Nav> itemsArrayList) {

       super(context, R.layout.nav_row, itemsArrayList);

       this.context = context;
       this.itemsArrayList = itemsArrayList;
   }

   @Override
   public View getView(int position, View convertView, ViewGroup parent) {

       // 1. Create inflater
       LayoutInflater inflater = (LayoutInflater) context
           .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

       // 2. Get rowView from inflater
       View rowView = inflater.inflate(R.layout.nav_row, parent, false);

       // 3. Get the two text view from the rowView
       ImageView imView = (ImageView) rowView.findViewById(R.id.imview);
       TextView valueView = (TextView) rowView.findViewById(R.id.name);

       // 4. Set the text for textView
       imView.setImageResource(itemsArrayList.get(position).getPicID());
       valueView.setText(itemsArrayList.get(position).getDescription());
       valueView.setTextColor(Color.WHITE);
        
       
        
       // 5. retrn rowView
       
       
      
       
        
       
       return rowView;
   }

	
	
	
	
	
	

}
