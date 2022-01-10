package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Subodh on 09/01/2022.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="dwit")
public class Student {
    @Id
    @GeneratedValue
    private int id;
    private String username;
    private String password;
}
