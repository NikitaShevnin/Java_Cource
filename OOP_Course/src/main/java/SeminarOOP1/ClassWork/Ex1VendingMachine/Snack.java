package SeminarOOP1.ClassWork.Ex1VendingMachine;

public class Snack extends Product{
    public Snack(String name, Double price, Integer calorie) {
        super(name, price);
        Calorie = calorie;
    }

    private Integer Calorie;

    public Integer getCalorie() {
        return Calorie;
    }

    public void setCalorie(Integer calorie) {
        Calorie = calorie;
    }
}
