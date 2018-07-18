/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.converter.service;

import com.spring.converter.model.Currency;
import java.io.IOException;

/**
 *
 * @author stas
 */
public interface CurrencyService {    
        
    Currency getCurrencyFromJson() throws IOException;

}
