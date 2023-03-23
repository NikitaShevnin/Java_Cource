package Seminar5.ClassWork;

/*
* Задача: Посчитать количество вхождений каждого символа в текст.
* Код считает количество вхождений кадого символа.
*/
import java.util.HashMap;
import java.util.Map;

public class CountSymbol1 {
    public static void main(String[] args) {
        Map<Character,Integer> mapCh = new HashMap <>();
        String str = "Паралелепипед";
        for (int i = 0; i < str.length(); i++) {
            if (!mapCh.containsKey(str.charAt(i))){
                //boolean containsKey(Object k): возвращает true, если коллекция содержит ключ i
                mapCh.put(str.charAt(i),1);
                // Чтобы добавить или заменить элемент, используется метод put
            }
            else {
                mapCh.put(str.charAt(i), mapCh.get(str.charAt(i))+1);
            }
        for (var entry:mapCh.entrySet()){
            System.out.println("Символ: "+ entry.getKey()+ " встретился "+ entry.getValue()+ " раз");
            //K getKey(): возвращает ключ объекта отображения
            //V getValue(): возвращает значение объекта отображения
        }
        }
    }
}
