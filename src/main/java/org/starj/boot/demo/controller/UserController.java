package org.starj.boot.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import org.starj.boot.demo.model.User;
import org.starj.boot.demo.service.UserService;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/test/{path}")
    public @ResponseBody String test(@PathVariable("path") String path) {
        return path;
    }

    @GetMapping("/user/all")
    public @ResponseBody Object getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/user/{userName}")
    public @ResponseBody Object getUser(@PathVariable("userName") String userName) {
        User user = userService.getUser(userName);
        if (user == null)
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "NO user");
        return user;
    }

}
