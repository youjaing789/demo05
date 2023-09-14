package com.pojo;
import java.util.Date;

/**
 * Created by auth
 * 2023/7/3 18:52
 */
public class Student {
    private Integer id;
    private String s_name;
    private Integer age;
    private Date birth;
    private Integer r_id;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", s_name='" + s_name + '\'' +
                ", age=" + age +
                ", birth=" + birth +
                ", r_id=" + r_id +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Integer getR_id() {
        return r_id;
    }

    public void setR_id(Integer r_id) {
        this.r_id = r_id;
    }

    public Student(Integer id, String s_name, Integer age, Date birth, Integer r_id) {
        this.id = id;
        this.s_name = s_name;
        this.age = age;
        this.birth = birth;
        this.r_id = r_id;
    }
}
