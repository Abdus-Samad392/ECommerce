package com.nit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="address_id_col")
	private Long id;
	
	
	@Column(name="address_line1_col")
	private String line1;
	
	
	@Column(name="address_line2_col")
	private String line2;
	
	
	@Column(name="address_city_col")
	private String city;
	
	
	@Column(name="address_state_col")
	private String state;
	
	
	@Column(name="address_country_col")
	private String country;
	
	
	@Column(name="address_pincode_col")
	private Integer pincode;

}
