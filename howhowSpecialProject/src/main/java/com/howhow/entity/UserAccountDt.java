package com.howhow.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity @Table(name="useraccountdt")
@Component
public class UserAccountDt {
	
	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name="property", value="userAccountMt"))
	@Id
	@Column(name="UserID")
	@GeneratedValue(generator = "generator")
	private int userId;
	
	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name="property" , value="userAccountMt"))
	@Column(name="ACCOUNT", unique = true)
	private String Account;
	
	@Column(name="Email", unique=true)
	private String email;
	
	@Column(name="GivenName")
	private String givenName;
	
	@Column(name="FamilyName")
	private String familyName;
	
	@Column(name="Gender")
	private String gender;
	
	@Column(name = "BIRTH")
	@JsonFormat(pattern="yyyy-MM-dd", timezone = "GMT+8")
	private String Birth;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@Column(name = "AccountCreationTime")
	private java.util.Date acountCreationTime;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@Column(name = "SYSTEMTIME")
	private java.util.Date SystemTime;
	
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	private UserAccountMt userAccountMt;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getAccount() {
		return Account;
	}

	public void setAccount(String account) {
		Account = account;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirth() {
		return Birth;
	}

	public void setBirth(String birth) {
		Birth = birth;
	}

	public java.util.Date getAcountCreationTime() {
		return acountCreationTime;
	}

	public void setAcountCreationTime(java.util.Date acountCreationTime) {
		this.acountCreationTime = acountCreationTime;
	}

	public java.util.Date getSystemTime() {
		return SystemTime;
	}

	public void setSystemTime(java.util.Date systemTime) {
		SystemTime = systemTime;
	}

	public UserAccountMt getUserAccountMt() {
		return userAccountMt;
	}

	public void setUserAccountMt(UserAccountMt userAccountMt) {
		this.userAccountMt = userAccountMt;
	}
	
	
	
}