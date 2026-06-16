package com.example.FullStackProject;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "courses")
@Data
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id")
    private int id;

    @Column(name = "course_name", nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "student_id", referencedColumnName = "student_id")
    @JsonBackReference
    private Student student;
}