package com.example;

import java.util.List;

public interface Repository {
    public List<Employee> readEmployee(); 
    public Employee createEmployee(Employee employee);
}
