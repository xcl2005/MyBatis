package org.example.mybatis;

import org.example.mybatis.mapper.StudentMapper;
import org.example.mybatis.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MyBatisApplicationTests {
    @Autowired
     private StudentMapper studentMapper;
    @Test
    public void testfindAll() {
        List<Student> list = studentMapper.findAll();
            list.forEach(name-> System.out.println(name));
    }

}
