package com.znjsk.znjsk_project.service;

import com.znjsk.znjsk_project.pojo.userTest;

import java.util.List;

public interface userTestService {
    List<userTest> findAllUser();
    List<userTest> findUserById(int id);
    boolean insertUser(userTest usertest);
    boolean deleteUser(userTest usertest);
    boolean updateUser(userTest usertest);
}
