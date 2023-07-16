package com.example.springsimpleproject.service.impl;

import com.example.springsimpleproject.dao.InMemoryStudentDao;
import com.example.springsimpleproject.model.Student;
import com.example.springsimpleproject.service.StudentService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final InMemoryStudentDao inMemoryStudentDao;

    public StudentServiceImpl(InMemoryStudentDao inMemoryStudentDao) {
        this.inMemoryStudentDao = inMemoryStudentDao;
    }

    @Override
    public Student save(Student student) {
        return inMemoryStudentDao.save(student);
    }

    @Override
    public List<Student> getALlStudents() {
        return inMemoryStudentDao.getAllStudents();
    }

    @Override
    public Student getByEmail(String email) {
        return inMemoryStudentDao.getByEmail(email);
    }

    @Override
    public Student update(Student student) {
        return inMemoryStudentDao.update(student);
    }

    @Override
    public void delete(String email) {
        inMemoryStudentDao.delete(email);
    }
}
