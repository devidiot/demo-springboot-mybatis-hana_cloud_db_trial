package org.starj.boot.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.starj.boot.demo.model.User;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM User")
    List<User> findAll();

    @Select("SELECT * FROM User WHERE userName = #{uesrName}")
    User findByUserName(@Param("uesrName") String uesrName);

}
