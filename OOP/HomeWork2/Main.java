package SEMINAR.OOP.HomeWork2;

public class Main {
    public static void main(String[] args) {
        Market market= new Market();
        Actor sten = new Human("Sten", 54, "USA");
        Actor john = new Human("Jhon", 42, "Columbia");
        Actor sisi = new Human("Sisi", 34, "Africa");

        System.out.println(sten);
        System.out.println(john);
        System.out.println(sisi);

        market.takeOrders(john);
        market.update();

        market.acceptToMarket(john);
        market.takeInQueue(john);
        market.update();
        System.out.println(john);
        market.takeOrders(john);
        market.update();

        System.out.println(john);

        market.acceptToMarket(sten);
        market.acceptToMarket(sisi);
        market.takeInQueue(sisi);
        market.takeInQueue(sten);
        market.giveOrders(john);
        market.update();

        System.out.println(john);

        market.takeOrders(sisi);
        market.takeOrders(sten);
        market.update();

        market.releaseFromMarket(john);

        System.out.println(sten);
        System.out.println(john);
        System.out.println(sisi);

        market.giveOrders(sisi);
        market.giveOrders(sten);

        market.update();



    }
}
