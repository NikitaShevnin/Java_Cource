package SeminarOOP2.hw.Operation;

import SeminarOOP2.hw.Operation.*;


import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Задание :
 * • Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
 * • Создать множество ноутбуков.
 * • Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
 * отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
 * “Введите цифру, соответствующую необходимому критерию:
 * 1 - ОЗУ
 * 2 - Объем ЖД
 * 3 - Операционная система
 * 4 - Цвет т.д.
 * • Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
 * • Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 */
public class RunClass {

    public static void main (String[] args) {
        System.out.println(
                "1 - ОЗУ \n" +
                "2 - Объем ЖД \n" +
                "3 - Операционная система \n" +
                "4 - Название ноутбука; ");
        System.out.print ("Введите цифру, соответствующую необходимому критерию: ");
        Scanner sc = new Scanner(System.in);
        switch (sc.nextInt()){
            case 1:
                OZUFilter OZUPrint = new OZUFilter();
                System.out.println("Филтр по ОЗУ: "+OZUPrint);
                break;
            case 2:
                HDSFilter HDSPrint = new HDSFilter();
                System.out.println("Филтр по жесткому диску: "+HDSPrint);
                break;
            case 3:
                OSFilter OSPrint = new OSFilter();
                System.out.println("Филтр операционной системе: "+OSPrint);
                break;
            case 4:
                NameFilter NamePrint = new NameFilter();
                System.out.println("Филтр по названию ноутбука: "+NamePrint);
                break;
        }
    }
}
