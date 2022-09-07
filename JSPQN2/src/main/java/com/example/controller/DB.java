package com.example.controller;

import com.example.module.Students;

import java.util.HashMap;
import java.util.Map;

public class DB {
    Map<String, Students> std = new HashMap<>();

    public String add(Students students){

        try {
            std.put(students.getId(),students);
            return "Feedback Saved.";
        }catch (Exception e){
            return "Exception";
        }
    }

    public boolean already(String id){
        if (std.containsKey(id)){
           return true;
        }else {
           return false;
        }
    }
}
