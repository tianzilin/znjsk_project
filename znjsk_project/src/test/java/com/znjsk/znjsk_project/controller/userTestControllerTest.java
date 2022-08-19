package com.znjsk.znjsk_project.controller;

import com.github.pagehelper.PageHelper;
import com.znjsk.znjsk_project.ZnjskProjectApplicationTests;
import com.znjsk.znjsk_project.pojo.userTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class userTestControllerTest extends ZnjskProjectApplicationTests {


    @Autowired
    userTestController usertestController;

    @Test
    void test1() {
        String userTest1 = usertestController.test();
        System.out.println(userTest1);
    }

    @Test
    void findAllUser() {
        PageHelper.startPage(2,5);
        List<userTest> userTests = usertestController.findAllUser();
        userTests.forEach(System.out::println);
    }

    @Test
    void findUserById() {
        List<userTest> usertest = usertestController.findUserById(2);
        System.out.println(usertest);
    }

    @Test
    void insertUser() {
        Boolean insert = usertestController.insertUser("赵六", 22, "male");
        System.out.println(insert);
    }

    @Test
    void deleteUser() {
        boolean delete = usertestController.deleteUser("wangwu", null, "");
        System.out.println(delete);
    }

    @Test
    void updateUser() {
        boolean update = usertestController.updateUser("赵六", 14, "male");
        System.out.println(update);

    }
}