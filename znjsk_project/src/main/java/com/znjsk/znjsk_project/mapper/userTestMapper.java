package com.znjsk.znjsk_project.mapper;

import com.znjsk.znjsk_project.pojo.userTest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface userTestMapper {
    List<userTest> findAllUser();
    List<userTest> findUserById(int id);
    boolean insertUser(userTest usertest);
    boolean deleteUser(userTest usertest);
    boolean updateUser(userTest usertest);
}
