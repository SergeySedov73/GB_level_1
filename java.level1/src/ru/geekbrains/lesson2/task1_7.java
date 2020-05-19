package ru.geekbrains.lesson2;
import java.util.Arrays;
public class task1_7 {
    public static void main(String[] args) {
        System.out.println("Task №1");
        //Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arr1));
        changeArray(arr1);
        System.out.println(Arrays.toString(arr1));

        System.out.println("Task №2");
        //Задать пустой целочисленный массив размером 8.
        // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        int[] arr2 = new int[8];
        System.out.println(Arrays.toString(arr2));
        fillInArr2(arr2);
        System.out.println(Arrays.toString(arr2));

        System.out.println("Task №3");
        //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
        // пройти по нему циклом, и числа меньшие 6 умножить на 2;
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr3));
        multiplyInArr3(arr3);
        System.out.println(Arrays.toString(arr3));

        System.out.println("Task №4");
        //Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        int[][] arr4 = new int[5][5];
        System.out.println("Zeros");
        printSquare(arr4);
        fillDiagonalWithOnes (arr4);
        System.out.println("Fill diagonals");
        printSquare(arr4);
    }

    static void changeArray(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] < 1) inputArray[i] = 1;
            else inputArray[i] = 0;
            // используем условие    inputArray[i] = (inputArray[i] == 1) ? 0 : 1;
            // Можно сделать проще.  inputArray[i] = 1 - inputArray[i];
        }
    }

    static void fillInArr2(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = i * 3;
        }
    }

    static void multiplyInArr3(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] < 6) inputArray[i] = inputArray[i] * 2;
            //inputArray[i] = (inputArray[i] < 6) ? (inputArray[i] * 2) : inputArray[i];
        }
    }

    static void fillDiagonalsInArr3(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {

        }
    }

    static void printSquare(int[][] inputArr) {
        for (int i = 0; i < inputArr.length; i++) {
            System.out.println(Arrays.toString(inputArr[i]));
        }
    }
        static void fillDiagonalWithOnes ( int[][] arr4)
        {
            for (int i = 0; i < arr4.length; i++)
            {
                arr4[i][i] = 1;
                arr4[i] [arr4[i].length - 1 - i] = 1; // сам не додумался, плагиат, увы
            }
        }



}