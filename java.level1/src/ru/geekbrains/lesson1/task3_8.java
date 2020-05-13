package ru.geekbrains.lesson1;

public class task3_8
{// 3 Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода
    static int calculation(int a, int b, int c, int d)
    {
        return a * (b + (c / d));
    }
// 4 Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
// если да – вернуть true, в противном случае – false;
    static boolean verificationAmount(int a, int b)
    {
     return (a+b >= 10 && a+b <= 20);
    }
// 5 Написать метод, которому в качестве параметра передается целое число,
// метод должен напечатать в консоль положительное ли число передали, или отрицательное;
// Замечание: ноль считаем положительным числом.
    static void verificationValue (int a){
        if (a<0) System.out.println("число отрицательное");
        else System.out.println("число положительное");
    }

// 6 Написать метод, которому в качестве параметра передается целое число,
// метод должен вернуть true, если число отрицательное
    static boolean verificationNamber ( int a){
        return a<0;
    }
// 7 Написать метод, которому в качестве параметра передается строка, обозначающая имя,
// метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
    static void printMyName (String txt){
        System.out.println("Привет," + txt + "!");
    }
// 8  Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
// Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    static void verificationYear (int year){
        //if (year%4==0 || year%100==0 || year%400==0) System.out.println("год високосный"); // неверно
       // if (year % 4 == 0 && !(year % 100 == 0) && year % 400 == 0) System.out.println("год високосный"); // неверно
        if (year % 4 == 0 && (year % 100 > 0) || year % 400 == 0) System.out.println("год високосный");
        else System.out.println("год не високосный");
}

    public static void main(String[] args)
    {
      System.out.println(calculation (1,-2,3,4));

      System.out.println(verificationAmount ( 44, 12));
      System.out.println(verificationAmount ( 4, 12));

      verificationValue (-1);

      System.out.println(verificationNamber (-1));

      printMyName ("Сергей");

      verificationYear (2020);


    }
}
