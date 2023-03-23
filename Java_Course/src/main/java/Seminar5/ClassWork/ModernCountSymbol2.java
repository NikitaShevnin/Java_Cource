package Seminar5.ClassWork;

import java.util.HashMap;
import java.util.Map;

public class ModernCountSymbol2 {
    public static void main(String[] args) {
        Map<Character,Integer> mapCh = new HashMap<>();
        String str = "Паралелепипед";
        for (int i = 0; i < str.length(); i++) {
            mapCh.putIfAbsent(str.charAt(i),1);
            mapCh.put(str.charAt(i),mapCh.get(str.charAt(i))+1);
        }
        for (var entry:mapCh.entrySet()){
            System.out.println("Символ: "+ entry.getKey()+ " встретился "+ entry.getValue()+ " раз");
            //K getKey(): возвращает ключ объекта отображения
            //V getValue(): возвращает значение объекта отображения
        }
    }
}