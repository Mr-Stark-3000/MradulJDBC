package com.jdbc.dao;

import java.util.List;

import com.jdbc.entity.Employee;

public interface EmployeeDao {

	public void insertEmp(Employee e);

	public void updateEmp(Employee e);

	public void deleteEmp(int id);

	public void getEmpById(int id);

	public void getAllEmps();
	public List<Employee> getAllEmpRecords();

}
