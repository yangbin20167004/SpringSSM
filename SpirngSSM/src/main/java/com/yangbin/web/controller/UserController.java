package com.yangbin.web.controller;

import com.yangbin.pojo.User;
import com.yangbin.serivce.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by
 *
 * @author 風起雲落乀
 * @Date 2020/5/21/021
 * @Time 9:10
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/regist")
    public @ResponseBody String regist(@RequestBody String user){
        System.out.println(user);
        /*userService.addUser(user);*/
        ModelAndView modelAndView = new ModelAndView();
        String attributeValue = "<a href=\"/index.jsp\">点击前往登录</a>";
        modelAndView.addObject("msg",attributeValue);
        modelAndView.setViewName("registsuccess");
       return "成功";

    }

    @RequestMapping("/login")
    public ModelAndView login(User user){
        User user1 = userService.findUser(user);
        ModelAndView modelAndView = new ModelAndView();
        if(user1 != null){
            List<User> allUser = userService.findAllUser();
            modelAndView.addObject("user",allUser);
            modelAndView.setViewName("main");
        }else {
            String attributeValue = "登入失败";
            modelAndView.addObject("msg",attributeValue);
            modelAndView.setViewName("fail");
        }

        return modelAndView;

    }

}
