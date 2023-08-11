package com.musta.demo.Student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public interface StudentService {

    public List<Student> findAllStudents();

    public  Student save(Student s);
     public  Student findByEmail(String email);

     public  Student update(Student s);
     void  delete(String email);


}
