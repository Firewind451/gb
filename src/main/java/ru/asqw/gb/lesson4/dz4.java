package ru.asqw.gb.lesson4;

import java.util.Random;
import java.util.Scanner;

public class dz4 {
    /*

    Что выполнено:
    1)  Переписал код с нуля сам.
    2)  Сделал проверку победы для любого размера игрового поля.

    */
    private static final char DOT_X = 'X';
    private static final char DOT_0 = '0';
    private static final char DOT_EMPTY = '•';
    private static char[][] field;
    private static int fieldSize;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        initField();
        fieldDraw();
        while (true){
            humanTurn();
            fieldDraw();
            if (checkWin(DOT_X)){
                System.out.println("Вы выйграли!!");
                break;
            }
            if(noOneWin()){
                System.out.println("Ничья!");
                break;
            }


            aiTurn();
            fieldDraw();
            if (checkWin(DOT_0)){
                System.out.println("Вы выйграли!!");
                break;
            }
            if(noOneWin()){
                System.out.println("Ничья!");
                break;
            }
        }
        System.out.println("Game over! :)");
    }

    public static void initField(){
        System.out.print("Enter field size: >>>");
        fieldSize = scanner.nextInt();
        field = new char[fieldSize][fieldSize];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void fieldDraw(){
        System.out.print("+|");
        for (int i = 0; i < field.length; i++) {
            System.out.print(i + 1 + "|");
        }
        System.out.println();


        for (int i = 0; i < field.length ; i++) {
            System.out.print(i + 1 + "|");
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j] + "|");
            }
            System.out.println();
        }
    }

    public static boolean checkCell(int x, int y){
        if( (x >= 0) && (x < fieldSize) && (y >= 0) && ( y < fieldSize) ){
            if (field[x][y] == DOT_EMPTY) return true;
        }
        return false;
    }

    public static void humanTurn(){
        int x,y;
        do{
            System.out.println("Human turn: Enter coordinates [X Y]: >>>");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        }while(!checkCell(x,y));
        field[x][y] = DOT_X;
    }

    public static void  aiTurn(){
        System.out.println();
        System.out.println("AI Turn:");
        Random random = new Random();
        int x,y;
        do{
            x = random.nextInt(fieldSize);
            y = random.nextInt(fieldSize);
        }while(!checkCell(x,y));
        field[x][y] = DOT_0;
    }

    public static boolean checkWin(char symb){
        int summX;
        for (int i = 0; i < field.length; i++) { // считаем кол-во Х в каждой строке, если summ = fieldSize, значит победа
            summX = 0;
            for (int j = 0; j < field[i].length; j++) {
                if(field[i][j] == symb){
                    summX += 1;
                }
            }
            if (summX == fieldSize) return true;
        }

        for (int i = 0; i < field.length; i++) { // считаем кол-во Х в каждом столбце, если summ = fieldSize, значит победа
            summX = 0;
            for (int j = 0; j < field[i].length; j++) {
                if(field[j][i] == symb){
                    summX += 1;
                }
            }
            if (summX == fieldSize) return true;
        }

        summX = 0;
        for (int i = 0; i < field.length; i++) { // проверяем первую диагональ, если summ = fieldSize, значит победа
            if (field[i][i] == symb){
                summX += 1;
            }
        }
        if (summX == fieldSize) return true;

        summX = 0;
        for (int i = 0; i < field.length; i++) { // проверяем вторую диагональ, если summ = fieldSize, значит победа
            if (field[i][field.length - i - 1] == symb){
                summX += 1;
            }
        }
        if (summX == fieldSize) return true;

        return false;
    }

    public static boolean noOneWin(){
        for (int i = 0; i < field.length ; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }
}
