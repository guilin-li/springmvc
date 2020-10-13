package com.lgl.domain;

//1,定义实体类
public class Person {
    private int id;
    private String username;
    private String password;
    private String city;

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