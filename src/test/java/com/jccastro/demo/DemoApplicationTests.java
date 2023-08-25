package com.jccastro.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jccastro.demo.entities.Moon;
import com.jccastro.demo.repositories.MoonRepository;

@SpringBootTest
class DemoApplicationTests {
	
	@Autowired
	private MoonRepository moonRepository;

	@Test
	void contextLoads() {
		
		Moon moon = new Moon();
		
		moon.setPositionY(0);
		moon.setPositionX0("X");
		moon.setPositionX1("X");
		moon.setPositionX2("X");
		moon.setPositionX3("X");
		moon.setPositionX4("X");
		moon.setPositionX5("X");
		moon.setPositionX6("X");
		moon.setPositionX7("X");
		
		Moon savedObject = moonRepository.save(moon);
		
		//moonRepository.findByPosition_y(0);
		
		//System.out.println(postionY0);
		
		System.out.println(savedObject.toString());	
		
	}

}
