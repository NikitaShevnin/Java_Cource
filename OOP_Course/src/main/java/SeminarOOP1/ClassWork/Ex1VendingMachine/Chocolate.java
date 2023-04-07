package SeminarOOP1.ClassWork.Ex1VendingMachine;

public class Chocolate extends Product {
    /**
     * Конструктор для передачи в main class
     * @param name Основное поле унаследованнное из родительского класса Product
     * @param price Основное поле унаследованнное из родительского класса Product
     * @param weight Дополнительное поле которое относится только к классу Chocolate.
     *               Это поле определяет дополнительную характеристику товара.
     */
    public Chocolate(String name, Double price, Double weight) {
        super(name, price);
        this.weight = weight;
    }

    /**
     * Обьявление переменной weight для отражения новой сущности
     * и добавляем геттер и сеттер к ней что бы её можно было бы вызвать в классе main
     */
    private Double weight;

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}
