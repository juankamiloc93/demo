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
		
		moon.setPosition_y(0);
		moon.setPosition_x_0("X");
		moon.setPosition_x_0("X");
		moon.setPosition_x_0("X");
		moon.setPosition_x_0("X");
		moon.setPosition_x_0("X");
		moon.setPosition_x_0("X");
		moon.setPosition_x_0("X");
		
		Moon savedObject = moonRepository.save(moon);
		
		System.out.print(savedObject.toString());		
		
	}

}
