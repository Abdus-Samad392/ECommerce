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
public class CategoryType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="categorytype_id_col")
	private Long id;
	@Column(name="categorytype_name_col")
	private String name;
	@Column(name="categorytype_note_col")
	private String note;
}
