package Seminar6.ClassWork;

import Seminar6.ClassWork.Model.Celsius;
import Seminar6.ClassWork.Model.Fahrenheit;
import Seminar6.ClassWork.Model.Kelvin;

public class Ex4_ConverterTemp {
    public static void main(String[] args) {
        Double t = 36.6;
        Double tFar = new Fahrenheit().convert(t);
        System.out.println("Конвертация в градусы по фаренгейту: "+tFar);
        Double tKelv = new Kelvin().convert(t);
        System.out.println("Конвертация в градусы по Кельвину: "+tKelv);
        Double tCel = new Celsius().convert(t);
        System.out.println("Конвертация в градусы по Цельсию: "+tCel);
    }
}
