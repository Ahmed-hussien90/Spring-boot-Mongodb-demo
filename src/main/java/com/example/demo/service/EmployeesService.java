package com.example.demo.service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;
import java.util.List;

@Service
public class EmployeesService {

    @Autowired
    private EmployeesRepository EmployeeRep;
    @Autowired
    private SequenceGeneratorService sequenceGeneratorService;


    public List<Employee> getAllEmployees(){
       return EmployeeRep.findAll();
    }

    public Employee getEmployeeById(Long id){
        return EmployeeRep.findEmployeeById(id);
    }

    public List<Employee> getEmployeeByJobId(Long jobId){
        return EmployeeRep.findEmployeesByJobIdEquals(jobId);
    }

    public Employee addEmployee(Employee employee){
        if (employee == null) {
            return null;
        }
        employee.setId(sequenceGeneratorService.generateSequence(Employee.SEQUENCE_NAME));
        return EmployeeRep.insert(employee);
    }

    public Employee deleteEmployeeById(Long id){
        return EmployeeRep.deleteEmployeeById(id);
    }



}
