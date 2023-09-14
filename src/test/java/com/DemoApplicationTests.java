package com;

import com.controller.StudentController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    StudentController studentController;

    @Test
    void contextLoads() {
        Integer admin = studentController.countStudent();
        System.out.println(admin);
    }

}