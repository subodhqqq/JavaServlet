package com.example.stydent.Controller;

import com.example.stydent.Service.StudentService;
import com.example.stydent.config.WebSecurity;
import com.example.stydent.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    StudentService studentService;
    @Autowired
    WebSecurity webSecurity;
    @Autowired
    BCryptPasswordEncoder PasswordHasing;

    @GetMapping("/")
    public String homePage(Model model){

        List<Student> listOfStudents=studentService.getAllStudent();
        //model.addAttribute("lisOfStudents",lisOfStudents);
        model.addAttribute("list", listOfStudents);
        return "index";
    }

        @RequestMapping("/new")
    public  String addUser(Model model){
        Student student=new Student();
        model.addAttribute("student",student);

        return "new";


}
//    @GetMapping("/user")
//    public  String addUser(Model model){
//        Student student=new Student();
//        model.addAttribute("student",student);
//
//        return "new";
//
//

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String saveStudent(@ModelAttribute("student") Student student){
        String password=student.getPassword();
        String encyptPassword=PasswordHasing.encode(password);
        student.setPassword(encyptPassword);
         studentService.saveStudent(student);
         return "redirect:/";

    }
    @RequestMapping(value = "/edit/{id}")
    public ModelAndView editStudent(@PathVariable(name = "id") int id){
        ModelAndView modelAndView=new ModelAndView("new");
        Student student=studentService.getByid(id);
        modelAndView.addObject("student",student);
        return modelAndView;


    }
    @RequestMapping(value = "/delete/{id}")
    public String deleteStudent(@PathVariable(name="id") int id) {//payhveroiable
      studentService.deleteById(id);
      return "redirect:/";
    }



}
