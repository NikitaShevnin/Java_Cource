package Seminar4.HW;

import java.util.LinkedList;
/*
Вывести список на экран в перевернутом виде (без массивов и ArrayList)
Пример:
1-> 2->3->4
Вывод:
4->3->2->1
 */
public class Task1_ReverseList {
    public static void main(String[] args) {
        LinkedList<Object> inputList = new LinkedList<>();
        for (int i = 0; i < 5; i++) inputList.add(i);

        System.out.println(inputList);
        LinkedList revers = reverseList(inputList);
        System.out.println(revers);
    }

    private static LinkedList reverseList(LinkedList inputList) {
        LinkedList result = new LinkedList();
        while (inputList.size() > 0) {
            result.addFirst(inputList.pop());
        }
        return result;
    }
}
