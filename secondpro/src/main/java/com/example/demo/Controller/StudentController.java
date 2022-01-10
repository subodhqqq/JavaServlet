package com.example.demo.Controller;

import com.example.demo.Service.StudentService;
import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Subodh on 09/01/2022.
 */
@Controller
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/")
    public String homePage(Model model){


        List<Student> lisOfStudents=studentService.getAllStudent();
       // model.addAttribute("lisOfStudents",lisOfStudents);
        model.addAttribute("list", lisOfStudents);
        return "index";
    }

//    @RequestMapping("/add/new")
//    public  String newPage(){
//
//        return "new";
//
//
//
//}
//    @GetMapping("/user")
//    public  String addUser(Model model){
//        Student student=new Student();
//        model.addAttribute("student",student);
//
//        return "new";
//
//    }

}
