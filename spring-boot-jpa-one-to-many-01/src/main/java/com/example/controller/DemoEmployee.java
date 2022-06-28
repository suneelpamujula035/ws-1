package com.example.controller;

import com.example.entity.Address;
import com.example.entity.Employee;

import java.io.BufferedWriter;
import java.util.Objects;


public class DemoEmployee {

    Address a;
    private int id;
    private String firstName;
    private String lastName;
    private String address;

    public DemoEmployee() {
    }

    public DemoEmployee(int id, String firstName, String lastName, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public DemoEmployee(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void show(String msg) {
        String name = "pawan";
        char gender = 'M';
        System.out.println("name = " + name);
        System.out.println("msg = " + msg);
        System.out.println("DemoEmployee.show");
        System.out.println();
        System.out.println("DemoEmployee.show");
        if (name == null) {

        }
        if (name != null) {

        }
        System.out.println("name = " + name);
        long salary = 15700086L;
        System.out.println("salary = " + salary);
        String s = "public class DemoEmployee";
        System.out.println("My class name is = " + s);
    }

    public String sayWishes()
    {
        return "Happy birthday";
    }
    public static void main(String[] args) {
        DemoEmployee d = new DemoEmployee();
        String name = "suneel";
        System.out.println("name = " + name);
        int age = 24;
        System.out.println("Age is = " + age);
        float temp = 23.26777f;
        System.out.println("temp = " + temp);
        char gender = 'M';
        System.out.println("Gender is = " + gender);
        boolean areYouMarried = true;
        System.out.println("areYouMarried = " + areYouMarried);
        long salary = 15700086L;
        System.out.println("salary = " + salary);
        String wishes = d.sayWishes();
        System.out.println("wishes = " + wishes);

    }

}
