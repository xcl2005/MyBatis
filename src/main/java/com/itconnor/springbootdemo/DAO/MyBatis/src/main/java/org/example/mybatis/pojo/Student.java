package org.example.mybatis.pojo;

import lombok.Data;

//实体类的注释
@Data
public class Student {
    private int id;
    private String username;
    private String email;
    private int age;
}
