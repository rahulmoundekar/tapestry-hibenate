package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.tapestry5.beaneditor.NonVisual;
import org.apache.tapestry5.beaneditor.Validate;

@Entity
@Table(name = "employee")
public class EmployeeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;

	@Validate("required")
	public String firstName;

	@Validate("required")
	public String lastName;

	@Validate("required")
	public String userName;

	@Validate("required")
	public String password;

	@Validate("required")
	public String email;

	@Validate("required")
	public String phone;

	@Validate("required")
	public String Street;

	@Validate("required")
	public String city;

	@Validate("required")
	public String state;

	@Validate("required")
	public String zip;

	@Validate("required")
	public String gender;

}
