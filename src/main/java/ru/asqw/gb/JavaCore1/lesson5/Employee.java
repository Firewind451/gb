package ru.asqw.gb.JavaCore1.dzs.lesson5;

import java.time.Year;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int birthDate;

    public Employee(){
        System.out.print("New employee created!");
    }

    public Employee(String name, String position, String email, String phone, int salary, int Age){
        this();
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.birthDate = Year.now().getValue() - Age;
    }

    public void print(){
        System.out.println("Name: " + this.name);
        System.out.println("Position: " + this.position);
        System.out.println("Email: " + this.email);
        System.out.println("Phone: " + this.phone);
        System.out.println("Salary: " + this.salary);
        int Age = Year.now().getValue() - this.birthDate;
        System.out.println("Age: " + Age);
    }

    int getAge(){
        return Year.now().getValue() - this.birthDate;
    }

    String getName(){
        return this.name;
    }

}
