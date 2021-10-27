package com.accolite.service.impl;

import com.accolite.model.Employee;
import com.accolite.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public Map<String, Long> findMaleAndFemale(List<Employee> employeeList) {
        return employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
    }

    @Override
    public Set<String> findAllDepartment(List<Employee> employeeList) {
        return employeeList.stream().map(Employee::getDepartment).collect(Collectors.toSet());
    }

    @Override
    public Map<String, Double> findAverageOfMaleAndFemaleEmployee(List<Employee> employeeList) {
        return employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
    }

    @Override
    public Optional<Employee> findHighestPaidEmployee(List<Employee> employeeList) {
        return employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
    }

    @Override
    public List<Employee> findAllEmployeeJoiningDate(List<Employee> employeeList, Integer year) {
        return employeeList.stream().filter(emp -> emp.getYearOfJoining() > year).collect(Collectors.toList());
    }

    @Override
    public Map<String, Long> findNumberOfEmployeeDepart(List<Employee> employeeList) {
        return employeeList.stream().collect(Collectors.groupingBy(Employee ::getDepartment,Collectors.counting()));
    }

    @Override
    public Map<String, Double> findAverageSalaryPerDepart(List<Employee> employeeList) {
        return employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
    }

    @Override
    public Optional<Employee> findEmployeePerDepart(List<Employee> employeeList) {
        return employeeList.stream().filter(emp -> emp.getGender() == "Male" && emp.getDepartment().equalsIgnoreCase("Product Development")).min(Comparator.comparingInt(Employee::getAge));
    }

    @Override
    public Optional<Employee> findHighestExp(List<Employee> employeeList) {
        return employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
    }

    @Override
    public Map<String, Long> findMaleAndFemalePerDepart(List<Employee> employeeList) {
        return employeeList.stream().filter(emp ->  emp.getDepartment().equalsIgnoreCase("Sales And Marketing")).collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
    }

    @Override
    public Map<String, Double> findAverageSalary(List<Employee> employeeList) {
        return employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
    }

    @Override
    public Map<String, List<Employee>> findEmployeesPerDepart(List<Employee> employeeList) {
        return employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
    }

    @Override
    public DoubleSummaryStatistics findAverageAndOverallSalaryOfWholeOrganization(List<Employee> employeeList) {
        return employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
    }

    @Override
    public Map<Boolean, List<Employee>> categoriesEmployeesPerAge(List<Employee> employeeList) {
        return employeeList.stream().collect(Collectors.partitioningBy(emp -> emp.getAge() > 25));
    }

    @Override
    public Optional<Employee> findOldestEmployee(List<Employee> employeeList) {
        return employeeList.stream().max(Comparator.comparingInt(Employee::getAge));
    }
}
