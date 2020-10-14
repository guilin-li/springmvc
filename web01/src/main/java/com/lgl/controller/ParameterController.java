package com.lgl.controller;

import com.lgl.domain.MyPojo;
import com.lgl.domain.Person;
import com.lgl.util.Db;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class ParameterController {

    @RequestMapping("login1.action")
    public ModelAndView test01(HttpServletRequest req){
        //springmvc会将请求对象 赋值给req
        String username= req.getParameter("username");
        String password= req.getParameter("password");
        System.out.println(username);
        System.out.println(password);
        ModelAndView mv= new ModelAndView();
        mv.setViewName("main");
        return mv;
    }
    @RequestMapping("login2.action")
    public ModelAndView test02(String username1,String password) {
 //    public ModelAndView test02(String username,String password) {
        //springmvc会将请求对象 赋值给req，参数绑定就是自动从req，将参数值
        //取出来赋值给username password
        System.out.println(username1);
//        System.out.println(username);
        System.out.println(password);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("main");
        return mv;
    }
    @RequestMapping("login3.action")
//     public ModelAndView test03(@RequestParam("username") String username1, String password){
   public ModelAndView test03(@RequestParam(value="name",required = true,defaultValue = "rose") String username1, String password){
        System.out.println(username1);
        System.out.println(password);
        ModelAndView mv= new ModelAndView();
        mv.setViewName("main");
        return mv;
    }

    @RequestMapping("login4.action")
    public ModelAndView test04(MyPojo mypojo){
        //springMVC可以将表单的数据赋值给 一个javaBean对象
        System.out.println(mypojo.getUsername());
        System.out.println(mypojo.getPassword());
        ModelAndView mv= new ModelAndView();
        mv.setViewName("main");
        return mv;
    }

    @RequestMapping("add.action")
    public ModelAndView test05(Person person){
        //springMVC可以将表单的数据赋值给 一个javaBean对象
        System.out.println(person.getUsername());
        System.out.println(person.getPassword());
        System.out.println(person.getBirthday().getYear());
        System.out.println(person.getBirthday().getMonth());
        System.out.println(person.getBirthday().getDay());
        System.out.println(person.getBirthday2());
        ModelAndView mv= new ModelAndView();
        mv.setViewName("main");
        return mv;
    }



}
