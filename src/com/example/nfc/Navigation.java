package com.example.nfc;
 

 

import java.util.ArrayList;

 
 
import android.os.Bundle;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;


public class Navigation extends Activity implements OnItemClickListener{

	
	

	private DrawerLayout mDrawerLayout;
	private ListView mDrawerList;
	private LinearLayout drawer;
	private ArrayList<Nav> items;
	
	
	 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
	   	setContentView(R.layout.navigation);
		 

	 ActionBar action=getActionBar();
		

    ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#32CD32"));     
	     
	action.setBackgroundDrawable(colorDrawable);
	 
	     
		
	 
		
		
	 
	
	   items=new ArrayList<Nav>();

		  mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
		  drawer=(LinearLayout)findViewById(R.id.drawer_view);
		   
		   
		  mDrawerList = (ListView) findViewById(R.id.left_drawer);

		  
      
		  
		  
		 
		   mDrawerList.setDividerHeight(2); 
		  
		  
		  items.add(new Nav(R.drawable.chicken,"Chicken"));
		  items.add(new Nav(R.drawable.beef,"Beef"));
		 
		
		  items.add(new Nav(R.drawable.beverage,"Beverage"));
		  items.add(new Nav(R.drawable.ice_cream,"Ice Cream"));
		  items.add(new Nav(R.drawable.singara,"Others"));
		  
		  
		  mDrawerList.setAdapter(new Nav_adapter(this,items));
		  
		  
		  mDrawerList.setOnItemClickListener(this);
    
	
	  
	
	
	
		
	 
			
			
		Log.d("Sajjad", "found");
			    
			     	
	
	
	
	
	
	
	
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		
		
		
		
		
		
		
		
		
		return true;
	
	}

	
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		
		
		

		
		if(item.getItemId()==R.id.nav){
		
	
          mDrawerLayout.openDrawer(drawer);		
         Log.d("Sajjad","open");
         	
          
	 	}
			
	
		 	
		
		return false;
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
		// TODO Auto-generated method stub
		
		if(position==0)
		{
			
			
			ArrayList<Item> items=new ArrayList<Item>();
			
			
			
			
		        items.add(new Item("Chicken Burgerassdfasfa","Price: 20TK"));
		        items.add(new Item("Chicken Kebab","Price: 1000TK"));
		        items.add(new Item("Chicken Samosa","Price: 500TK"));
		        items.add(new Item("Chicken tikka","Price: 100TK" ));
		        items.add(new Item("Chicken Biryani","Price: 70TK"));
			
			
		        pass(items); 	
		}
		
		
             
		if(position==1)
		{
			
			
			ArrayList<Item> items=new ArrayList<Item>();
			
			
			
			
		        items.add(new Item("Beef Burger","Price: 20TK"));
		        items.add(new Item("Beef Kebab","Price: 1000TK"));
		        items.add(new Item("Beef Samosa","Price: 500TK"));
		        items.add(new Item("Beef tikka","Price: 100TK" ));
		        items.add(new Item("Beef Biryani","Price: 70TK"));
			
			
                   pass(items);      		
		    	
		 }
		
         
	     
			if(position==3)
			{
				
				
				ArrayList<Item> items=new ArrayList<Item>();
				
				
				
				
			        items.add(new Item("Chocolate","Price: 20TK"));
			        items.add(new Item("Vanilla","Price: 1000TK"));
			        items.add(new Item("Strawberry","Price: 500TK"));
			        items.add(new Item("Cone","Price: 100TK" ));
			        items.add(new Item("Chocbar","Price: 70TK"));
				
				
	                   pass(items);      		
			    	
			 }
			
		
		
		
		
   }	
	
	
	
	
    public void pass(ArrayList<Item> items)
    {
   	 
   	 

			List_fragment list = new List_fragment(items);
			
			FragmentTransaction ft =
				     getFragmentManager().beginTransaction();
				   ft.replace(R.id.content_frame, list);
				 
			
			 ft.commit() ;   
	     	
		 		
			mDrawerLayout.closeDrawer(drawer); 
   	 
    }
		

 
	/*	@Override
		public void onSaveInstanceState(Bundle outState){
		
	 	FragmentManager manager = getFragmentManager();
			manager.putFragment(outState, "Hello", list);
		
			
			Log.d("Sajjad",  "hey");
	} 	
	
	 	@Override
	protected void onRestoreInstanceState(Bundle inState){
		
	 	createFragment(inState);
		
	}
	
	
	
 	private void createFragment(Bundle inState){
		
		FragmentManager manager = getFragmentManager();
		FragmentTransaction transaction = manager.beginTransaction();
		
		if(inState != null){
			list = (List_fragment)manager.getFragment(inState, "hello");
			transaction.add(list, "hello");
	 	  
		}
	 	
		
	 	Log.d("Sajjad",  " get");
}
*/	
	
	
	
	
	
}
