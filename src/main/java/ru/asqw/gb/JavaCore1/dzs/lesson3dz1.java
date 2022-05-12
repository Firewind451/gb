package ru.asqw.gb.JavaCore1.dzs.dzs;

import java.util.Arrays;
import java.util.Random;

public class lesson3dz1 {

    public static void main(String[] args) {

        // Задание #1
        System.out.println("Задание #1:");
        SwitchZeroToOne();
        System.out.println();

        // Задание #2
        System.out.println("Задание #2:");
        OneToHundred();
        System.out.println();

        // Задание #3
        System.out.println("Задание #3:");
        MultiplicationOnTwo();
        System.out.println();

        // Задание #4
        System.out.println("Задание #4:");
        Diagonals(9);
        System.out.println();

        // Задание #5
        System.out.println("Задание #5:");
        int arraySize = 10;
        int[] testArray =  new int[arraySize];
        testArray = InitArrayWithVariableLenght(arraySize, 5);
        System.out.println(Arrays.toString(testArray));
        System.out.println();

        // Задание #6
        System.out.println("Задание #6:");
        MinAndMaxInArray( 10);
        System.out.println();

        // Задание #7
        System.out.println("Задание #7:");
        int arr[] = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(Arrays.toString(arr));
        System.out.println(CheckBalance(arr));
        System.out.println();

        // Задание #8
        System.out.println("Задание #8:");
        int[] testArray1 = new int[10];

        Random random = new Random();
        for (int i = 0; i < testArray1.length; i++) {
            testArray1[i] = random.nextInt(100); // стандартные значения от 0 до 100 устраивают
        }
        System.out.println("Original array: \t\t" + Arrays.toString(testArray1));
        testArray1 = ArrayShift(testArray1, 1);
        System.out.println("Array with shift(1): \t" + Arrays.toString(testArray1));
        testArray1 = ArrayShift(testArray1, -2);
        System.out.println("Array with shift(-1): \t" + Arrays.toString(testArray1));

    }

    public static void SwitchZeroToOne(){
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0){
                arr[i] = 1;
            } else if (arr[i]==1) {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void OneToHundred(){
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void MultiplicationOnTwo(){
        int[] arr =  { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6){
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public  static void Diagonals(int size){
        int[][] arr = new int[size][size];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j == i || j == arr.length - i - 1){
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length ; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[] InitArrayWithVariableLenght(int size, int initValue){
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initValue;
        }
        return arr;
    }

    public static void MinAndMaxInArray(int size){
        int[] arr = new int[size];
        Random random = new Random();
        int minArrayIndex = 0, maxArrayIndex = 0, minArrayValue = 2000000, maxArrayValue = -2000000;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100); // стандартные значения от 0 до 100 устраивают
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < minArrayValue){
                minArrayValue = arr[i];
                minArrayIndex = i;
            }
            if (arr[i] >= maxArrayValue){
                maxArrayValue = arr[i];
                maxArrayIndex = i;
            }
        }

        System.out.println("MIN: arr[" + minArrayIndex + "] = " + minArrayValue);
        System.out.println("MAX: arr[" + maxArrayIndex + "] = " + maxArrayValue);
    }

    public static boolean CheckBalance(int arr[]){
        int leftSum, rightSum;
        for (int a = 0; a < arr.length; a++) {
            leftSum = 0;
            rightSum = 0;
            for (int i = 0; i <= a ; i++) {
                leftSum += arr[i];
            }
            for (int i = a + 1; i < arr.length ; i++) {
                rightSum += arr[i];
            }
            if (leftSum == rightSum) return true;
        }
        return false;
    }

    public static int[] ArrayShift(int arr[], int shift){
        if (shift > 0) {
            for (int j = 0; j < shift; j++) {
                int lastArrayValue = arr[arr.length-1];
                for (int i = arr.length - 2 ; i >= 0  ; i--) {
                    arr[i+1] = arr[i];
                }
                arr[0] = lastArrayValue;
            }
        } else if (shift < 0) {
            shift = Math.abs(shift);
            for (int j = 0; j < shift; j++) {
                int firstArrayValue = arr[0];
                for (int i = 1; i < arr.length ; i++) {
                    arr[i-1]= arr[i];
                }
                arr[arr.length-1] = firstArrayValue;
            }
        } else System.out.println("Shift = 0!!! No action needed!!!");
        return arr;
    }
}
