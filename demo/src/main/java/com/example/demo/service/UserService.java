package com.example.demo.service;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class UserService {

    private final UserMapper userMapper;

    @Autowired
    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public List<User> getAllFromNew() {
        return userMapper.findAllFromNew();
    }

    public List<User> getAllFromOld() {
        return userMapper.findAllFromOld();
    }

    public void addUserToNew(User user) {
        userMapper.insertIntoNew(user);
    }

    public void addUserToOld(User user) {
        userMapper.insertIntoOld(user);
    }

    public void updateUserInNew(User user) {
        userMapper.updateNew(user);
    }

    public void updateUserInOld(User user) {
        userMapper.updateOld(user);
    }

    public void deleteUserFromNew(Long id) {
        userMapper.deleteFromNew(id);
    }

    public void deleteUserFromOld(Long id) {
        userMapper.deleteFromOld(id);
    }
}
