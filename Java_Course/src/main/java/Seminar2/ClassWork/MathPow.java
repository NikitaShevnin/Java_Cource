package Seminar2.ClassWork;

import java.util.Scanner;

/*
 * Задача: Реализуйте pow(x, n), которая вычисляет x, возведенное в степень n (т.е. xn).
 * Задача на возведение в степень и на функционал math
 */

public class MathPow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число формата double x: "); // число формата double надо писать через точку
        double x = sc.nextDouble();
        System.out.print("Введите целое число n (возведение в степень): ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Число X в степени n = " + (pow(x,n)));
    }

    public static double pow (double x, int n) {
        double result = x;
        for (int i = 0; i < n-1; i++) {
            result*=x;
        }
        return result;
    }
}
