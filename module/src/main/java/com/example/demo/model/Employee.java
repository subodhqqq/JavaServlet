package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Subodh on 07/01/2022.
 */
@Data//from lambook work is seeter getter
@NoArgsConstructor//from lambok work as non arg constructor
@AllArgsConstructor//from lambok argument construuctor
@Entity//data module ko kam garxa

public class Employee {
   @Id
   @GeneratedValue
    private int id;
   //@Column(name = "ass") change garna ko lagi
    private String name;
    //@Column(name = "ass") change garna ko lagi
    private String address;
}
