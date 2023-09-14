package com.service;

import com.pojo.Student;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by auth
 * 2023/7/3 18:55
 */
@Service
public interface StudentService {
    List<Student> findStudent(Integer page,Integer pageSize);
    void deleteStudent(Integer id);
    Student findById(Integer id);
    Integer updateStudent(Student student);
    Integer countStudent();
}
