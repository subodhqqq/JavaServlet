package com.example.demo.Service;

import com.example.demo.EmployeeRepo.EmpolyeRepo;
import com.example.demo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Subodh on 07/01/2022.
 */
@Service
public class EmplyeeService {
    @Autowired
   EmpolyeRepo empolyeRepo;

    public Employee saveEmployee(Employee employee)
    {
        return empolyeRepo.save(employee);
    }

    public List<Employee> saveEmployes(List<Employee> employee){
        return empolyeRepo.saveAll(employee);
    }

    public Employee serchByid(int id){
        return empolyeRepo.findById(id).orElse(null);
    }

    public  Employee getbyAddress(String address){
        return empolyeRepo. serchAddress(address);
    }

    public String deletebyid(int id){
        empolyeRepo.deleteById(id);
        return  "Delete success" +id;
    }

    public Employee updateEmployee(Employee employee){
        Employee employee1=empolyeRepo.findById(employee.getId()).orElse(null);
        employee1.setName(employee.getName());
        employee1.setAddress(employee.getAddress());
        return empolyeRepo.save(employee1);


    }
}
