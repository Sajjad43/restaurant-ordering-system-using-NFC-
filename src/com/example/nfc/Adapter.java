package com.example.nfc;

import java.util.ArrayList;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View.OnClickListener;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
 

public class Adapter extends ArrayAdapter<Item> implements OnClickListener{
	
	
	
	
	
	 private final Context context;
     private ArrayList<Item> itemsArrayList=new ArrayList<Item>();

     private boolean [] arr=new boolean[itemsArrayList.size()];
     
     private Item one;
     
     private View rowView;
     
     private Spinner spinner;
     
     int count=0;
     
     public Adapter(Context context, ArrayList<Item> itemsArrayList) {
 
         super(context, R.layout.item, itemsArrayList);

          this.context = context;
          this.itemsArrayList = itemsArrayList;
     }
       
     
     
     public View getView(int position, View convertView, ViewGroup parent) {
    	 
         // 1. Create inflater
         LayoutInflater inflater = (LayoutInflater) context
             .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        
         
         // 2. Get rowView from inflater
         rowView = inflater.inflate(R.layout.item, parent, false);

         // 3. Get the two text view from the rowView
         TextView food_item = (TextView) rowView.findViewById(R.id.food_item);
         food_item.setText(itemsArrayList.get(position).getName());
                  
     //  for(int j=0;j<itemsArrayList.size();j++) 
       // {
    	//   if(arr[j]==false) 
          
        	    Log.d("Sajjad",""+position);
            	rowView.setBackgroundColor(Color.WHITE); 
        //  else
          //  rowView.setBackgroundColor(Color.YELLOW);
        	
       // }
      
         
       Button cart=(Button)rowView.findViewById(R.id.cart);
       cart.setOnClickListener(this);
       cart.setLeft(82);
        			
        			
         
    
      
      
      
      
      TextView price = (TextView) rowView.findViewById(R.id.price);
      price.setText(itemsArrayList.get(position).getPrice());
       
         Log.d("Sajjad", "found");
         
         // 5. retrn rowView
         return rowView;
 
     }



	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
        myClickHandler(v);
	   	
	
	}
 

	
 public void myClickHandler(View v)
	{
		
		 //   count++;
		
		
		
		     RelativeLayout vwParentRow = (RelativeLayout)v.getParent();

		   // vwParentRow.setBackgroundColor(Color.CYAN);
		     Button btnChild = (Button)vwParentRow.getChildAt(1);
		     LinearLayout child = (LinearLayout)vwParentRow.getChildAt(0);
	         TextView name_food=(TextView)child.getChildAt(0);
	        
	        
	         LinearLayout quantity =(LinearLayout) child.getChildAt(2);
	         Spinner spinner=(Spinner)quantity.getChildAt(1);
	        
	          Log.d("Sajjad",""+ name_food.getText() + " " + (String)spinner.getSelectedItem());
	        
 	          

	      
 	        
 	        
 	        
 	        for(int i=0;i<itemsArrayList.size();i++)
 	          {
 	        	
 	        	 if(name_food.getText().equals(itemsArrayList.get(i).getName()))
 	        	 {
 	        		
 	        		 
 	        		 Log.d("Sajjad", ""+itemsArrayList.get(i).getCount());
 	        		 
 	        		 
 	        	   if(itemsArrayList.get(i).getCount()==1)
 	        		  {
 	        		    vwParentRow.setBackgroundColor(Color.WHITE);
 	        	        itemsArrayList.get(i).setCount(0);
 	        	        // arr[i]=true;  
 	             	   }
 	        	   else
 	        		  {
 	        			  vwParentRow.setBackgroundColor(Color.YELLOW); 
 	        	          itemsArrayList.get(i).setCount(1);
 	        	     	 //	arr[i]=false;
 	        			
     	        	  }
 	        			
 	        		 
 	        	 }
 	        	
 	        	
 	        	
 	        	
 	        }
 	        
 	        
 	        
 	        
 	        
 	         
	       
	      
	           
	   
		
		
  }



	 

    
}
