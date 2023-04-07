package SeminarOOP1.ClassWork.Ex2CatBarsik;

public class main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("cat Barsik");
        cat.setAge(13);
        System.out.print(cat.getName()+" которому "+cat.getAge()+" лет "+"Говорит нам: ");
        cat.saySomething();
        cat.sayWithInterface();
    }
}
