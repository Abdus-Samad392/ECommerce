package com.nit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="product_id_col")
	private Long id;
	@Column(name="product_short_desc_col")
	private String shortDescription;
	@Column(name="product_full_desc_col")
	private String fullDescription;
	@ManyToOne
	@JoinColumn(name="brand_fk_col")
	private Brand brand;
	@ManyToOne
	@JoinColumn(name="category_fk_col")
	private Category category;
	@Column(name="product_status_col")
	private String status;
	@Column(name="product_inStock_col")
	private String inStock;
	@Column(name="product_id_col")
	private Double cost;
	@Column(name="product_length_col")
	private Double length;
	@Column(name="product_width_col")
	private Double width;
	@Column(name="product_height_col")
	private Double height;
	@Column(name="product_weight_col")
	private Double weight;
	@Column(name="product_weighttype_col")
	private String weightType;
	@Column(name="product_note_col")
	private String note;
}
