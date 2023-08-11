package com.musta.demo.Student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentServiceImlp implements  StudentService{


    private final StudentDao studentdao;

    public StudentServiceImlp(StudentDao studentdao) {
        this.studentdao = studentdao;
    }

    @Override
    public List<Student> findAllStudents(){
        return studentdao.findAllStudents();
    }

    @Override
    public Student save(Student s) {
        return studentdao.save(s);
    }

    @Override
    public Student findByEmail(String email) {
        return studentdao.findByEmail(email);
    }


    @Override
    public Student update(Student s) {
        return studentdao.update(s);
    }

    @Override
    public void delete(String email) {
studentdao.delete(email);
    }
}
