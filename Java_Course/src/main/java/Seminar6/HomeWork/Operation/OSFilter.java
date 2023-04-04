package Seminar6.HomeWork.Operation;

import java.util.stream.Stream;

public class OSFilter {
    public static void OS (String[] args) {
        // фильтр по именам
        Stream<NotebookData> OSStream = Stream.of(
                new NotebookData("dexp", 4, 128, "windows"),
                new NotebookData("dexp", 16, 64, "windows"),
                new NotebookData("MacBookAir", 8, 256, "macOS"),
                new NotebookData("MSI", 8, 256, "windows"));

        OSStream
                .map(p -> p.getOperatingSystem()) // вывод всех названий из картегории Name
                .forEach(s -> System.out.println("Название ноутбука: " + s));
    }
}
