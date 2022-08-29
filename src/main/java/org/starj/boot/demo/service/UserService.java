package org.starj.boot.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.starj.boot.demo.mapper.UserMapper;
import org.starj.boot.demo.model.User;

@Service
public class UserService {

    @Autowired
    private UserMapper mapper;

    public UserService(UserMapper mapper) {
        this.mapper = mapper;
    }

    public List<User> getAllUsers() {
        return mapper.findAll();
    }

    public User getUser(String userName) {
        return mapper.findByUserName(userName);
    }

}
