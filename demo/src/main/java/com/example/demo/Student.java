package com.example.demo;

/**
 * Created by Subodh on 05/01/2022.
 */
public class Student {

    private String name;
    private String address;
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
        System.out.println("calling  from constructor");
    }


    public Student() {
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("calling from setter");
    }

    public void setAddress(String address) {
        this.address = address;
    }



    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }




}
