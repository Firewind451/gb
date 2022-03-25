package ru.asqw.gb.lesson2;

public class dz {
    public static void main(String[] args) {
        // Задание #1
        boolean a1 = checkSumm1(5,5);
        System.out.println(a1);

        // Задание #2
        compare1(1);

        // Задание #3
        boolean a2 = compare2(1);
        System.out.println(a2);

        // Задание #4
        printString1("Hello world!",3);

        // Задание #5
        VisokosniyGog(2022);
    }

    public static boolean checkSumm1(int a, int b){
        if ( (a+b) > 10 && (a+b) <= 20){
            return true;
        } else {
                return false;
            }
    }

    public static void compare1(int i) {
        if (i >= 0) System.out.println("Число положительно");
            else System.out.println("Число отрицательное");
    }

    public static boolean compare2(int i){
        if (i < 0) return true;
        else return false;
    }

    public static void  printString1(String str, int count){
        if( count > 0){
            for (int i = 0; i < count; i++){
                System.out.println(str);
            }
        }else {
            System.out.println("Ошибка!!! Введено отрицательное число!");
        }
    }

    public static void VisokosniyGog(int year){
        if (year > 0){
            if( ((year % 4 == 0) && ( year % 100 != 0)) || (year % 400 == 0)    ){
                System.out.println("Год " + year + " является високосным.");
            } else{
                System.out.println("Год " + year + " не является високосным.");
            }
        } else {
            System.out.println("Ошибка!!! Введено отрицательное число!");
        }
    }
}
