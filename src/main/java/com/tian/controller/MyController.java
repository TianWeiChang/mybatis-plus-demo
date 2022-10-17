package com.tian.controller;

import com.tian.entity.User;
import com.tian.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author tianwc  公众号：java后端技术全栈、面试专栏
 * @version 1.0.0
 * @description TODO
 * @createTime 2022年10月16日 23:02
 */
@RestController
public class MyController {

    @Resource
    private UserService userService;

    @GetMapping("/index")
    public List<User> getUser() {
        return userService.queryUserList();
    }

    @PostMapping("/add")
    public Boolean add() {
        User user = new User();
        user.setBirthday(new Date());
        user.setPwd("123456");
        user.setName("zhangsan");
        user.setPhone("15846784589");
        return userService.add(user);
    }
}
