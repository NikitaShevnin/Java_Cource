package SeminarOOP2.cw.Zadanie2;

import SeminarOOP2.cw.Zadanie1.ActorBehavoir;

public abstract  class Actor implements ActorBehavoir {

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

    public String getName;
}
