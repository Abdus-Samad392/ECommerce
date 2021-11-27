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
public class Shipping {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "shipping_id_col")
	private Long id;
	
	@Column(name = "shipping_type_col")
	private String shippingType;
	
	@Column(name = "shipping_code_col")
	private String shippingCode;
	
	@Column(name = "shipping_name_col")
	private String shippingName;
	
	@Column(name = "shipping_cost_col")
	private Double shippingCost;
	
	@Column(name = "shipping_weight_col")
	private Double shippingWeight;
	
	@Column(name = "shipping_weight_type_col")
	private Double shippingWeightType;
	
	@Column(name = "shipping_note_col")
	private String shippingNote;

}
