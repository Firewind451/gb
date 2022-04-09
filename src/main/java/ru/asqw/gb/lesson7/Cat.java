package ru.asqw.gb.lesson7;

public class Cat extends Animals {
    private int appetite;
    private boolean wellFed = false;

    public Cat(){}

    public Cat(String name){
        this.setName(name);
    }

    public Cat(String name, int appetite) {
        this.setName(name);
        this.setAppetite(appetite);
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

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isWellFed() {
        return wellFed;
    }

    public void eat(Bowl bowl){
        if(bowl.getVolume() > this.appetite){ // в миске больше еды, чем ест кот
            System.out.println(this.getName() + " eats " + this.appetite + " units of food.");
            bowl.getMeal(this.appetite);
            this.wellFed = true;
        } else{ // если еды в миске меньше, чем ест кот, то он не трогает еду в миске
            System.out.println(this.getName() + " is not getting enough food. The cat remained hungry and did not touch the food bowl.");
        }
    }
}
