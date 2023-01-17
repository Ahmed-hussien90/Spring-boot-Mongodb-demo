package com.example.demo.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class EmployeeController {

    @GetMapping("/employee")
    public String getEmployees(){
        return "employees";
    }


    @PostMapping("/employeebody/")
    public String getEmployees(@RequestHeader("Content-Type") String ContentType){
        return ContentType;
    }

}
