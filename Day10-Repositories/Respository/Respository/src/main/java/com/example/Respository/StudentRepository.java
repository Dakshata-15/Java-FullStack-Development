package com.example.Respository;
import java.util.*;

public class StudentRepository {
    private final List<Student> students = new ArrayList<>();
    public List<Student> findAll(){
        return students;
    }
    public void save(Student s){
        students.add(s);
    }
}
