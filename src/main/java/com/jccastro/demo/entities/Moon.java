package com.jccastro.demo.entities;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
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
	
	@Column(name = "position_y")
	private int positionY;
	
	@Column(name = "position_x_o")
	private String positionX0;
	
	@Column(name = "position_x_1")
	private String positionX1;
	
	@Column(name = "position_x_2")
	private String positionX2;
	
	@Column(name = "position_x_3")
	private String positionX3;
	
	@Column(name = "position_x_4")
	private String positionX4;
	
	@Column(name = "position_x_5")
	private String positionX5;
	
	@Column(name = "position_x_6")
	private String positionX6;
	
	@Column(name = "position_x_7")
	private String positionX7;
	
	@CreationTimestamp
	private LocalDateTime dateCreated;
	
	@UpdateTimestamp
	private LocalDateTime lastUpdate;

}
