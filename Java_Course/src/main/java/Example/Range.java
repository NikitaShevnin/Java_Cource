// Создание диапазона от 1 до N

package Example;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.Scanner;

public class Range 

{
    public static void range (String[] args) throws java.io.IOException
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = in.nextInt();
        int [] arr = IntStream.rangeClosed(1, n).toArray();
        System.out.print("Диапазон от 1 до n = ");
        System.out.println(Arrays.toString(arr));
        in.close();
    }    
}
