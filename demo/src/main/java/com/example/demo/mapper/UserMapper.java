package com.example.demo.mapper;

import com.example.demo.model.User;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM new")
    List<User> findAllFromNew();

    @Select("SELECT * FROM old")
    List<User> findAllFromOld();

    @Insert("INSERT INTO new(name, age) VALUES(#{name}, #{age})")
    void insertIntoNew(User user);

    @Insert("INSERT INTO old(name, age) VALUES(#{name}, #{age})")
    void insertIntoOld(User user);

    @Update("UPDATE new SET name=#{name}, age=#{age} WHERE id=#{id}")
    void updateNew(User user);

    @Update("UPDATE old SET name=#{name}, age=#{age} WHERE id=#{id}")
    void updateOld(User user);

    @Delete("DELETE FROM new WHERE id=#{id}")
    void deleteFromNew(Long id);

    @Delete("DELETE FROM old WHERE id=#{id}")
    void deleteFromOld(Long id);
}
