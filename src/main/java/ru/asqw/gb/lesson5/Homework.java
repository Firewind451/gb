package ru.asqw.gb.lesson5;

public class Homework {
    public static void main(String[] args) {
        int employeeAge = 40;
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov Ivan", "Engineer", "ivanov.ivan@mailbox.com", "89021234567", 40000, 32);
        employees[1] = new Employee("Petrov Vasily", "Senior Engineer", "petrov.valisy@mailbox.com", "89022345678", 42000, 48);
        employees[2] = new Employee("Sidorov Sergey", "Junior Engineer", "sidorov.sergey@mailbox.com", "89023456789", 38000, 27);
        employees[3] = new Employee("Kuznetsov Yury", "Junior Engineer", "kuznetsov@mailbox.com", "89024567890", 39000, 28);
        employees[4] = new Employee("Antonov Petr", "Engineer", "antonov.petr@mailbox.com", "89025678901", 41000, 44);

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > employeeAge) {
                System.out.println(employees[i].getName());
            }
        }
    }
}
