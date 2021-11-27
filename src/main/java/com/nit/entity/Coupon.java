package com.nit.entity;

import java.util.Date;

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
public class Coupon {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="coupon_id_col")
	private Long id;
	@Column(name="coupon_code_col")
	private String couponCode;
	@Column(name="coupon_note_col")
	private String couponNote;
	@Column(name="coupon_percentage_col")
	private Integer couponPercentage;
	@Column(name="coupon_available_col")
	private String couponAvailable;
	@Column(name="coupon_expdate_col")
	private Date couponExpDate;
	@Column(name="coupon_total_allowed_col")
	private Integer totalAllowed;
}
