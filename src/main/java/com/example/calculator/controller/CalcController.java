package com.example.calculator.controller;

import com.example.calculator.service.CalcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/calculator")
public class CalcController {

    private CalcService service;

    @Autowired
    public CalcController(CalcService service) {
        this.service = service;
    }


    @PostMapping
    public void plus (@ModelAttribute("secondNumber") double secondNumber){
        service.plus(secondNumber);
    }

    @PostMapping
    public void minus (@ModelAttribute("secondNumber") double secondNumber){
        service.minus(secondNumber);
    }

    @PostMapping
    public void divide (@ModelAttribute("secondNumber") double secondNumber){
        service.divide(secondNumber);
    }

    @PostMapping
    public void multiply (@ModelAttribute("secondNumber") double secondNumber){
        service.multiply(secondNumber);
    }

    @GetMapping("")
    public String result (Model model){
        model.addAttribute("result", service.getResult());
        return "result";
    }

}
