package Seminar6.HomeWork.Operation;

import java.util.Scanner;
import java.util.stream.Stream;

public class HDSFilter {
    public static void searchHDS (String[] args) {
        // фильтр на размер жесткого диска
        Stream<NotebookData> HDStream = Stream.of(
                new NotebookData("dexp", 4, 128, "windows"),
                new NotebookData("Irbis", 16, 64, "windows"),
                new NotebookData("MacBookAir", 8, 256, "macOS"),
                new NotebookData("MSI", 8, 256, "windows"));

        System.out.print("Введите необходимый объём жесткого диска: ");
        Scanner sc = new Scanner(System.in);
        int enterHD = sc.nextInt();

        HDStream.filter(a -> a.getHardDiskSize() < enterHD)
                .forEach(a -> System.out.println("Параметр поиска жесткого диска: " + a.getHardDiskSize()));
        sc.close();
    }
}
