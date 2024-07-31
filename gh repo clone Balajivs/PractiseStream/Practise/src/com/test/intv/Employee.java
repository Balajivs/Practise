package com.test.intv;

import java.time.LocalDate;

public class Employee {
    private String name;
    private double salary;
    private LocalDate birthDate;

    public Employee(String name, double salary, LocalDate birthDate) {
        this.name = name;
        this.salary = salary;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", birthDate=" + birthDate +
                '}';
    }
}
