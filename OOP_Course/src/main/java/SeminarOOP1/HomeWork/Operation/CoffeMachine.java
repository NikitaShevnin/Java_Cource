package SeminarOOP1.HomeWork.Operation;
import java.util.ArrayList;
/**
 * Тут распологается центр обработки всех запросов через циклы
 * Тут унаследованные поля из интерфейса должны получить реализацию
 */
public class CoffeMachine extends Product {
    private ArrayList <Product> list;

    public CoffeMachine() {
        super("Latte", 150.10, 0.5);
        list = new ArrayList<>();
    }

       public CoffeMachine(String name, Double price, Double volume) {
        super(name, price, volume);
    }

    public void addProduct (Product newItem){
        list.add(newItem);
    }

    public ArrayList getProduct (String searchName, Double SearchVol, Integer SearchTemp){
        ArrayList <Product> SearchResult = new ArrayList<>();
        for (Product item: list){
            if (item .getName().contains(searchName) && getVolume().equals(SearchVol) && getTemperatura().equals(SearchTemp)){
                SearchResult.add(item);
            }
        }
    return SearchResult;
    }

    private Object getTemperatura() {
        return null;
    }

    public ArrayList FindProductPrice (Double searchPrice){
        ArrayList <Product> result = new ArrayList<>();
        for (Product item: list){
            if (item .getName().equals(searchPrice)){
                result.add(item);
            }
        }
        return result;
    }
}
