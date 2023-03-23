package Seminar5.HomeWork;

import java.util.HashMap;
import java.util.Map;

/*
Подсчитать количество искомого слова, через map (наполнением значение, где искомое слово будет являться ключом),
вносить все слова не нужно
 */
public class CountWords2 {
    public static void main(String[] args) {
        String inputString = "Работа — это поклонение, работа — это жизнь;".toLowerCase();
        String searchWord = "работа".toLowerCase();
        Integer count = searchWord(inputString, searchWord);
        System.out.println("Колличество вхождений слова "+ searchWord + " Составляет: " + count);

    }

    private static Integer searchWord(String inputString, String searchWord) {
        Map<String, Integer> count = new HashMap<>();
        for (String longWord : inputString.split(" ")) {
            String word = longWord.replaceAll("[^А-Яа-яЁё]", "");
            if (word.equals(searchWord)) {
                Integer item = count.get(word);
                if (item == null) item = 0;
                count.put(word, ++item);
            }
        }
        return count.get(searchWord);
    }
}