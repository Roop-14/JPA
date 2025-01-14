package com.roop.EmployeeRepo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.roop.EmployeeInfo.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer>{
	
	List<Employee> findByEmpsal(int salary);
	List<Employee> findByEmpjob(String job);//property name=empjob

}
