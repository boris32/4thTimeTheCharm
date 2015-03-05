package com.example.thtimethecharm;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Filters extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		return inflater.inflate(R.layout.filter_fragment, container, false);
	}
	
	public String fragment_Name = "Filters";
	public String fragment_Title = "Set filters";
	
	public String getName ()
	{
		return fragment_Name;
	}
	
	public String getTitle ()
	{
		return fragment_Title;
	}	

	
}
