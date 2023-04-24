package SeminarOOP1.HomeWork.Operation;

public class HotDrinkTemp extends Drinks{
    public HotDrinkTemp(String name, Double price, Integer temperatura, Double volume) {
        super(name, price, volume);
        Temperatura = temperatura;
        Volume = volume;
    }

    private Integer Temperatura;
    private Double Volume;

    @Override
    public Double getVolume() {
        return Volume;
    }

    public void setVolume(Double volume) {
        Volume = volume;
    }

    public Integer getTemperatura() {
        return Temperatura;
    }

    public void setTemperatura(Integer temperatura) {
        Temperatura = temperatura;
    }
}
