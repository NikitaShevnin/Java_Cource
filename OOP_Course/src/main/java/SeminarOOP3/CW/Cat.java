package SeminarOOP3.CW;

public class Cat extends Animal{
    public Cat(Integer age, Integer weigh, String name) {
        super(age, weigh, name);
    }

    @Override
    public String toString() {
        return "Cat"+ this.getName() + " " + this.getWeigh();
    }
}
