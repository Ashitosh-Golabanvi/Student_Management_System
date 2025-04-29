package com.example.student_management.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "students") // MongoDB annotation
public class Student {

    @Id
    private String id; // MongoDB uses String for ID by default

    private String name;
    private String email;
    private String course;
}
