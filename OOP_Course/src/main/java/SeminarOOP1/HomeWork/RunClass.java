package SeminarOOP1.HomeWork;

import SeminarOOP1.HomeWork.Operation.CoffeMachine;
import SeminarOOP1.HomeWork.Operation.Drinks;
import SeminarOOP1.HomeWork.Operation.HotDrinkTemp;

import java.util.ArrayList;

/**
 * Задача:
 * 1) Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура. (Done)
 * 2) Создать класс ГорячихНапитковАвтомат (CoffeMachine) реализующий интерфейс ТорговыйАвтомат и
 * реализовать перегруженный метод getProduct(int name, int volume, int temperature) выдающий продукт
 * соответствующий имени, объему и температуре.
 * 3) В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику
 * заложенную в программе
 */
public class RunClass {
    public static void main(String[] args) {

        CoffeMachine apparat = new CoffeMachine();

        apparat.addProduct(new HotDrinkTemp("Латте", 120.50, 90, 0.33));
        apparat.addProduct(new HotDrinkTemp("Капучино", 144.50, 80, 0.4));
        apparat.addProduct(new Drinks("Милкшейк", 200.00, 0.5));
        apparat.addProduct(new Drinks("Черный чай", 60.40,0.4));

        ArrayList list = apparat.getProduct("Латте",0.33, 90);
        System.out.println(list);
    }
}
