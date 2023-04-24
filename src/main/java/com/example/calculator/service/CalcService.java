package com.example.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalcService {
    private double result;

    public void plus (double secondNumber){
        result += secondNumber;
    }

    public void minus (double secondNumber){
        result -= secondNumber;
    }

    public void divide (double secondNumber){
        result = result / secondNumber;
    }

    public void multiply (double secondNumber){
        result = result * secondNumber;
    }

    public double getResult (){
        return result;
    }

}
