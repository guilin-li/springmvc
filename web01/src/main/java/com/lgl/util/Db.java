package com.lgl.util;

import com.lgl.domain.Birthday;
import com.lgl.domain.Person;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Db {
    private static List<Person> list;
    static {

        list = new ArrayList<>();
//        list.add(new Person(1,"李","123456","贵港"));
//        list.add(new Person(2,"贵","123456","桂平"));
//        list.add(new Person(3,"林","123456","广西"));
        list.add(new Person(1,"jack","123456","贵港",new Birthday(1998,1,5),new Date()));
        list.add(new Person(2,"rose","123456","天津",new Birthday(1999,5,2),new Date()));
        list.add(new Person(3,"tony","123456","上海",new Birthday(1998,9,16),new Date()));

    }

    public static List<Person> findAll(){
         return list;
    }

    public static Person findById(int id) {
        Person p = null;
        for (Person person:list){
            if (id == person.getId()){
                p = person;
            }
        }
        return  p;

    }
}
