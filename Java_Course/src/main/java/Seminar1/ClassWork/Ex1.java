package Seminar1.ClassWork;

import java.util.Scanner;

/**
 * Задачка на использование остатков от деления
 * Работа на семнаре 1
 */

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение для вычислений: ");
        int n = scanner.nextInt(); // в это месте мы вводим значение для вычисления
        System.out.println(subtractProductAndSum(n)); // вывод на экран результатов работы програамы и методов
        scanner.close(); // Завершаем работу сканера
    }

     private static int subtractProductAndSum (int n){
         int sum = 0, multi = 1;
         while (n!=0) {
             sum += n % 10;
             multi *= n % 10;
             n /= 10;
         }
         return multi-sum;
     }
}