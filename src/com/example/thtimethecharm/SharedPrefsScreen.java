package com.example.thtimethecharm;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class SharedPrefsScreen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sharedprefsscreen);
		Log.i("screenOpened","Screen " + this.toString() + " has been opened");
	}

	
}
