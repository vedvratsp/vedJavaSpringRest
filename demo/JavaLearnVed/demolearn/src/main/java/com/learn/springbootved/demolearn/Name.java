package com.learn.springbootved.demolearn;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
 @Component
public class Name {

    private String data;
    private int noOfChar;
    private String lowerToUpperCase;
    private List<String> items;
    Name(){}
    Name(String data , int noOfChar, String lowerToUpperCase){
        this.data = data;
        this.noOfChar = noOfChar;
        this.lowerToUpperCase = lowerToUpperCase;
    }
   
   
}

