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
public class Brand {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="brand_id_col")
	private Long id;
	@Column(name="brand_name_col")
	private String brandName;
	@Column(name="brand_code_col")
	private String brandCode;
	@Column(name="brand_tagline_col")
	private String brandTagLine;
	@Column(name="brand_imagelink_col")
	private String brandImageLink;
	@Column(name="brand_note_col")
	private String brandNote;
}
