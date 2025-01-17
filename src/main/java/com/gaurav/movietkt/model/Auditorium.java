package com.gaurav.movietkt.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Auditorium {
	
	@Id   
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer auditoriumId; 
	
     
	private String auditoriumName; 
	private Integer number_of_seat; 
	
	
	
}
