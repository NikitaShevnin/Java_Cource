// Условия задачи: 
// 1) Дана последовательность N целых чисел. Найти сумму простых чисел.

/*
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Seminar2_task1_PrimeNumbers 
{
    public static void range (String[] args) throws java.io.IOException
    {
        // заложил диапазон значений от 1 до n
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = in.nextInt();
        int [] arr = IntStream.rangeClosed(1, n).toArray();
        int [] summ;
        if (isPrime (arr))
        in.close();
    }

    private static static isPrime (int n) // проверка на истинность простое ли это число
    {
        int temp;
        if (n == 1) return false;
        for (int i = 2; i <= n / 2; i++) 
        {
            temp = n % i;
            if (temp == 0) return false;
        }
        return true;
    }
}

 */
