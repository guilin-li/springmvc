package com.lgl.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

//1,定义实体类
public class Person {
    private int id;
    private String username;
    private String password;
    private String city;
    private  Birthday birthday;
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date birthday2;

    public Date getBirthday2() {
        return birthday2;
    }

    public void setBirthday2(Date birthday2) {
        this.birthday2 = birthday2;
    }

    public Birthday getBirthday() {
        return birthday;
    }

    public void setBirthday(Birthday birthday) {
        this.birthday = birthday;
    }

    public Person() {
    }

    public Person(int id, String username, String password, String city) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
