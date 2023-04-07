package SeminarOOP1.ClassWork.Ex1VendingMachine;

import java.util.ArrayList;

public class main {
    /**
     * Реализация всей программы.
     * @param args
     */
    public static void main(String[] args) {
        VM machine = new VM();
        machine.addProduct(new Chocolate("Alenka",111.90, 90.5));
        machine.addProduct (new Soda("CocaCola",59.99, 0.5));
        machine.addProduct (new Chocolate("Snickers",45.60,80.0));
        machine.addProduct (new Soda("Fanta",60.44, 0.6));
        machine.addProduct (new Snack("Salted peanuts",112.90, 610));
        machine.addProduct (new Snack("sandwich",144.37, 183));

        ArrayList list = machine.getProductByName("Salted");
        System.out.println(list);
    }
}
