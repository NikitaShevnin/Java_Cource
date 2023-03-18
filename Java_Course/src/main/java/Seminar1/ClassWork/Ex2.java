package Seminar1.ClassWork;

import java.util.Scanner;

/**
 * Задан диапазон в n чисел. Найти кол-во положительных чисел, после которых следует отрицательное число.
 * Решение через циклы без массива.
 */
public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите n чисел: ");
        int n = sc.nextInt();
        int quantity = 0; // в задаче это k
        System.out.print("Введите а: ");
        int a = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Введите b: ");
            int b=sc.nextInt();
            if (a>0 && b<0){
                quantity++ ; // при выполнении условия if мы добавляем в накопитель кол-во правильных чисел
            }
            a=b; // переприсваиваение значеня в переменную "а" что бы продивнуться дальше по циклу
        }
        System.out.print("Количество цифер перед отрицательными составляет: "+ quantity);
        sc.close();
    }
}
