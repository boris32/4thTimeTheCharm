package com.example.thtimethecharm;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PhoneNumber extends CustomFragment {	
	
	public String fragment_Name = "Phone Number";
	public String fragment_Title = "Phone Number";

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		return inflater.inflate(R.layout.phone_number_fragment, container, false);
	}
	
	public String getName ()
	{
		return fragment_Name;
	}
	
	public String getTitle ()
	{
		return fragment_Title;
	}	
	
	

}
