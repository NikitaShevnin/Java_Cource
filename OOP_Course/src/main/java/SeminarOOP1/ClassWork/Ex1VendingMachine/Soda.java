package SeminarOOP1.ClassWork.Ex1VendingMachine;

public class Soda extends Product{

    public Soda(String name, Double price, Double volumeLitter) {
        super(name, price);
        VolumeLitter = volumeLitter;
    }

    private Double VolumeLitter;

    public Double getVolumeLitter() {
        return VolumeLitter;
    }

    public void setVolumeLitter(Double volumeLitter) {
        VolumeLitter = volumeLitter;
    }
}
