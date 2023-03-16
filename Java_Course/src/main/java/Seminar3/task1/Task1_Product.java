package Seminar3.task1;

import Seminar3.task1.DataModel.model;
import java.util.ArrayList;
import java.util.List;

/*
* 1. Дан массив записей: наименование товара, цена, сорт. Найти наибольшую цену товаров 1го или 2го
* сорта среди товаров, название которых содержит «высший».
*/

public class Task1_Product
{
    public static void main (String[] args)
    {
        model items1 = new model ("Рыба высшего сорта", "первый", 95);
        model items2 = new model ("fish", "третий", 45);
        model items3 = new model ("fish", "второй", 70);
        model items4 = new model ("Рыба высшего сорта", "третий", 60);

        List<model> modelList= new ArrayList<>();
        modelList.add(items1);
        modelList.add(items2);
        modelList.add(items3);
        modelList.add(items4);


        int maxCostOfProduct = 0;

        for (int i = 0; i< modelList.size(); i++)
        {
            if (modelList.get(i).getNameOfProduct().contains("высшего"))
            {
                if (modelList.get(i).getCostOfProduct() > maxCostOfProduct)
                {
                    maxCostOfProduct = modelList.get(i).getCostOfProduct();
                }
            }
        }
    }
}