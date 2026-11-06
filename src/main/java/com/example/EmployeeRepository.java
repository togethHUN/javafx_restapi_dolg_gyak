package com.example;

import java.util.ArrayList;
import java.util.List;

import hu.szit.resclient.ResClient;
import hu.szit.resclient.ResConvert;

public class EmployeeRepository implements Repository{


    String host = "http://localhost:8000/api/employees";

    


    @Override
    public List<Employee> readEmployee() {
        String url = host;
        List<Employee> empList = new ArrayList();
        ResClient client = new ResClient();
        String result = client.get(url);
        EmployeeResult res = ResConvert.toObject(result, EmployeeResult.class);
        empList = res.data;
        return empList;
    }

    @Override
    public Employee createEmployee(Employee employee) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createEmployee'");
    }
    
}
