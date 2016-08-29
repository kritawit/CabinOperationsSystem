package com.bangkokair.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name = "CABINCREW")
public class CabinCrew implements Serializable {

	private static final long serialVersionUID = -2465254357063019792L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CCIDX", nullable = false)
	private Integer ccidx;

	@Column(name = "ID_EMP", nullable = false)
	private Integer id_emp;

	@Column(name = "ID_CARD", nullable = false, length = 13)
	private Integer id_card;

	@Column(name = "ID_PASSPROT")
	private Integer id_passport;

	@Column(name = "PASSPORT_EXP")
	@Temporal(TemporalType.DATE)
	private Date passport_exp;

	@Column(name = "USERNAME", nullable = false, length = 45)
	private String username;

	@Column(name = "PASSWORD", nullable = false)
	private String password;

	@Column(name = "FIRSTNAME_EN", nullable = false, length = 45)
	private String firstname_en;

	@Column(name = "LASTNAME_EN", nullable = false, length = 45)
	private String lastname_en;

	@Column(name = "FIRSTNAME_TH", nullable = false, length = 45)
	private String firstname_th;

	@Column(name = "LASTNAME_TH", nullable = false, length = 45)
	private String lastname_th;

	@Column(name = "NICKNAME", nullable = false, length = 45)
	private String nickname;

	@Column(name = "TITLE", nullable = false, length = 45)
	private String title;

	@Column(name = "GENDER", nullable = false, length = 45)
	private String gender;

	@Column(name = "BIRTH_DATE", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date birth_date;

	@Column(name = "NATIONALITY", nullable = false, length = 100)
	private String nationality;

	@Column(name = "RACE", nullable = false, length = 100)
	private String race;

	@Column(name = "RELIGION", nullable = false, length = 100)
	private String religion;

	@Column(name = "POSITION1")
	private Integer position1;

	@Column(name = "POSITION2")
	private Integer position2;

	@Column(name = "POSITION3")
	private Integer position3;

	@Column(name = "BATCH_NUM", nullable = false)
	private Integer batch_num;

	@Column(name = "BATCH_YEAR", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date batch_year;

	@Column(name = "BANK_ID")
	private Integer bank_id;

	@Column(name = "EMAIL", length = 45)
	private String email;

	@Column(name = "TEL", length = 45)
	private String tel;

	@Column(name = "FAX", length = 45)
	private String fax;

	@Column(name = "MOBILE1", length = 45)
	private String mobile1;

	@Column(name = "MOBILE2", length = 45)
	private String mobile2;

	@Column(name = "ADDRESS", nullable = false)
	private String address;

	@Column(name = "CITY", nullable = false, length = 45)
	private String city;

	@Column(name = "COUNTRY", nullable = false, length = 45)
	private String country;

	@Column(name = "ZIPCODE", nullable = false, length = 10)
	private String zipcode;

	@Column(name = "JOIN_DATE", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date join_date;

	@Column(name = "OUT_DATE")
	@Temporal(TemporalType.DATE)
	private Date out_date;

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

	@NotEmpty
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "CABINCREW_AUTHORITIES", joinColumns = { @JoinColumn(name = "CCIDX") }, inverseJoinColumns = {
			@JoinColumn(name = "AUTHIDX") })
	private Set<Authorities> authorities = new HashSet<Authorities>();

	@Transient
	private MultipartFile cabincrewpicture;

	public Integer getCcidx() {
		return ccidx;
	}

	public void setCcidx(Integer ccidx) {
		this.ccidx = ccidx;
	}

	public Integer getId_emp() {
		return id_emp;
	}

	public void setId_emp(Integer id_emp) {
		this.id_emp = id_emp;
	}

	public Integer getId_card() {
		return id_card;
	}

	public void setId_card(Integer id_card) {
		this.id_card = id_card;
	}

	public Integer getId_passport() {
		return id_passport;
	}

	public void setId_passport(Integer id_passport) {
		this.id_passport = id_passport;
	}

	public Date getPassport_exp() {
		return passport_exp;
	}

	public void setPassport_exp(Date passport_exp) {
		this.passport_exp = passport_exp;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstname_en() {
		return firstname_en;
	}

	public void setFirstname_en(String firstname_en) {
		this.firstname_en = firstname_en;
	}

	public String getLastname_en() {
		return lastname_en;
	}

	public void setLastname_en(String lastname_en) {
		this.lastname_en = lastname_en;
	}

	public String getFirstname_th() {
		return firstname_th;
	}

	public void setFirstname_th(String firstname_th) {
		this.firstname_th = firstname_th;
	}

	public String getLastname_th() {
		return lastname_th;
	}

	public void setLastname_th(String lastname_th) {
		this.lastname_th = lastname_th;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(Date birth_date) {
		this.birth_date = birth_date;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public Integer getPosition1() {
		return position1;
	}

	public void setPosition1(Integer position1) {
		this.position1 = position1;
	}

	public Integer getPosition2() {
		return position2;
	}

	public void setPosition2(Integer position2) {
		this.position2 = position2;
	}

	public Integer getPosition3() {
		return position3;
	}

	public void setPosition3(Integer position3) {
		this.position3 = position3;
	}

	public Integer getBatch_num() {
		return batch_num;
	}

	public void setBatch_num(Integer batch_num) {
		this.batch_num = batch_num;
	}

	public Date getBatch_year() {
		return batch_year;
	}

	public void setBatch_year(Date batch_year) {
		this.batch_year = batch_year;
	}

	public Integer getBank_id() {
		return bank_id;
	}

	public void setBank_id(Integer bank_id) {
		this.bank_id = bank_id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getMobile1() {
		return mobile1;
	}

	public void setMobile1(String mobile1) {
		this.mobile1 = mobile1;
	}

	public String getMobile2() {
		return mobile2;
	}

	public void setMobile2(String mobile2) {
		this.mobile2 = mobile2;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public Date getJoin_date() {
		return join_date;
	}

	public void setJoin_date(Date join_date) {
		this.join_date = join_date;
	}

	public Date getOut_date() {
		return out_date;
	}

	public void setOut_date(Date out_date) {
		this.out_date = out_date;
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

	public Integer getActive() {
		return active;
	}

	public void setActive(Integer active) {
		this.active = active;
	}

	public Set<Authorities> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(Set<Authorities> authorities) {
		this.authorities = authorities;
	}

	public MultipartFile getCabincrewpicture() {
		return cabincrewpicture;
	}

	public void setCabincrewpicture(MultipartFile cabincrewpicture) {
		this.cabincrewpicture = cabincrewpicture;
	}

}