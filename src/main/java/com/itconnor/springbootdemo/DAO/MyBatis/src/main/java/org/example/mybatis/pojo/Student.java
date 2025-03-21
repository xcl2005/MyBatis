package org.example.mybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//实体类的注释
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private int id;
    private String username;
    private String email;
    private int age;

}
