package com.lgl.util;

import com.lgl.domain.Person;

import java.util.ArrayList;
import java.util.List;

public class Db {
    public static List<Person> findAll(){
        List<Person> list = new ArrayList<Person>();
        list.add(new Person(1,"李","123456","贵港"));
        list.add(new Person(2,"贵","123456","桂平"));
        list.add(new Person(3,"林","123456","广西"));
        return list;
    }

}
