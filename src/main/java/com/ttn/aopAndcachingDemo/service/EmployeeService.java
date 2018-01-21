package com.ttn.aopAndcachingDemo.service;

import com.ttn.aopAndcachingDemo.LogExecutionTime;
import com.ttn.aopAndcachingDemo.entity.Employee;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Cacheable(value = "employee", key = "#employee.email")
    public Employee prepareCache(Employee employee) {
        return employee;
    }


    @LogExecutionTime
    public void serve() throws InterruptedException {
        Thread.sleep(2000);
    }
}
