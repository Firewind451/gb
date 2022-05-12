package ru.asqw.gb.JavaCore1.dzs.lesson6;

public class HomeWork {
    public static void main(String[] args) {
        int totalCats = 0; // без явной инициализации IDEA ругается ошибкой
        int totalDogs = 0; // без явной инициализации IDEA ругается ошибкой
        int totalAnimals = 0; // без явной инициализации IDEA ругается ошибкой
        Animals[] animals = {
                new Animals("Animal1"),
                new Animals("Animal2"),
                new Cat("Barsik"),
                new Dog("Bobik")
        };

        for (int i = 0; i < animals.length; i++) {
            animals[i].run(50);
            animals[i].swim(15);
            System.out.println();
            if(animals[i] instanceof Cat){
                totalCats++;
            } else if (animals[i] instanceof Dog){
                totalDogs++;
            } else if (animals[i] instanceof Animals){
                totalAnimals++;
            }
        }

        System.out.println("Total animals: " + totalAnimals);
        System.out.println("Total cats: " + totalCats);
        System.out.println("Total dogs: " + totalDogs);
    }
}
