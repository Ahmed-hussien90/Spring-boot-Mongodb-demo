package com.example.demo.repository;

import com.example.demo.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.io.Serializable;
import java.util.List;

public interface EmployeesRepository extends MongoRepository<Employee, Serializable> {

    Employee findEmployeeById(Long id);

    List<Employee> findEmployeesByJobIdEquals(Long jobId);

    Employee deleteEmployeeById(Long id);


}

