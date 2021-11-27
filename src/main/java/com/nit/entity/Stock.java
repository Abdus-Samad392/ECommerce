package com.nit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
public class Stock {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "stock_id_col")
	private Long id;
	
	@OneToOne
	@JoinColumn(name = "product_id_fk_col")
	private Product product;
	
	
	@Column(name = "stock_count_col")
	private Integer count;
	
	@Column(name = "stock_QOH_col")
	private Integer QOH;
	
	@Column(name = "stock_sold_col")
	private Integer sold;
}
