package SeminarOOP1.HomeWork.Operation;

public abstract class Product {

    public Product(String name, Double price, Double volume) {
        this.name = name;
        this.price = price;
        Volume = volume;
    }

    private String name;
    private Double price;
    private Double Volume;

    public Double getVolume() {
        return Volume;
    }

    public void setVolume(Double volume) {
        Volume = volume;
    }

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
