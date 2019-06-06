package com.jessevolka.mapper;

import com.jessevolka.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;


@Mapper
@Component
public interface UserMapper {
    User getUserByName(String name);

    List<User> getUsers();

    int insertUser(@Param("user") User user);

    int deleteUser(String name);

    int updateUser(@Param("user") User user);
}
