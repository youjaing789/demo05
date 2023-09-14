package com.service.serviceImp;

import com.mapper.StudentMapper;
import com.pojo.Student;
import com.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by auth
 * 2023/7/3 18:56
 */
@Service
public class StudentServiceImp implements StudentService {
    @Resource
    private StudentMapper studentMapper;

    @Override
    public List<Student> findStudent(Integer page,Integer pageSize) {
        return studentMapper.findStudent(page,pageSize);
    }

    @Override
    public void deleteStudent(Integer id) {
        studentMapper.deleteStudent(id);
    }

    @Override
    public Student findById(Integer id) {
        return studentMapper.findById(id);
    }

    @Override
    public Integer updateStudent(Student student) {
        return studentMapper.updateStudent(student);
    }

    @Override
    public Integer countStudent() {
        return studentMapper.countStudent();
    }

}
