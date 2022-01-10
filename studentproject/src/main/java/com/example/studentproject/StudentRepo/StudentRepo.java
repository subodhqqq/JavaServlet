package com.example.studentproject.StudentRepo;

import com.example.studentproject.model.Student;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaAttributeConverter<Student,Integer> {
}
