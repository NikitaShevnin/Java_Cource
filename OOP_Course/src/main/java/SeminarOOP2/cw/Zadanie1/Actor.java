package SeminarOOP2.cw.Zadanie1;

public abstract class Actor implements ActorBehavoir {
    protected String name;
    public abstract String getName();
    protected boolean makeOrder;
    public boolean isMakeOrder(){
        return makeOrder;
    }
    protected boolean takeOrder;
    public boolean isTakeOrder(){
        return takeOrder;
    }
}
