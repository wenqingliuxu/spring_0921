package com.hellojava.controller;

import com.hellojava.business.IUserService;
import com.hellojava.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

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
    @RequestMapping("showusers")
    public String showusers(Model model){
        List<User> users = userService.loadAll();
        model.addAttribute("users",users);

        return "table";
    }
    @RequestMapping("add")
    public String add(User user,Model model){
        userService.add(user);

        List<User> users = userService.loadAll();
        model.addAttribute("users",users);

        return "table";
    }
    @RequestMapping("delete")
    public String delete(@RequestParam("user_id") int id,Model model){
        userService.delete(id);
        List<User> users = userService.loadAll();
        model.addAttribute("users",users);
        return "table";
    }
    @RequestMapping("loadById")
    public String loadById(@RequestParam("user_id") int id,Model model){
        User user = userService.loadById(id);
        model.addAttribute(user);
        return "singleform";
    }
    @RequestMapping("updateuser")
    public String update(User user,Model model){
        userService.update(user);
        return "redirect:showusers";
    }
}
