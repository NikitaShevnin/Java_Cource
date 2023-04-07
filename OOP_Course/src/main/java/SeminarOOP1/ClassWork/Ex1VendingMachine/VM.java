package SeminarOOP1.ClassWork.Ex1VendingMachine;

import java.util.ArrayList;

/**
 * Это специальный класс для управления торговым аптоматом. Внутри расположен список товаров
 * в которые содержатся внутри
 */
public class VM implements AllMachine {
    private ArrayList <Product> list;

    /**
     * Тут у нас задействован конструктор по умолчанию для того что бы положить в него данные из ArrayList
     * для дальнейшей передачи в класс main
     */
    public VM () {
        list = new ArrayList<Product>(); // list/переменная = ArrayList (массив) <Тип Product> ();
    }

    /**
     * Метод для наполнения массива нужными нам элементами. Для этого в рамках инкапсуляции
     * создан отдельный метод для выполнения этой задачи. Тут принимается на вход продукт
     * и далее он добавляется во внутренний защищенный список с уровнем доступа private.
     * @param newItem
     */
    public void addProduct (Product newItem){
        list.add (newItem);
    }

    /**
     * Тут у нас производится перебор списка по элементам с поиском заданного нами в main по имени
     * продукта товара.
     * @param searchName метод поиска по имени
     * @return возврат результата
     */
    public ArrayList getProductByName (String searchName){
        ArrayList <Product> result = new ArrayList<>();
        for (Product item: list){
            if (item .getName().contains(searchName)){
                result.add(item);
            }
        }
    return result;
    }

    /**
     * Тут идёт перебор массива данных по другому критерию по цене. По той же технологии
     * как и в предыдущем методе getProductByName.
     * @param searchPrice метод поиска по цене
     * @return - возврат результата
     */
    public ArrayList getProductByPrice (Double searchPrice){
        ArrayList <Product> result = new ArrayList<>();
        for (Product item: list){
            if (item .getName().equals(searchPrice)){
                result.add(item);
            }
        }
        return result;
    }
}
