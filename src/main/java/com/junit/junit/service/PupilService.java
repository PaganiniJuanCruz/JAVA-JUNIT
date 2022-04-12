package com.junit.junit.service;

import org.springframework.stereotype.Service;

@Service
public class PupilService {
    public String nameComplete(String name, String surname){
        return name + " " + surname;
    }

    public String welcome(){ return "Welcome to the Students ";}
}
