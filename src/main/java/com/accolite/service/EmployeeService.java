package com.accolite.service;

import com.accolite.model.Employee;

import java.util.*;

public interface EmployeeService {

//  How many male and female employees are there in the organization?
    Map<String, Long> findMaleAndFemale(List<Employee> employeeList);

//  Print the name of all departments in the organization?
    Set<String> findAllDepartment(List<Employee> employeeList);

//  What is the average age of male and female employees?
    Map<String,Double> findAverageOfMaleAndFemaleEmployee(List<Employee> employeeList);

//  Get the details of highest paid employee in the organization?
    Optional<Employee> findHighestPaidEmployee(List<Employee> employeeList);

//  Get the names of all employees who have joined after 2015?
    List<Employee> findAllEmployeeJoiningDate(List<Employee> employeeList, Integer year);

//  Count the number of employees in each department?
    Map<String,Long> findNumberOfEmployeeDepart(List<Employee> employeeList);

//  What is the average salary of each department?
    Map<String,Double> findAverageSalaryPerDepart(List<Employee> employeeList);

//  Get the details of Youngest male employee in the product development department?
    Optional<Employee> findEmployeePerDepart(List<Employee> employeeList);

//  Who has the most working experience in the organization?
    Optional<Employee> findHighestExp(List<Employee> employeeList);

//  How many male and female employees are there in the sales and marketing team?
    Map<String, Long> findMaleAndFemalePerDepart(List<Employee> employeeList);

//  What is the average salary of male and female employees?
    Map<String,Double> findAverageSalary(List<Employee> employeeList);

//  List down the names of all employees in each department?
    Map<String, List<Employee>> findEmployeesPerDepart(List<Employee> employeeList);

//  What is the average salary and total salary of the whole organization?
    DoubleSummaryStatistics findAverageAndOverallSalaryOfWholeOrganization(List<Employee> employeeList);

//  Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
    Map<Boolean, List<Employee>> categoriesEmployeesPerAge(List<Employee> employeeList);

//  Who is the oldest employee in the organization? What is his age and which department he belongs to?
    Optional<Employee> findOldestEmployee(List<Employee> employeeList);


}
