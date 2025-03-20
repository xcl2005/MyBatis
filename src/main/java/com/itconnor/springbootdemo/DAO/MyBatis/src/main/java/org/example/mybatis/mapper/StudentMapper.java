package org.example.mybatis.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.mybatis.pojo.Student;

import java.util.List;

@Mapper
public interface StudentMapper {
    @Select("select * from student")
    public List<Student> findAll();

    @Delete("delete from student where id = #{id}")
    public void deleteById(Integer id);

}
