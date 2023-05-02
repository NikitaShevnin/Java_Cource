package SeminarOOP5_MVC.CW.model;

public class User {
    private Integer userID;

    private String name;

    private Integer age;

    public User(Integer userID, String name, Integer age) {
        this.userID = userID;
        this.name = name;
        this.age = age;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * метод toString используем для корректной выдачи данных
     * @return Возвращаемые значения переменных Name и Age.
     */
    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
