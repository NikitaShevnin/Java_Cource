package SeminarOOP1.ClassWork.Ex1VendingMachine;

/**
 * В классе Product мы описываем товары, у каждого продукта есть название и цена.
 * Так же имеется конструктор по умолчанию который принимает название и цену,
 * заполняет внутренние поля с именем и ценой.
 */
public abstract class Product {
    private String name;
    private Double price;

    public Product (String name, Double price) {
        this.name = name;
        this.price = price;
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

/**
     * Здесь у нас происходит перегрузка (конвертация) метода toString
     * для дальнейшего вывода аргументов в виде строки.
     * @return - возвращаемая строка после перегрузки.
     */
    @Override
    public String toString() {
        return "Name: " + name + " Price: " + price;
    }
}
