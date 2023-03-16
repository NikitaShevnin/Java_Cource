package Seminar3.task2;

import Seminar3.task2.model.Product_information;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Задача№2. Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
Получить наименования товаров заданного сорта с наименьшей ценой.
 */

public class Task2_lowest_price
{
    public static void main (String[] args)
    {
        // Обьявление коллекции
        Product_information item1 = new Product_information("Bananas", "Russia", 3, 323, 1);
        Product_information item2 = new Product_information("vegetables", "Russia", 8, 346, 2);
        Product_information item3 = new Product_information("Meat", "Russia", 12, 32, 1);
        Product_information item4 = new Product_information("Paste", "Italy", 12, 214, 3);

        // Добавление данных
        List<Product_information> listItem = new ArrayList<>();
        listItem.add(item1);
        listItem.add(item2);
        listItem.add(item3);
        listItem.add(item4);

        // обработка данных
        Scanner sc = new Scanner(System.in);
        String minPriceName = "";
        int min = Integer.MAX_VALUE;
        int variety = sc.nextInt();
        for (int i = 0; i < listItem.size(); i++)
        {
            if (listItem.get(i).getProductGrade() == variety)
            {
                if (listItem.get(i).getPriceOfProduct() < min)
                {
                    min = listItem.get(i).getPriceOfProduct();
                    minPriceName = listItem.get(i).getNameOfProduct();
                }
            }
        sc.close();
        System.out.println(minPriceName);
        }
    }
}
