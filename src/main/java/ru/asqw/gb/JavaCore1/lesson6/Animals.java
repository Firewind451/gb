package ru.asqw.gb.JavaCore1.dzs.lesson6;

public class Animals {
    private String name;

    public Animals(){
    }

    public Animals(String name){
        this.setName(name);
        // this.name = name;
    }

    public void run (int steps){
        System.out.println(this.name + " run " + steps + " meters." );
    }

    public void swim(int meters){
        System.out.println(this.name + " swim " + meters + " meters.");
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
