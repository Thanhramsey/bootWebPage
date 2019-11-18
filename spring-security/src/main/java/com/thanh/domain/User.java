package com.thanh.domain;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private int id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name="last_name")
	private String lastName;

	@Column(name="register_name")
	private String registerName;

	@Column(name="password")
	private String password;

	@Column(name="email")
	private String email;

	@Column(name="date_of_birth")
	private Date dateOfBirth;

	@Column(name="phone")
	private String phone;

	@Column(name="address")
	private String address;



	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getRegisterName() {
		return registerName;
	}

	public void setRegisterName(String registerName) {
		this.registerName = registerName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public User(String firstName, String lastName, String registerName, String password, String email, Date dateOfBirth, String phone, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.registerName = registerName;
		this.password = password;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.phone = phone;
		this.address = address;
	}

	public User(){}
}
