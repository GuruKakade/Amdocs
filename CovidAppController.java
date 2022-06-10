package com.amdocs.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.training.doa.DOACenter;
import com.amdocs.training.entity.*;
@RestController
public class CovidAppController {
	@Autowired
	DOACenter doa;
	
	@GetMapping("/allcenter")
	List<CovidApp> getAllCcenters()
	{
		return doa.getall();
	}
	
	@GetMapping("/allcenters/pincode")
	CovidApp get(@PathVariable int pincode)
	{
		return doa.get(pincode);
	}
	
	
	@PostMapping("/add")
	public void addCenter(@RequestBody CovidApp app)
	{
		doa.add(app);
	}

}
