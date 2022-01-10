package com.example.demo.EmployeeRepo;

import com.example.demo.model.Employee;
import org.apache.catalina.startup.ClassLoaderFactory;
import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Created by Subodh on 07/01/2022.
 */
@Repository
public interface EmpolyeRepo extends JpaRepository<Employee,Integer> {

     Employee serchAddress(String address);


    }

