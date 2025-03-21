package org.example.mybatis.mapper;

import org.apache.ibatis.annotations.*;
import org.example.mybatis.pojo.Student;

import java.util.List;

@Mapper
public interface StudentMapper {
    @Select("select * from student")
    public List<Student> findAll();

    @Delete("delete from student where id = #{id}")
    public void deleteById(Integer id);

    @Insert("insert into Student (username, email,age) values (#{username},#{email},#{age})")
    public void insert(Student student);

    @Select("select * from student where username = #{username} and email =#{email} ")
    public Student findById(@Param("username") String username,@Param("email")String email);
    //基于springboot的官方框架可以省略@Param注解
}
