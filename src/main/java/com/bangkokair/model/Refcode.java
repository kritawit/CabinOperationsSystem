package com.bangkokair.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "RECODE")
public class Refcode implements Serializable {

	private static final long serialVersionUID = 5173386646014991473L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "RCIDX", nullable = false)
	private Integer rcidx;

	@Column(name = "R_NAME", nullable = false)
	private String r_name;

	@Column(name = "R_CODE", nullable = false)
	private String e_code;

	@Column(name = "R_DESC", nullable = false)
	private String r_desc;

	@Column(name = "R_VALUE_I1")
	private Integer r_value_i1;

	@Column(name = "R_VALUE_I2")
	private Integer r_value_i2;

	@Column(name = "R_VALUE_I3")
	private Integer r_value_i3;

	@Column(name = "R_VALUE_M1")
	private BigDecimal r_value_m1;

	@Column(name = "R_VALUE_M2")
	private BigDecimal r_value_m2;

	@Column(name = "R_VALUE_M3")
	private BigDecimal r_value_m3;

	@Column(name = "CREATED_BY", nullable = false)
	private Integer created_by;

	@Column(name = "UPDATED_BY")
	private Integer updated_by;

	@Column(name = "CREATED_AT", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date created_at = new Date();

	@Column(name = "UPDATED_AT", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date updated_at = new Date();

	@Column(name = "DATA_LEVEL", nullable = false)
	private Integer data_level;

	@Column(name = "ACTIVE", nullable = false)
	private Integer active;

	public Integer getRcidx() {
		return rcidx;
	}

	public void setRcidx(Integer rcidx) {
		this.rcidx = rcidx;
	}

	public String getR_name() {
		return r_name;
	}

	public void setR_name(String r_name) {
		this.r_name = r_name;
	}

	public String getE_code() {
		return e_code;
	}

	public void setE_code(String e_code) {
		this.e_code = e_code;
	}

	public String getR_desc() {
		return r_desc;
	}

	public void setR_desc(String r_desc) {
		this.r_desc = r_desc;
	}

	public Integer getR_value_i1() {
		return r_value_i1;
	}

	public void setR_value_i1(Integer r_value_i1) {
		this.r_value_i1 = r_value_i1;
	}

	public Integer getR_value_i2() {
		return r_value_i2;
	}

	public void setR_value_i2(Integer r_value_i2) {
		this.r_value_i2 = r_value_i2;
	}

	public Integer getR_value_i3() {
		return r_value_i3;
	}

	public void setR_value_i3(Integer r_value_i3) {
		this.r_value_i3 = r_value_i3;
	}

	public BigDecimal getR_value_m1() {
		return r_value_m1;
	}

	public void setR_value_m1(BigDecimal r_value_m1) {
		this.r_value_m1 = r_value_m1;
	}

	public BigDecimal getR_value_m2() {
		return r_value_m2;
	}

	public void setR_value_m2(BigDecimal r_value_m2) {
		this.r_value_m2 = r_value_m2;
	}

	public BigDecimal getR_value_m3() {
		return r_value_m3;
	}

	public void setR_value_m3(BigDecimal r_value_m3) {
		this.r_value_m3 = r_value_m3;
	}

	public Integer getCreated_by() {
		return created_by;
	}

	public void setCreated_by(Integer created_by) {
		this.created_by = created_by;
	}

	public Integer getUpdated_by() {
		return updated_by;
	}

	public void setUpdated_by(Integer updated_by) {
		this.updated_by = updated_by;
	}

	public Date getCreated_at() {
		return created_at;
	}

	@PrePersist
	public void setCreated_at(Date created_at) {
		this.created_at = new Date();
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	@PreUpdate
	public void setUpdated_at(Date updated_at) {
		this.updated_at = new Date();
	}

	public Integer getData_level() {
		return data_level;
	}

	public void setData_level(Integer data_level) {
		this.data_level = data_level;
	}

	public Integer getActive() {
		return active;
	}

	public void setActive(Integer active) {
		this.active = active;
	}

}
