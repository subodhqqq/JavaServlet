package com.example.wether.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor


public class wetherModel {

    private String decription;
    private BigDecimal temp;

    private BigDecimal feels_like;
    private BigDecimal speed;

}
