package com.test.vimp;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;


public class Main {
    public static void main(String[] args) {

        List<Empl> employeeList = new ArrayList<>();
        employeeList.add(new Empl("Alice", 50000));
        employeeList.add(new Empl("Bob", 60000));
        employeeList.add(new Empl("Charlie", 55000));

        employeeList.sort(Comparator.comparingDouble(Empl::getSalary));

        // Print the sorted employee list
        for (Empl employee : employeeList) {
            System.out.println("Name: " + employee.getName() + ", Salary: " + employee.getSalary());
        }
    }
}
