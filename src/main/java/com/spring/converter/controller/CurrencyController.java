/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.converter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author stas
 */
@Controller
public class CurrencyController {
    
    @GetMapping("/")
    public String convert(Model model){
        
        return "index";
    }
    
}
