package Seminar6.FilterOfCityes;
import java.util.*;

/**
 * Фильтруем города по колличеству символов в слове
 * Задан параметр 6 символов если менее то ничего не выводится.
 */
public class ExFilter {
    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<String>();
        Collections.addAll(cities, "Париж", "Лондон", "Мадрид", "Барселона");
        cities.stream() // Создаем поток
                .filter(s->s.length()==6) // применяем фильтрацию по длине строки
                .forEach(s->System.out.println(s)); // выводим отфильтрованные строки на консоль
    }
}
