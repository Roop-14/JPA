package com.roop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.roop.EmpDbOperation.EmpDataBaseOperation;

@SpringBootApplication
public class SpringBootJpaCrud02Application {

	public static void main(String[] args) {
		
		
	ConfigurableApplicationContext applicationContext	=SpringApplication.run(SpringBootJpaCrud02Application.class, args);
	    EmpDataBaseOperation baseOperation =applicationContext.getBean(EmpDataBaseOperation.class);
	  //  baseOperation.empInsertAllOperation();
	   // baseOperation.getEmployeeInfoById();
	    
	 //   baseOperation.getEmployeeBySalary(40000);
	   // baseOperation.getEmployeeByJob("Designer");
	    baseOperation.getEmployeeByJobAndSalary("Developer", 40000);
	}

}
