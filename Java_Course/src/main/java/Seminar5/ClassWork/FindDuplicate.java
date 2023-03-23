package Seminar5.ClassWork;

import java.util.HashMap;
import java.util.Map;

/*
* Определить, есть ли в массиве дубликаты, если найден хоть один, вывести на экран (true),
* В противном случае (false).
*/
public class FindDuplicate {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println("Наличие дубликатов = "+ searchDubl(arr));
    }
    private static boolean searchDubl (int[] arr){
        Map<Integer, Integer> testMass = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (testMass.containsKey(arr[i])){
                // containsKey вернет true, если в мапе есть соответсвующий ключ
                return false;
            }
            else testMass.put(arr[i], 1);
            }
        return true;
        }
    }
