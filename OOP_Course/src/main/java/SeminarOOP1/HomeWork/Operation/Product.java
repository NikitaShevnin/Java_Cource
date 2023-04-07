package SeminarOOP1.HomeWork.Operation;
/**
 * реализовать перегруженный метод getProduct(int name, int volume, int temperature) выдающий продукт
 * соответствующий имени, объему и температуре.
 */
public class Product {
    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    private String name;
    private Double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
