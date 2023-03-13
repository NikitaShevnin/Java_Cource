// 1) Дана последовательность N целых чисел. Найти сумму простых чисел.

import java.util.Scanner;

public class Chernovik 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("sum = " + sumSimpleSequence(n));
        sc.close();
    }

    public static int sumSimpleSequence(int n)
    {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < n; i++) 
        {
            int a = sc.nextInt();
            if (isSimple(a)) sum += a;
        }
        sc.close();
        return sum;
    }

    public static boolean isSimple(int a) {
        Double sq = Math.sqrt(a);
        for (int i = 2; i <= sq.intValue(); i++) 
        {
            if (a % i == 0) return false;
        }
        return true;
    }
}