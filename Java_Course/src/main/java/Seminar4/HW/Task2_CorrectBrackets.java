package Seminar4.HW;

/*
Дана строка S содержащая символы '(', ')', '{', '}', '[' и ']' определить является ли введенная строка
правильной.
Строка будет правильна если:
- Открытая скобка должна быть закрыта скобкой того же типа
- Открытые скобки должны быть закрыты в правильном порядке
- Каждой закрывающейся скобке соттветствует скобка того же типа
 */

import java.util.Deque;
import java.util.LinkedList;
public class Task2_CorrectBrackets {
    public static void main(String[] args) {
        String inputString1 = "()";
        String inputString2 = "()[]{}";
        String inputString3 = "(]";
        String inputString4 = "[(])";
        String inputString5 = "]";
        System.out.println(inputString1 + ": " + isValid(inputString1));
        System.out.println(inputString2 + ": " + isValid(inputString2));
        System.out.println(inputString3 + ": " + isValid(inputString3));
        System.out.println(inputString4 + ": " + isValid(inputString4));
        System.out.println(inputString5 + ": " + isValid(inputString5));
    }

    private static boolean isValid(String inputString) {
        char[] arr = inputString.toCharArray();
        Deque qu = new LinkedList();
        String open = "([{";
        for (Character ch : arr) {
            if (open.contains(ch.toString())) qu.add(ch);
            else if (qu.isEmpty()) return false;
            else if (ch.equals(']') && !qu.pollLast().equals('[')) return false;
            else if (ch.equals(')') && !qu.pollLast().equals('(')) return false;
            else if (ch.equals('}') && !qu.pollLast().equals('{')) return false;
        }
        return qu.isEmpty();
    }
}
