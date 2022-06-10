package com.amdocs.training.doa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import com.amdocs.training.entity.*;
@Component
public class DOACenter {

	List<CovidApp> list;
	public DOACenter()
	{
		list=new ArrayList<CovidApp>();
		
		list.add(new CovidApp(1,"Kolhapur",416002));
		list.add(new CovidApp(2,"Pune",412207));
		list.add(new CovidApp(3,"Mumbai",400005));
	}
	
	public List<CovidApp> getall()
	{
		return list;
	}
	
	public CovidApp get(int pincode)
	{
		
		CovidApp obj = null;
		for(CovidApp covidapp: list)
		{
			if(covidapp.getPincode()==pincode)
			{
				obj=covidapp;
				break;
			}
		}
		return obj;
	}
	
	public void add(CovidApp c)
	{
		list.add(c);
		System.out.println("Center Added Successfully");
	}
}
