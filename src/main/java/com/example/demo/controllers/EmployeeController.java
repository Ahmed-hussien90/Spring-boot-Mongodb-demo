package com.example.demo.controllers;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class EmployeeController {

    @Autowired
    private EmployeesService EmployeeService;

    @GetMapping("/employees")
    public ResponseEntity<?> getEmployees() {
        return new ResponseEntity<>(EmployeeService.getAllEmployees(), HttpStatus.OK);
    }

    @GetMapping("/employees/{id}")
    public ResponseEntity<?> getEmployeeById(@PathVariable("id") Long id) {
        return new ResponseEntity<>(EmployeeService.getEmployeeById(id), HttpStatus.OK);
    }

    @GetMapping("/employees-by-job-id/{jobId}")
    public ResponseEntity<?> getEmployeeByJobId(@PathVariable("jobId") Long jobId) {
        return new ResponseEntity<>(EmployeeService.getEmployeeByJobId(jobId), HttpStatus.OK);
    }

    @PostMapping("/employees")
    public ResponseEntity<?> getEmployeeByJobId(@RequestBody Employee employee) {
        return new ResponseEntity<>(EmployeeService.addEmployee(employee), HttpStatus.OK);
    }

    @DeleteMapping("/employees/{id}")
    public ResponseEntity<?> deleteEmployeeByJobId(@PathVariable Long id) {
        return new ResponseEntity<>(EmployeeService.deleteEmployeeById(id), HttpStatus.OK);
    }


}
