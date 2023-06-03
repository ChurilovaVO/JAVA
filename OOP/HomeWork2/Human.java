package SEMINAR.OOP.HomeWork2;

public class Human extends Actor {
    private  int age;
    private String address;

    public Human(String name, int age, String address) {
        super(name);
        this.age=age;
        this.address=address;
    }

    //Имплементация интерфейса
    @Override
    public void setMakeOrder() {
        System.out.println(name + "- сделал заказ!");
        isMakeOrder=true;
    }

    @Override
    public void setTakeOrder() {
        System.out.println(name + "- забрал заказ!");
        isTakeOrder=true;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    //Геттеры и сетеры
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
        // перегрузка toString
    @Override
    public String toString() {
        return String.format("Клиент: %s, возраст %s, адрес: %s,%s, статус заказа:%s",
                name,age,address, statusQueue(),statusOrder());
    }

    public String statusOrder(){
        if (isTakeOrder){
            return "Клиент ЗАБРАЛ заказ!";
        }
        if (isMakeOrder){
            return "Клиент СДЕЛАЛ заказ!";
        }
        return "Заказ еще не сделан!";
    }
    public String statusQueue(){
        if (isStatusQueue){
            return "В очереди!";
        }
        return "Не в очереди";
    }
    public void setStatusQueue(boolean statusQueue) {
        this.isStatusQueue = statusQueue;
    }
     }
