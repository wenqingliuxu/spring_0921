package com.hellojava.controller;

import com.hellojava.business.IUserService;
import com.hellojava.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 刘旭
 * @Data 2019/9/21 16:20
 */
@Controller
public class UserController {
    @Autowired
    private IUserService userService;
    @RequestMapping("indexview")
    public String regist(){
        return "index";
    }
    @RequestMapping("ragist")
    public String rgst(){
        return "form";
    }
    @RequestMapping("add")
    public String add(User user){
        userService.add(user);
        System.out.println("+++++++++++++++++++"+user);
        return "table";
    }
}
