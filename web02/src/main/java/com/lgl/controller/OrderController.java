package com.lgl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/order")
public class OrderController {
    @RequestMapping(path = "/query.action",method = {RequestMethod.GET,RequestMethod.POST})
    public String query(Integer id){
        System.out.println("你访问了我的订单功能 ");
        return "order";
    }
}