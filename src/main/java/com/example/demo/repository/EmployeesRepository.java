package com.example.demo.repository;

import com.example.demo.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.io.Serializable;
import java.util.List;

public interface EmployeesRepository extends MongoRepository<Employee, Serializable> {

    @Query("{'id' : ?0}")
    Employee findEmployeeById(Long id);

    @Query("{'jobId' : ?0}")
    List<Employee> findEmployeesByJobID(Long jobId);

}

