package com.example.thtimethecharm;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class InitialFragment extends Fragment {

	public String fragment_Name = "Initial Fragment";
	public String fragment_Title = "INITIAL FRAGMENT";
	
	public String getName ()
	{
		return fragment_Name;
	}
	
	public String getTitle ()
	{
		return fragment_Title;
	}	 
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		return inflater.inflate(R.layout.init_frag, container, false);
	}
	
	

}
