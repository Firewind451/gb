package ru.asqw.gb.lesson6;

public class Cat extends Animals{

    public Cat(){}

    public Cat(String name){
        this.setName(name);
    }

    @Override
    public void run(int steps){
        if(steps <= 200){
            System.out.println(this.getName() + " runs " + steps + " meters.");
        } else{
            System.out.println(this.getName() + " could not stand such a load and stopped.");
        }
    }

    @Override
    public void swim(int meters){
        System.out.println(this.getName() + " could not swim and stopped.");
    }
}
