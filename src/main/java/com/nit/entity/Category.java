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
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="category_id_col")
	private Long id;
	@Column(name="category_name_col",length = 50)
	private String categoryName;
	@Column(name="category_alias_name_col",length = 50)
	private String aliasName;
	@Column(name="category_desc_col",length = 200)
	private String description;
	@Column(name="category_status_col",length = 50)
	private String status;
}
