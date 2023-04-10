package SeminarOOP2.hw.Operation;

import java.util.stream.Stream;

public class NameFilter {
    public static void searchName (String[] args) {
        // фильтр по именам
        Stream<NotebookData> NameStream = Stream.of(
                new NotebookData("dexp", 4, 128, "windows"),
                new NotebookData("dexp", 16, 64, "windows"),
                new NotebookData("MacBookAir", 8, 256, "macOS"),
                new NotebookData("MSI", 8, 256, "windows"));

        NameStream
                .map(p-> p.getName())
                .forEach(s->System.out.println("Название ноутбука: "+s));
    }
}
