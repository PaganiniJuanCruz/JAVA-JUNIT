package com.junit.junit.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public int addition(int a, int b){
        return a+b;
    }

    public int subtraction(int a, int b){
        return a-b;
    }

    public int multiplication(int a, int b){
        return a*b;
    }
}
