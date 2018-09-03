package com.example.demo.mapper;

import com.example.demo.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author zhengyangtao
 * @create 2018-09-03 17:23
 */
@Mapper
public interface  StudentMapper {
    @Select("select * from car_coupon_base")
    List<Student> findAll();
}
