package com.bangkokair.model;

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
@Table(name = "AUTHORITIES")
public class Authorities {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "AUTHIDX")
	private Integer authidx;

	@Column(name = "TYPE", length = 15, unique = true, nullable = false)
	private String type = AuthoritiesType.USER.getAuthoritiesType();

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

	@Column(name = "ACTIVE", nullable = false)
	private Integer active;

	public Integer getAuthidx() {
		return authidx;
	}

	public void setAuthidx(Integer authidx) {
		this.authidx = authidx;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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
		this.updated_at = updated_at;
	}

	public Integer getActive() {
		return active;
	}

	public void setActive(Integer active) {
		this.active = active;
	}

}