/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.converter.service;

import com.spring.converter.model.Currency;
import com.spring.converter.repository.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author stas
 */
@Service
public class CurrencyServiceImpl implements CurrencyService {

    @Autowired
    private CurrencyRepository repository;

    @Override
    public Currency saveCurrency(Currency currency) {
        return repository.save(currency);
    }

    @Override
    public Currency getCurrency(String rate) {
        return repository.getCurrencyByRate(rate);
    }

}
