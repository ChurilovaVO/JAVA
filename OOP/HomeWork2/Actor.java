package SEMINAR.OOP.HomeWork2;

import SEMINAR.OOP.Seminar2.ActorBehavior;

public abstract class Actor implements ActorBehavior {
    protected String name;
    protected boolean isMakeOrder; //статус пользователя (сделал заказ/не сделал)
    protected boolean isTakeOrder; // статус пользователя (забрал заказ/не забрал)
    protected boolean isStatusQueue; // статус пользователя (в очереди/не в очереди)


    public Actor(String name){
        this.name=name;
        this.isStatusQueue=false;
        this.isMakeOrder=false;
        this.isTakeOrder=false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatusQueue() {
        return isStatusQueue;
    }

    public void setMakeOrder(boolean makeOrder) {
        isMakeOrder = makeOrder;
    }

    public void setTakeOrder(boolean takeOrder) {
        isTakeOrder = takeOrder;
    }
}
