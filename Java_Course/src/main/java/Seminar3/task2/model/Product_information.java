package Seminar3.task2.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Product_information
{
    private String nameOfProduct;
    private String countryOfOrigin;
    private int WeightOfGoods;
    private int priceOfProduct;
    private int productGrade;
}
