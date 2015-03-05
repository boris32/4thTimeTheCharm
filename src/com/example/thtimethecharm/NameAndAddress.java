package com.example.thtimethecharm;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class NameAndAddress extends CustomFragment {
	
	public String fragment_Name = "Name And Address";
	public String fragment_Title = "Name & Address";
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		return inflater.inflate(R.layout.name_and_address_frag, container, false);
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
