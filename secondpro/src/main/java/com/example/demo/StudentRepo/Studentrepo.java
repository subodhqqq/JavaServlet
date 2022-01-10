package com.example.demo.StudentRepo;

import com.example.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Subodh on 09/01/2022.
 */
@Repository
public interface Studentrepo extends JpaRepository<Student,Integer > {
}
