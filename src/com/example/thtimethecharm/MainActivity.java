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
	TextView tv_ScreenTitle;
	
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
			
			/*FragmentManager fragmentManager = getFragmentManager();
			FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
			
			Fragment initial_Fragment = new Fragment ();
			FragmentTransaction transaction = getFragmentManager().beginTransaction();
			
			transaction.replace(R.id.ContentLayout, initial_Fragment);
			transaction.addToBackStack(null);
			transaction.commit();
		
		}
		*/
		
		
		btn_Fwd = (Button)findViewById(R.id.button2);
		btn_Back = (Button)findViewById(R.id.button1);
		tv_ScreenTitle = (TextView)findViewById(R.id.tw_Header);		
		
		
		
		
		btn_Fwd.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				OpenOptionsFragment();
				
			}
		});		
		
		btn_Back.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						
						OpenInitialFragment();
						
					}
				});	
		
		
	}
	
	
	public void ChangeScreenTitle (String new_title)
	{
		tv_ScreenTitle.setText(new_title);
	}
	
	public void OpenOptionsFragment()
	{
		OptionsFragment optionsFragment = new OptionsFragment();
		
		android.app.FragmentManager fm = getFragmentManager();
		android.app.FragmentTransaction transaction = fm.beginTransaction();
		transaction.setCustomAnimations(android.R.animator.fade_in, android.R.animator.fade_out);
		
		transaction.replace(R.id.ContentLayout, optionsFragment);
		transaction.addToBackStack(null);
		transaction.commit();
		
		ChangeScreenTitle(optionsFragment.getTitle());
		Log.i("ButtonTapped", "Button " + btn_Fwd.getText().toString() + " has been tapped, current fragment is " + optionsFragment.getName().toString());
	}
	
	public void OpenInitialFragment()
	{
		InitialFragment initialFragment = new InitialFragment();
		
		android.app.FragmentManager fm = getFragmentManager();
		android.app.FragmentTransaction transaction = fm.beginTransaction();
		transaction.setCustomAnimations(android.R.animator.fade_in, android.R.animator.fade_out);
		
		
		transaction.replace(R.id.ContentLayout, initialFragment);
		transaction.addToBackStack(null);
		transaction.commit();					

		
		ChangeScreenTitle(initialFragment.getTitle());
		Log.i("ButtonTapped", "Button " + btn_Fwd.getText().toString() + " has been tapped, current fragment is " + initialFragment.getName().toString());
	}
	
	
	
	/*public void GetFragment ()
	{
		android.app.FragmentManager framan = getFragmentManager();
		Fragment testFrag = framan.findFragmentById(R.id.content_fragment);
		int test = testFrag.getId();
		
		
		ChangeScreenTitle(Integer.toString(test));
	}*/
	
	
	
	
	
}
