package Seminar2.ClassWork;

import java.util.Scanner;

/*
    Дана последовательность из N целых чисел. Найти сумму чисел, оканчивающихся на 5,
    перед которыми идет четное число.
 */
public class SummaEnd5 {
    public static void main (String[] args) {
        System.out.print("Вывод: сумма чисел, оканчивающихся на 5 = " + NumEnd5());
    }
    public static int NumEnd5 () {
        Scanner sc = new Scanner(System.in);
        int sum = 0; // Накопитель

        System.out.print("Задайте количество елементов последовательности n: ");
        int n = sc.nextInt();

        System.out.print("Введите lastNum: ");
        int lastNum = sc.nextInt(); // Ввод первого элемента перед циклом для дальнейшей обработки программой

        for (int i = 0; i < n; i++) {
            System.out.print("Введите " + i + "-й елемент последовательности чисел: ");
            int currentNum = sc.nextInt();

            if (currentNum % 10 == 5 && lastNum % 2 == 0){
                sum += currentNum;
            }
            lastNum = currentNum;
        }
        sc.close();
        return sum;
    }
}
