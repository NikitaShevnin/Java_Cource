package Seminar2;

import java.util.Scanner;

/**
 * 1) Дана последовательность N целых чисел. Найти сумму простых чисел.
 */

public class Seminar2_task1_PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("sum = " + sumSimpleSequence(n));
    }

    /**
     * @param n длина последовательности
     * @return возвращаем в предыдущий метод накопленную сумму простых чисел после работы цикла for
     */
    public static int sumSimpleSequence(int n){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (isSimple(a)) sum += a;
        }
        return sum;
    }
    /**
     * Проверка числа на простоту производится в этом алгоритме.
     * @param a проверяемое число
     * @return является ли число простым
     */
    public static boolean isSimple(int a) {
        Double sq = Math.sqrt(a);
        for (int i = 2; i <= sq.intValue(); i++) {
            if (a % i == 0) return false;
        }
        return true;
    }
}