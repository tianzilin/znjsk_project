package com.znjsk.znjsk_project.service.impl;

import com.znjsk.znjsk_project.mapper.userTestMapper;
import com.znjsk.znjsk_project.pojo.userTest;
import com.znjsk.znjsk_project.service.userTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userTestServiceImpl implements userTestService {

    @Autowired
    public userTestMapper userTestMapper;

    @Override
    public List<userTest> findAllUser() {
        return userTestMapper.findAllUser();
    }

    @Override
    public List<userTest> findUserById(int id) {
        return userTestMapper.findUserById(id);
    }

    @Override
    public boolean insertUser(userTest usertest) {
        return userTestMapper.insertUser(usertest);
    }

    @Override
    public boolean deleteUser(userTest usertest) {
        return userTestMapper.deleteUser(usertest);
    }

    @Override
    public boolean updateUser(userTest usertest) {
        return userTestMapper.updateUser(usertest);
    }
}
