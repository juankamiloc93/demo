package com.jccastro.demo.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.jccastro.demo.repositories.MoonRepository;

public class moonService {
	
	@Autowired
	MoonRepository moonRepository;
	
	public String getPosition(int x, int y) {
		
		return "";
		
	}

}
