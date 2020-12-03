package com.app.pages;

import java.util.List;

import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.hibernate.annotations.CommitAfter;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.hibernate.Session;

import com.app.model.EmployeeEntity;

public class Employee {

	@Property
	private EmployeeEntity employee;

	@Inject
	private Session session;

	@SuppressWarnings("unchecked")
	public List<EmployeeEntity> getEmployees() {
		System.out.println(session.createCriteria(EmployeeEntity.class).list());
		return session.createCriteria(EmployeeEntity.class).list();
	}

	@CommitAfter
	void onSuccess() {
		session.persist(employee);
	}

}
