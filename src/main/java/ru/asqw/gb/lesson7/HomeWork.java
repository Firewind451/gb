package ru.asqw.gb.lesson7;

public class HomeWork {
    public static void main(String[] args) {
        int totalCats = 0; // без явной инициализации IDEA ругается ошибкой
        int totalDogs = 0; // без явной инициализации IDEA ругается ошибкой
        int totalAnimals = 0; // без явной инициализации IDEA ругается ошибкой
        Animals[] animals = {
                new Animals("Animal1"),
                new Animals("Animal2"),
                new Cat("Barsik", 100),
                new Cat("Vaska", 100),
                new Dog("Bobik")
        };

        Bowl bowl = new Bowl(0);
        bowl.addMeal(200);
        System.out.println("Not in bowl " + bowl.getVolume() + " units of food.");

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Cat){
                ((Cat) animals[i]).eat(bowl);
                if(((Cat) animals[i]).isWellFed()){
                    System.out.println(animals[i].getName() + " is well-fed!");
                }else{
                    System.out.println(animals[i].getName() + " IS NOT well-fed!");
                }
            }
        }

        System.out.println();
        for (int i = 0; i < animals.length; i++) {
//            animals[i].run(50);
//            animals[i].swim(15);
//            System.out.println();
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
