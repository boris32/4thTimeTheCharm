package com.example.thtimethecharm;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBarActivity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

	Button btn_Fwd, btn_Back;
	TextView tv_ScreenSubTitle;
	
	public static int int_Navigation_Location = 1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//SET FRAGMENTS
		/*if (findViewById(R.id.ContentLayout) != null)
		{
			if (savedInstanceState != null)
			{
				return;
			}
			
			InitialFragment initial_Fragment = new InitialFragment();
			initial_Fragment.setArguments(getIntent().getExtras());
			
			getSupportFragmentManager().beginTransaction().add(R.id.ContentLayout, initial_Fragment).commit();*/
			
			FragmentManager fragmentManager = getFragmentManager();
			FragmentTransaction transaction = fragmentManager.beginTransaction();
			
			NameAndAddress NameAndAddress_Fragment = new NameAndAddress();
			
			transaction.replace(R.id.ContentLayout, NameAndAddress_Fragment);
			transaction.addToBackStack(null);
			transaction.commit();
		
		//}

		
		
		btn_Fwd = (Button)findViewById(R.id.button2);
		btn_Back = (Button)findViewById(R.id.button1);
		tv_ScreenSubTitle = (TextView)findViewById(R.id.tv_Subtitle);		
		
		
		//tv_ScreenSubTitle.setText(tv_ScreenSubTitle.getText() + "(" + int_Navigation_Location + ")");
		
		
		
		btn_Fwd.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				switch (int_Navigation_Location)
				{
				case 0: 
					OpenNameAndAddressFragment();
					int_Navigation_Location++;
					break;
				case 1: 
					OpenPhoneNumberFragment();
					int_Navigation_Location++;
					break;
				case 2:
					OpenFiltersFragment();
					int_Navigation_Location++;
					break;
				}
				
			}
		});		
		
		btn_Back.setOnClickListener(new View.OnClickListener() {
					
			@Override
			public void onClick(View v) {
				switch (int_Navigation_Location)
				{
				case 2: 
					OpenNameAndAddressFragment();
					int_Navigation_Location--;
					break;
				case 3: 
					OpenPhoneNumberFragment();
					int_Navigation_Location--;
					break;
				case 4:
					OpenFiltersFragment();
					int_Navigation_Location--;
					break;
				}
			}
		});	
		
		
	}
	
	
	public void ChangeScreenTitle (String new_title)
	{
		tv_ScreenSubTitle.setText(new_title + "(" + int_Navigation_Location + ")");
	}
	
	public void OpenPhoneNumberFragment()
	{
		PhoneNumber PhoneNumber_Fragment = new PhoneNumber();
		
		android.app.FragmentManager fm = getFragmentManager();
		android.app.FragmentTransaction transaction = fm.beginTransaction();
		transaction.setCustomAnimations(android.R.animator.fade_in, android.R.animator.fade_out);
		
		transaction.replace(R.id.ContentLayout, PhoneNumber_Fragment);
		transaction.addToBackStack(null);
		transaction.commit();
		
		ChangeScreenTitle(PhoneNumber_Fragment.getTitle());
		Log.i("ButtonTapped", "Button " + btn_Fwd.getText().toString() + " has been tapped, current fragment is " + PhoneNumber_Fragment.getName().toString());
	}
	
	public void OpenNameAndAddressFragment()
	{
		NameAndAddress NameAndAddressFragment = new NameAndAddress();
		
		android.app.FragmentManager fm = getFragmentManager();
		android.app.FragmentTransaction transaction = fm.beginTransaction();
		transaction.setCustomAnimations(android.R.animator.fade_in, android.R.animator.fade_out);
		
		
		transaction.replace(R.id.ContentLayout, NameAndAddressFragment);
		transaction.addToBackStack(null);
		transaction.commit();					

		
		ChangeScreenTitle(NameAndAddressFragment.getTitle());
		Log.i("ButtonTapped", "Button " + btn_Fwd.getText().toString() + " has been tapped, current fragment is " + NameAndAddressFragment.getName().toString());
	}
	
	public void OpenFiltersFragment()
	{
		Filters FiltersFragment = new Filters();
		
		android.app.FragmentManager fm = getFragmentManager();
		android.app.FragmentTransaction transaction = fm.beginTransaction();
		transaction.setCustomAnimations(android.R.animator.fade_in, android.R.animator.fade_out);
		
		
		transaction.replace(R.id.ContentLayout, FiltersFragment);
		transaction.addToBackStack(null);
		transaction.commit();					

		
		ChangeScreenTitle(FiltersFragment.getTitle());
		Log.i("ButtonTapped", "Button " + btn_Fwd.getText().toString() + " has been tapped, current fragment is " + FiltersFragment.getName().toString());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public void GetFragment ()
	{
		android.app.FragmentManager framan = getFragmentManager();
		Fragment testFrag = framan.findFragmentById(R.id.content_fragment);
		int test = testFrag.getId();
		
		
		ChangeScreenTitle(Integer.toString(test));
	}*/
	
	
	
	
	
}
