package com.example.nfc;

import java.util.ArrayList;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentTransaction;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Receipt extends Activity implements OnClickListener{
  
	
	
	
	// Notification ID to allow for future updates
		private static final int MY_NOTIFICATION_ID = 1;

		// Notification Count 
		private int mNotificationCount;
		
		// Notification Text Elements
		private final CharSequence tickerText = "This is a Really, Really, Super Long Notification Message!";
		private final CharSequence contentTitle = "Notification";
		private final CharSequence contentText = "You've Been Notified!";

		// Notification Action Elements
		private Intent mNotificationIntent;
		private PendingIntent mContentIntent;

	
		// Notification Sound and Vibration on Arrival  
		private Uri soundURI = Uri
				.parse("android.resource://com.example.nfc/" 
						+ R.raw.alarm_rooster);
		private long[] mVibratePattern = { 100, 200, 200, 300 };

	
	
 
       ArrayList<Pay> list=new ArrayList<Pay>();
	 Context context=null;
	
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	  	 
		setContentView(R.layout.receipt); 
		
 
	 	
		list.add(new Pay("100000","Chicken Tikka","20Tk"));
		list.add(new Pay("70","Chicken Samosa","30Tk"));
		
		list.add(new Pay("2","Chicken kebab","80Tk"));
		
		list.add(new Pay("8","Chicken tandoori","1000Tk"));
		
		list.add(new Pay("7","Chicken Masala","200Tk"));
		
		list.add(new Pay("10","Chicken kurma","40000Tk"));
		
		
		 
		
	  
      ListView  k=(ListView)findViewById(R.id.receipt);
      
 
       

	 
	 Receip_adapter m=new Receip_adapter(getApplicationContext(),list);
      
      
       
      
      k.setAdapter(m);
      
     ImageButton pay_pal=(ImageButton)findViewById(R.id.pay_pal);
     pay_pal.setOnClickListener(this);
      
     
     Button back=(Button)findViewById(R.id.back);
     back.setOnClickListener(this);
     
	 
   //  mNotificationIntent = new Intent(getApplicationContext(),
		//		Notification.class);
	//	mContentIntent = PendingIntent.getActivity(getApplicationContext(), 0,
			//	mNotificationIntent, Intent.FLAG_ACTIVITY_NEW_TASK);

	 
	  
	
	
	
	
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
	 	
		
		
		
		
		
		
		
		
		return true;
	
	}

	
	
	public boolean onOptionsItemSelected(MenuItem item) {

		 
 		
		
		return false;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
          
	/*	NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(
				getApplicationContext())
				.setTicker(tickerText)
				.setSmallIcon(android.R.drawable.stat_sys_warning)
				.setAutoCancel(true)
				.setContentTitle(contentTitle)
				.setContentText(
						contentText + " (" + ++mNotificationCount + ")")
				.setContentIntent(mContentIntent).setSound(soundURI)
				.setVibrate(mVibratePattern);
		        
                
		
	 
	
		
		// Pass the Notification to the NotificationManager:
		NotificationManager mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
		mNotificationManager.notify(MY_NOTIFICATION_ID,
				notificationBuilder.build());
		
		//Intent o=new Intent(getApplicationContext(),MainActivity.class);
	//	startActivity(o);
		
		//finish();
		
		
		
	*/	
		
		
		
		
		if(v==(ImageButton)findViewById(R.id.pay_pal))	
			{	AlertDialog alertDialog = new AlertDialog.Builder(this).create();
				alertDialog.setTitle("Payment Status");
				alertDialog.setMessage("Your payment is done.Please wait for the notification that gives you the token no and tells you that the order is ready to serve.Get the food ,showing the token no in the counter");
		 
				alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int which) {
								// here you can add functions
		
		
								finish();
		
							}
					});
				alertDialog.setIcon(R.drawable.open);
				alertDialog.show();
		
		
			}	

     
		if(v==(Button)findViewById(R.id.back))	
		{ 
			Intent o=new Intent(getApplicationContext(),Navigation.class);
			startActivity(o);
			finish();
			
		}	


		
		
		
		
		
		
	
	}
 
	
	
	
	
}
