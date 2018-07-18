/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.converter.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.converter.model.Currency;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import org.apache.commons.io.IOUtils;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author stas
 */
@Service
public class CurrencyServiceImpl implements CurrencyService {

    @Override
    public Currency getCurrencyFromJson() throws IOException {
        String stringUrl = "http://data.fixer.io/api/latest?access_key=798d762edc7a7069bd113319b988490f&format=1";

        ObjectMapper mapper = new ObjectMapper();
        JSONObject json = new JSONObject(IOUtils.toString(new URL(stringUrl), Charset.forName("UTF-8")));

        Currency currency = mapper.readValue(json.toString(), Currency.class);

        return currency;
    }

}
