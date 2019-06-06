package com.jessevolka.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jessevolka.mapper.UserMapper;
import com.jessevolka.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserMapper userMapper;

    @GetMapping("/users/{pageNum}")
    public String list(@PathVariable("pageNum") int pageNum,Model model) {
        PageHelper.startPage(pageNum,10);
        List<User> users=userMapper.getUsers();
        PageInfo<User> pageInfo = new PageInfo<User>(users);
        pageInfo.setPageNum(pageNum);
        model.addAttribute("users", pageInfo.getList());
        model.addAttribute("pageInfo",pageInfo);
        return "databaseCRUD/list";
    }

    @GetMapping("/user")
    public String toAddPage(){
        return "databaseCRUD/addModifyUser";
    }

    @GetMapping("/user/{name}")
    public String toModifyPage(@PathVariable("name") String name, Model model) {
        User user=userMapper.getUserByName(name);
        model.addAttribute("modUser",user);
        return "databaseCRUD/addModifyUser";
    }

    @PostMapping("/user")
    public String addUser(User user) {
        userMapper.insertUser(user);
        return "redirect:/users/1";
    }

    @DeleteMapping("/user/{name}")
    public String deleteUser(@PathVariable("name") String name) {
        userMapper.deleteUser(name);
        return "redirect:/users/1";
    }

    @PutMapping("/user")
    public String updateUser(User user) {
        userMapper.updateUser(user);
        return "redirect:/users/1";
    }

}
