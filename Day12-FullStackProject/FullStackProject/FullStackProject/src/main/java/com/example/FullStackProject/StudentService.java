package com.example.FullStackProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repo;

    //while posting the values in the postman
    public Student save(Student s){
        return repo.save(s);
    }

    //while using get in the postman
    public List<Student> all(){
        return repo.findAll();
    }
}
