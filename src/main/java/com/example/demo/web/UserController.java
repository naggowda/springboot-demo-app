package com.example.demo.web;
import com.example.demo.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("api/User")
public class UserController {
    Logger logger = LoggerFactory.getLogger(UserController.class);
    @GetMapping
    public List<User> getUser(){
        List userList = new ArrayList<User>();
        userList.add(new User(1, "Scholar1", "Scholar"));
        return userList;
    }
    @PostMapping
    public User createUser(@RequestBody User user){
        logger.info(user.toString());
        return user;
    }
}