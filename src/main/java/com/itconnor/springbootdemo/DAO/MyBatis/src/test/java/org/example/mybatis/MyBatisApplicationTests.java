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
            list.forEach((Student student)->System.out.println(student));
    }

    @Test
    public void testDeleteById() {
        studentMapper.deleteById(5);
    }
    @Test
    public void testInsert() {
        Student student = new Student(0,"jack","324324", 18);
        //如果一行四个数据都为非空，那么插入3个数据会报错。
        studentMapper.insert(student);
    }
    @Test
    public
    void testFindById() {
        Student student = studentMapper.findById("jack","324324");
        System.out.println(student);
    }


}
