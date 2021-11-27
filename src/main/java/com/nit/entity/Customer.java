package com.nit.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="customer_id_col")
	private Long id;
	
	@Column(name="customer_name_col")
	private String customerName;
	
	@Column(name="customer_email_col")
	private String customerEmail;
	
	@Column(name="customer_id_col")
	private Long customerMobileNo;
	
	@Column(name="customer_gender_col")
	private String customerGender;
	
	@Column(name="customer_DOB_col")
	private Date customerDOB;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="customer_address_col")
	private List<Address> address;
}
