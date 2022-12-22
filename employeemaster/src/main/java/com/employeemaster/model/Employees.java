package com.employeemaster.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Employees {


	@Id
	@Column 
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long lngUserId;
	@Column
	private String strFirstName;
	@Column
	private String strLastName;
	@Column
	private String strMobileNo;
	@Column
	private String strAddress;
	@Column
	private String strDepartment;
	
	public long getLngUserId() {
		return lngUserId;
	}
	public void setLngUserId(long lngUserId) {
		this.lngUserId = lngUserId;
	}
	public String getStrFirstName() {
		return strFirstName;
	}
	public void setStrFirstName(String strFirstName) {
		this.strFirstName = strFirstName;
	}
	public String getStrLastName() {
		return strLastName;
	}
	public void setStrLastName(String strLastName) {
		this.strLastName = strLastName;
	}
	public String getStrMobileNo() {
		return strMobileNo;
	}
	public void setStrMobileNo(String strMobileNo) {
		this.strMobileNo = strMobileNo;
	}
	public String getStrAddress() {
		return strAddress;
	}
	public void setStrAddress(String strAddress) {
		this.strAddress = strAddress;
	}
	public String getStrDepartment() {
		return strDepartment;
	}
	public void setStrDepartment(String strDepartment) {
		this.strDepartment = strDepartment;
	}
	
}
