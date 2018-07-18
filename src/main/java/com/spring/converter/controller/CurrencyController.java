/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.converter.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.converter.model.Currency;
import com.spring.converter.service.CurrencyServiceImpl;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import org.apache.commons.io.IOUtils;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author stas
 */
@Controller
public class CurrencyController {

    @Autowired(required = false)
    private CurrencyServiceImpl service;

    @GetMapping("/")
    public String getData(Model model) throws IOException {

        model.addAttribute("currency", service.getCurrencyFromJson());
        return "index";
    }

}
