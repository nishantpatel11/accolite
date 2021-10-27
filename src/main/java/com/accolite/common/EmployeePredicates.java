package com.accolite.common;

import com.accolite.model.Employee;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeePredicates{

    public static Predicate<Employee> isMale(){
        return p -> p.getGender().contains("m") || p.getGender().contains("M");
    }

    public static Predicate<Employee> isMaleAdult(){
        return p -> p.getAge() > 18 && p.getGender().contains("m") || p.getGender().contains("M");
    }

    public static Predicate<Employee> isFemale(){
        return p ->  p.getGender().contains("f") || p.getGender().contains("F");
    }

    public static Predicate<Employee> isFemaleAdult(){
        return p -> p.getAge() > 18 && ( p.getGender().contains("f") || p.getGender().contains("F") );
    }

    public static Predicate<Employee> isMoreThan(Integer age){
        return p -> p.getAge() > age;
    }

    public static List<Employee> filterEmployees(List<Employee> employees, Predicate<Employee> predicate ){
        return employees.stream().filter(predicate).collect(Collectors.toList()) ;
    }

}
