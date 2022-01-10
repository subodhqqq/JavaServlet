package com.example.demo.Service;

import com.example.demo.StudentRepo.Studentrepo;
import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Subodh on 09/01/2022.
 */
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
