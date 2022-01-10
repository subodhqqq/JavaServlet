package com.example.stydent.Service;

import com.example.stydent.Studentrepo.Studentrepo;
import com.example.stydent.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    Studentrepo studentrepo;
    public void saveStudent(Student student){
        studentrepo.save(student);
    }

    public List<Student> getAllStudent(){
        return studentrepo.findAll();
    }

    public Student getByid(int id){
        return studentrepo.findById(id).orElse(null);
    }
    public void deleteById(int id){
        studentrepo.deleteById(id);
    }
}
