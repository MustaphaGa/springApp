package com.musta.demo.Student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> findAllStudents(){
        return  List.of(
                new Student(
                        "musta",
                        "tizi",
                        LocalDate.now(),
                        24,
                        "musta@gmail.com"
                ),
                new Student(
                        "musta2",
                        "tizi2",
                        LocalDate.now(),
                        34,
                        "musta2@gmail.com"
                )

        );
    }
}
