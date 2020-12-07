package com.equtiem.user.controller;

import com.equtiem.user.VO.ResponseTemplateVO;
import com.equtiem.user.entity.User;
import com.equtiem.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/users")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;
    private Logger log = LoggerFactory.getLogger(UserController.class);


    @PostMapping("/save")
    public User saveUser(@RequestBody User user){
        log.info("Inside saveUser method of UserController");
        return  userService.saveUser(user);
    }


    @GetMapping("/get/{id}")
    public ResponseTemplateVO getUser(@PathVariable("id") Long userId){
        return userService.getUser(userId);
    }

}
