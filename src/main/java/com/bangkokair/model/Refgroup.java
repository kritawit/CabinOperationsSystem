package com.bangkokair.model;

import java.io.Serializable;
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

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "REFGROUP")
public class Refgroup implements Serializable {

	private static final long serialVersionUID = -9116924069030383202L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "RGIDX", nullable = false)
	private Integer rgidx;

	@NotEmpty
	@Column(name = "RG_NAME", nullable = false)
	private String rg_name;

	@NotEmpty
	@Column(name = "RG_CODE", nullable = false)
	private String rg_code;

	@Column(name = "RG_VALUE")
	private Integer rg_value;

	@NotEmpty
	@Column(name = "RG_REMARK")
	private String rg_remark;

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

	public Integer getRgidx() {
		return rgidx;
	}

	public void setRgidx(Integer rgidx) {
		this.rgidx = rgidx;
	}

	public String getRg_name() {
		return rg_name;
	}

	public void setRg_name(String rg_name) {
		this.rg_name = rg_name;
	}

	public String getRg_code() {
		return rg_code;
	}

	public void setRg_code(String rg_code) {
		this.rg_code = rg_code;
	}

	public Integer getRg_value() {
		return rg_value;
	}

	public void setRg_value(Integer rg_value) {
		this.rg_value = rg_value;
	}

	public String getRg_remark() {
		return rg_remark;
	}

	public void setRg_remark(String rg_remark) {
		this.rg_remark = rg_remark;
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