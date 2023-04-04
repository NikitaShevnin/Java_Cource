package Seminar6.HomeWork.Operation;

import java.util.stream.Stream;
import java.util.Scanner;

public class OZUFilter {
    public static void SearchOZU (String[] args) {
        // фильтр на ОЗУ
        Stream<NotebookData> OZUStream = Stream.of(
                new NotebookData("dexp", 4, 128, "windows"),
                new NotebookData("Irbis", 16, 64, "windows"),
                new NotebookData("MacBookAir", 8, 256, "macOS"),
                new NotebookData("MSI", 8, 256, "windows"));

        System.out.print("Введите необходимый объём ОЗУ: ");
        Scanner sc = new Scanner(System.in);
        int enterOZU = sc.nextInt();

        OZUStream.filter(a -> a.getOZU() < enterOZU)
                .forEach(a -> System.out.println("Параметр подходящий по критерию поиска: " + a.getOZU()));
        sc.close();
    }
}
