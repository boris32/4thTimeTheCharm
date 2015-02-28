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

public class MainActivity extends ActionBarActivity {

	Button btn_Fwd;
	
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
			
					
			FragmentManager fragmentManager = getFragmentManager();
			FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
			
			Fragment initial_Fragment = new Fragment ();
			FragmentTransaction transaction = getFragmentManager().beginTransaction();
			
			transaction.replace(R.id.ContentLayout, initial_Fragment);
			transaction.addToBackStack(null);
		
		}*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		btn_Fwd = (Button)findViewById(R.id.button2);
		
		btn_Fwd.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Log.i("ButtonTapped", "Button " + btn_Fwd.getText().toString() + " has been tapped");
				//Intent openSharedPrefsScreen = new Intent("com.example.thtimethecharm.SHARED_PREFS_SCREEN");				
				/*Intent openSharedPrefsScreen = new Intent("android.intent.action.SHARED_PREFS_SCREEN");
				startActivity(openSharedPrefsScreen);*/
				
				FragmentManager fragmentManager = getFragmentManager();				
				OptionsFragment optionsFragment = new OptionsFragment();
				FragmentTransaction transaction = getFragmentManager().beginTransaction();
				
				transaction.replace(R.id.ContentLayout, optionsFragment);
				transaction.addToBackStack(null);
				
			}
		});		
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	
	
	
	
}
