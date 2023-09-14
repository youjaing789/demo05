package com.controller;

import com.pojo.Student;
import com.service.StudentService;
import com.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by auth
 * 2023/7/3 18:49
 */
@RestController
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService studentService;

    //查找所有的学生
    @GetMapping("findStudent")
    public Result findStudent(@RequestParam("page") Integer page, @RequestParam("pageSize") Integer pageSize) {
        if (page > 0)
            page = (page - 1) * pageSize;
        List<Student> list = studentService.findStudent(page, pageSize);
        if (list.size()==0){
            return Result.success();
        }else {
            return Result.successObject(list);
        }
    }

    //删除指定id的学生
    @DeleteMapping("deleteStudent/{id}")
    public void deleteStudent(@PathVariable("id") Integer id) {
        studentService.deleteStudent(id);
    }

    //修改学生信息
    @PutMapping("updateStudent")
    public Integer updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }

    //查找对应id的学生
    @GetMapping("findById/{id}")
    public Student findById(@PathVariable("id") Integer id) {
        Student student = studentService.findById(id);
        return student;
    }

    //获取学生总数
    @GetMapping("countStudent")
    public Integer countStudent() {
        return studentService.countStudent();
    }

}
