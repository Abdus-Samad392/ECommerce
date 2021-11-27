package com.nit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.nit.constants.UserRoles;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id_col")
	private Long id;
	
	@Column(name = "user_name_col", length = 30, nullable = false)
	private String userName;

	@Column(name = "user_password_col", nullable = false, unique = true)
	private String password;

	@Column(name = "user_role_col", nullable = false)
	@Enumerated(EnumType.STRING)
	private UserRoles role;

	@Column(name = "user_mobileNo_col", nullable = false, unique = true)
	private Long mobileNo;
	
	@Column(name = "user_address_col", nullable = false)
	private String address;
	
	@Column(name = "user_status_col", nullable = false)
	private String status;

}
