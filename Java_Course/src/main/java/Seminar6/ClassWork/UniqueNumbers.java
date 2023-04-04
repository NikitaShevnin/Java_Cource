package Seminar6.ClassWork;

import java.util.*;

/*
* Дан массив чисел, посчитать процент уникальных чисел.
* процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
*/
public class UniqueNumbers {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,7,2,3,1));
        Set<Integer> set = new HashSet<>(arr);
        double pr = set.size()*100/ arr.size(); // Для классов оберток используют size для примитива length
        System.out.println("процент = "+pr);
    }
}
