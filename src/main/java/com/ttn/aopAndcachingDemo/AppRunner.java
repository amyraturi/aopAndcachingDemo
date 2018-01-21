package com.ttn.aopAndcachingDemo;

import com.ttn.aopAndcachingDemo.entity.Employee;
import com.ttn.aopAndcachingDemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.support.SimpleValueWrapper;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner {
    @Autowired
    EmployeeService employeeService;
    @Autowired
    CacheManager cacheManager;
    @Override
    public void run(String... args) throws Exception {
        Employee employee=new Employee();
        employee.setCode("2222");
        employee.setDesignation("software Engineer");
        employee.setEmail("amit.raturi@gmail.com");
        employee.setName("Amit Raturi");
        employeeService.prepareCache(employee);
        Cache cache=cacheManager.getCache("employee");
        SimpleValueWrapper valueWrapper = (SimpleValueWrapper) cache.get("amit.raturi@gmail.com");
        Employee employee1= (Employee) valueWrapper.get();
        System.out.println(employee1.getEmail());
        employeeService.serve();
        }

}
