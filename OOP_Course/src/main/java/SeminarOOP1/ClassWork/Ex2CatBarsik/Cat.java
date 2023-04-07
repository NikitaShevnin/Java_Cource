package SeminarOOP1.ClassWork.Ex2CatBarsik;

public class Cat extends CatAbctractClass implements CatInterface {

    private String name;
    private int age;

/**
 * геттеры и сеттеры мы тут оставляем для того что бы в дальнейшем обратиться к этим
 * полям имя и возраста кота из внешних классов
 */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void saySomething() {
        System.out.println("MEOW");
    }
    public void say(){
        System.out.println(name);
    }

    @Override
    public void sayWithInterface() {
        System.out.println(" Barsik say meow from interface ");
    }
}
