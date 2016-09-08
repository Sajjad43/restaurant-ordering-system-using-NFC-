package com.example.nfc;


import java.util.ArrayList;

import android.annotation.SuppressLint;
import android.app.ListFragment;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

 
 

 
@SuppressLint("ValidFragment")
public class List_fragment extends ListFragment implements OnClickListener{
	 
      int count=1; 
	
 	
	
	@SuppressLint("ValidFragment")
	static ArrayList<Item> items ;
 	
	
	
	 
	
	 

	public List_fragment(ArrayList<Item> items) {
		 
		this.items=items;
		
		// TODO Auto-generated constructor stub
	
	
	}
  
	
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
       super.onCreate(savedInstanceState);
	
	
	    setRetainInstance(true);
	
	}


	
	
	
	
	
	

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		 
	     
 		   
 
		  
		   
		   
		
          Adapter one= new Adapter(inflater.getContext(),items);	  
	  
	    	setListAdapter(one);
	 
	    	
	    	
	    	
		   

	    	 
		 
		 
		 Log.d("Sajjad", "found");
		
		
		
		
		 
		 
		  View view = inflater.inflate(R.layout.header_for_item, null);
		    
		 
		 
		   Button proceed_pay=(Button)view.findViewById(R.id.proceed_pay);
		  
		   proceed_pay.setOnClickListener(this);
		 
		 
		 
		 
		 return view;
		 
		  	}

 

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
        

		  setRetainInstance(true);
			
	 
		
		
		super.onActivityCreated(savedInstanceState);
	}


  public void onResume(Bundle savedInstanceState)
  {
	  
	  
	  
	  
	  
	  
	  
	  ListView k=getListView();
	  k.setCacheColorHint(0);
	  
  }

@Override
public void onClick(View v) {
	// TODO Auto-generated method stub
	
	
	
	
	
	  
	
	
	Intent k=new Intent(this.getActivity().getApplicationContext(),Receipt.class );
	 
	startActivity(k);
	
	
	this.getActivity().finish();
	Log.d("Sajjad", "Button");
	
	
	
	
	
	
	
}

public void OnPause()
  {
	  
	  items.clear();
	  
	  
  }

 

 





}
