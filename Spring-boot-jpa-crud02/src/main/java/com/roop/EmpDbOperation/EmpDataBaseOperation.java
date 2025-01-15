package com.roop.EmpDbOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.roop.EmployeeInfo.Employee;
import com.roop.EmployeeRepo.EmpRepo;

@Component
public class EmpDataBaseOperation {
	
	@Autowired
	EmpRepo empRepo;
	
	public void empInsertAllOperation() {
		 // Create a list of employees
       List<Employee> employees=new ArrayList<>();
        employees.add(new Employee(1, "Arjun Kumar", "Developer", 80000, LocalDate.of(2022, 5, 1), 10));
        employees.add(new Employee(2, "Meera Nair", "Analyst", 60000, LocalDate.of(2021, 6, 15), 20));
        employees.add(new Employee(3, "Ravi Sharma", "Tester", 50000, LocalDate.of(2023, 1, 10), 30));
        employees.add(new Employee(4, "Sunita Desai", "Manager", 90000, LocalDate.of(2019, 3, 25), 40));
        employees.add(new Employee(5, "Rajesh Gupta", "HR", 70000, LocalDate.of(2020, 8, 30), 50));
        employees.add(new Employee(6, "Pooja Iyer", "Designer", 60000, LocalDate.of(2021, 12, 5), 10));
        employees.add(new Employee(7, "Vikram Singh", "Consultant", 75000, LocalDate.of(2022, 7, 18), 20));
        employees.add(new Employee(8, "Sneha Patel", "Support", 40000, LocalDate.of(2023, 2, 12), 30));
        employees.add(new Employee(9, "Amit Verma", "Admin", 55000, LocalDate.of(2021, 11, 20), 40));
        employees.add(new Employee(10, "Kiran Rao", "Lead", 85000, LocalDate.of(2018, 4, 15), 50));
        
        empRepo.saveAll(employees);
	}
	
	public void getEmployeeInfoById() {
	Optional<Employee> optional	=empRepo.findById(101);
	
	if(optional.isPresent()) {
	Employee employee=optional.get();
	System.out.println(employee);
	}else {
		System.out.println("not available");
	}
		
	}
	public void getEmployeeBySalary(int sal) {
		
	List<Employee> empSalary=empRepo.findByEmpsal(sal);
	empSalary.forEach(System.out::println);
	
	}
	
	public void getEmployeeByJob(String jobTitle) {
	List<Employee> job	=empRepo.findByEmpjob(jobTitle);
	job.forEach(System.out::println);
	}
	public void getEmployeeByJobAndSalary(String jobTitle,int salary) {
	List<Employee> jobandsal	   =empRepo.findByEmpjobAndEmpsalGreaterThan(jobTitle, salary);
	jobandsal.forEach(System.out::println);
	}
	

}
