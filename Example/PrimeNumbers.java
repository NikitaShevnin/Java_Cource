import java.util.Scanner;
 
public class PrimeNumbers {
 
    public static void main(String[] args) 
    {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter n = ");
        int n = str.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) 
        {
            System.out.print("vvedite chislo massiva + a[" + i + "]=");
            a[i] = str.nextInt();
            if (isPrime(a[i])) System.out.println(a[i] + " - простое число");
        }
        str.close();
    }
 
    private static boolean isPrime(int n) 
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