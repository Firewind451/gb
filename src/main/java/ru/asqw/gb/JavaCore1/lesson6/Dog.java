package ru.asqw.gb.JavaCore1.dzs.lesson6;

public class Dog extends Animals{

    public Dog(){}

    public Dog(String name){
        this.setName(name);
    }

    @Override
    public void run(int steps){
        if(steps <= 500){
            System.out.println(this.getName() + " runs " + steps + " meters.");
        } else{
            System.out.println(this.getName() + " could not stand such a load and stopped.");
        }
    }

    @Override
    public void swim(int meters){
        if(meters <= 10){
            System.out.println(this.getName() + " swim " + meters + " meters.");
        } else{
            System.out.println(this.getName() + " could not stand such a load and stopped.");
        }
    }
}
