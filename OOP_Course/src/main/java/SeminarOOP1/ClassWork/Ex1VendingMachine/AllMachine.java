package SeminarOOP1.ClassWork.Ex1VendingMachine;

import java.util.ArrayList;

public interface AllMachine {
    public ArrayList getProductByName (String searchName);
    public ArrayList getProductByPrice (Double searchPrice);
    public void addProduct (Product newItem);
}
