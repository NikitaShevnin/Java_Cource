package SeminarOOP3.CW;

public class Dog extends Animal {
    public Dog(Integer age, Integer weigh, String name) {
        super(age, weigh, name);
    }

    @Override
    public String toString() {
        return "Dog"+ this.getName() + " " + this.getWeigh();
    }
}
