package com.lgl.controller;

import com.lgl.domain.Person;
import com.lgl.util.Db;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class PersonController {
    @RequestMapping("list1.action")
    public ModelAndView listPersons1(){
        //1:获取集合
        List<Person> list = Db.findAll();
        System.out.println("listPersons");
        //2:转发到页面
        // request.setAttribute("list",list)
        // request.getDispatcher("/list.jsp").forward(req,resp)
        ModelAndView mv = new ModelAndView();//对数据与页面的封装
        mv.addObject("list",list);
        mv.setViewName("jsp/list.jsp");
        //3:在页面上进行forEach循环
        return mv;
    }
    @RequestMapping("list2.action")
    public ModelAndView listPersons2(){
        //1:获取集合
        List<Person> list = Db.findAll();
        System.out.println("listPersons");
        //2:转发到页面
        // request.setAttribute("list",list)
        // request.getDispatcher("/list.jsp").forward(req,resp)
        ModelAndView mv = new ModelAndView();//对数据与页面的封装
        mv.addObject("list",list);
        mv.setViewName("list");
        //3:在页面上进行forEach循环
        return mv;
    }
    @RequestMapping("update.action")
    public ModelAndView updatePerson(int id){//id=1
        //1:模拟一下查询数据库
        Person person= Db.findById(id);
        //2:转发到页面
        ModelAndView mv = new ModelAndView();//对数据与页面的封装
        mv.addObject("person",person);
        //WEB-INF/jsp/  前缀
        //.jsp  后缀
        mv.setViewName("updatePersonUI");// /WEB-INFO/jsp/list.jsp
        //3:在页面上进行forEach循环
        return mv;
    }


}
