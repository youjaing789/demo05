package com.mapper;

import com.pojo.Student;
import java.util.List;

/**
 * Created by auth
 * 2023/7/3 18:55
 */
public interface StudentMapper {
    List<Student> findStudent(Integer page,Integer pageSize);
    Integer deleteStudent(Integer id);
    Student findById(Integer id);
    Integer updateStudent(Student student);
    Integer countStudent();
}
