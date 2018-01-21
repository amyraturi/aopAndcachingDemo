package com.ttn.aopAndcachingDemo;

import com.ttn.aopAndcachingDemo.entity.Employee;
import com.ttn.aopAndcachingDemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;

import javax.annotation.PostConstruct;


@SpringBootApplication
@EnableCaching
public class AopAndcachingDemoApplication {


	public static void main(String[] args)
	{
		SpringApplication.run(AopAndcachingDemoApplication.class, args);
	}
}
