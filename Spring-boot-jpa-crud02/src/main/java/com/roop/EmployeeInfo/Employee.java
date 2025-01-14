package com.roop.EmployeeInfo;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Employee")
public class Employee {
	
	
	@Id
	private int empid;
	private String empname;
	private String empjob;
	private int empsal;
	private LocalDate hiredate;
	private int dno;
	
	

}
