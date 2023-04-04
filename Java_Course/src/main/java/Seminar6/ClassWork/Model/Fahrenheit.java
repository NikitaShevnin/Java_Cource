package Seminar6.ClassWork.Model;

public class Fahrenheit implements Converter{
    @Override
    public Double convert (Double inputValue) {
        return inputValue * 9/5 + 32;
    }
}
