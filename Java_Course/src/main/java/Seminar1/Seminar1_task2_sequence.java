//        Дана последовательность целых чисел, оканчивающаяся нулем. 
//        Найти сумму положительных чисел,
//        после которых следует отрицательное число.
//        Пример ввода: 1 2 1 2 -1 1 3 1 3 -1 0

import java.util.Scanner;

public class Seminar1_task2_sequence

{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значения цифер (ввод 0 прекратит этот цикл)");
        int sum = 0;
        int a = scan.nextInt();
        int b;
        do 
        {
            b = scan.nextInt();
            if (b < 0 & a > 0) sum += a;
        }
        while (b != 0);
        System.out.println("result: " + sum);
        scan.close();
    }
}