package Seminar1.ClassWork;

import java.util.Scanner;

/**
 * Задача на то что бы поменять местами первую и вторую половину строки.
 * Задача на работу со строками
 */
public class Ex3 {
    private static Scanner scanner;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // обьявляем сканер
        System.out.print("Введите содержание строки для обработки: ");
        String str = sc.nextLine(); // Осуществляем вод строки с клавиатуры
        String sub1 = str.substring(0,str.length()/2);
        String sub2 = str.substring(str.length()/2);
        System.out.println("Результат: "+(sub2+sub1));
    }
}
