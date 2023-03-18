package Seminar1.ClassWork;

import java.util.Scanner;

/**
 * Задачка на использование остатков от деления
 * Работа на семнаре 1
 */

public class Ex1
{
    public static void main(String[] args) {
        int sum = 0, multi = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение для вычислений: ");
        int n = scanner.nextInt();
        while (n!=0) {
            sum += n % 10;
            multi *= n % 10;
            n /= 10;
        }
        scanner.close();
        System.out.println("Result = " + (multi - sum));
    }
}
