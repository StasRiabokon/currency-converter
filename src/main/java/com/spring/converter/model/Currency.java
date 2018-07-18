/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.converter.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import lombok.*;

/**
 *
 * @author stas
 */
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Currency {

    private Boolean success;

    private Long timestamp;

    private String base;

    private String date;

    @ElementCollection
    Map<String, Double> rates;

}
