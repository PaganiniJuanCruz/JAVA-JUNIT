package com.junit.junit.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorServiceTest {

    @Autowired
    private CalculatorService calculatorService;

    @BeforeEach
    void setUp() {
    }

    @Test
    void testAddition() {
        int a = 3;
        int b = 10;
        int result = calculatorService.addition(a,b);

        assertEquals(13, result);
    }

    @Test
    void subtraction() {
        int a=5;
        int b=3;
        int result = calculatorService.subtraction(a,b);
        assertEquals(2,result);
    }

    @Test
    void multiplication() {
        int a= 3;
        int b=5;
        int result = calculatorService.multiplication(a,b);
        assertEquals(15,result);
    }
}
