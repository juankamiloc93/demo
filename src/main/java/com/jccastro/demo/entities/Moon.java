package com.jccastro.demo.entities;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.Setter;
import lombok.ToString;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter @Setter @NoArgsConstructor @ToString
public class Moon {
	
	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private int position_y;
	
	private String position_x_0;
	private String position_x_1;
	private String position_x_2;
	private String position_x_3;
	private String position_x_4;
	private String position_x_5;
	private String position_x_6;
	private String position_x_7;
	
	@CreationTimestamp
	private LocalDateTime dateCreated;
	
	@UpdateTimestamp
	private LocalDateTime lastUpdate;

}
