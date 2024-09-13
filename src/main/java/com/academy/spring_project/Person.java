package com.academy.spring_project;

import org.springframework.web.bind.annotation.GetMapping;

public class Person {
    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setName (String name){
            this.name = name;
    }

    public String getName(){
        return name;
    }
}