package com.jccastro.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jccastro.demo.entities.Moon;

public interface MoonRepository extends JpaRepository<Moon, Long>{
	
	
}
