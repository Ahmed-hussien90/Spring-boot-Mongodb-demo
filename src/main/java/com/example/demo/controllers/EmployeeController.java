package com.example.demo.controllers;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeesService EmployeeService;

    @GetMapping("/employees")
    public ResponseEntity<?> getEmployees() {
        return new ResponseEntity<>(EmployeeService.getAllEmployees(), HttpStatus.OK);
    }

    @PostMapping("/employees/{id}")
    public ResponseEntity<?> getEmployeeById(@PathVariable("id") String id) {
        return new ResponseEntity<>(EmployeeService.getEmployeeById(id), HttpStatus.OK);
    }

    @PostMapping("/employees-by-jobid/{id}")
    public ResponseEntity<?> getEmployeeByJobId(@PathVariable("id") String id) {
        return new ResponseEntity<>(EmployeeService.getEmployeeByJobId(id), HttpStatus.OK);
    }


}
