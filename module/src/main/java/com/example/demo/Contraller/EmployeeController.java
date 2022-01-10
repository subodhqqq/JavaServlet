package com.example.demo.Contraller;

import com.example.demo.Service.EmplyeeService;
import com.example.demo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Subodh on 07/01/2022.
 */
@RestController
public class EmployeeController {


    @Autowired
    EmplyeeService emplyeeService;

    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee employee)
    {
        return emplyeeService.saveEmployee(employee);
    }

    @PostMapping("/AddList")
    public List<Employee> addEmployees(@RequestBody List<Employee> employeelist)
    {
        return emplyeeService.saveEmployes(employeelist);
    }

@GetMapping("/indEmployee/(id)")
    public Employee findEmployeeById(@PathVariable int id){
        return emplyeeService.serchByid(id);
}
}
