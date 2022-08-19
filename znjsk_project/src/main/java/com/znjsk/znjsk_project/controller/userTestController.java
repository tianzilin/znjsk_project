package com.znjsk.znjsk_project.controller;

import com.znjsk.znjsk_project.pojo.userTest;
import com.znjsk.znjsk_project.service.impl.userTestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class userTestController {

    @Autowired
    private userTestServiceImpl usertestServiceimpl;

    @RequestMapping("/test111")
    public String test(){
        return "springBoot start success...";
    }

//    查找所有的用户
    @RequestMapping("/getInfo")
    public List<userTest> findAllUser(){
        return usertestServiceimpl.findAllUser();
    }

//    根据id查找用户
    @RequestMapping("/getInfoById/{id}")
    public List<userTest> findUserById( @PathVariable int id){
        return usertestServiceimpl.findUserById(id);
    }

//    增加用户
    @RequestMapping("/insertUser")
    public boolean insertUser(String name, Integer age, String sex){
        userTest usertest = new userTest();
        usertest.setName(name);
        usertest.setAge(age);
        usertest.setSex(sex);
        return usertestServiceimpl.insertUser(usertest);
    }

//    删除用户
    @RequestMapping("/deleteUser")
    public boolean deleteUser(String name,Integer age,String sex){
        userTest usertest = new userTest();
        usertest.setName(name);
        return usertestServiceimpl.deleteUser(usertest);
    }

//    修改用户
    @RequestMapping("/updateUser")
    public boolean updateUser(String name,Integer age,String sex){
        userTest usertest = new userTest();
        usertest.setName(name);
        usertest.setAge(age);
        usertest.setSex(sex);
        return usertestServiceimpl.updateUser(usertest);
    }

}
