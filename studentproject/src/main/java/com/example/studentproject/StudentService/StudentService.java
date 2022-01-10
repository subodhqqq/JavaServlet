package com.example.studentproject.StudentService;

import com.example.studentproject.StudentRepo.StudentRepo;
import com.example.studentproject.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepo studentRepo;
    public void saveStudent(Student student){
        studentRepo.save(student);
    }

    public List<Student> getAllStudent(){
        return studentRepo.findAll();
    }

    public Student getByid(int id){
        return studentRepo.findById(id).orElse(null);
    }
    public void deleteById(int id){
        studentRepo.deleteById(id);
    }
}
