package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("employees")
public class Employee {

    @Transient
    public static final String SEQUENCE_NAME = "employee_sequence";

    @Id
    private Long id ;

    private String firstName;
    private String lastName;
    private String hireDate;
    private String jobName;
    private String JobId;

}
