package JAVA.OOP.HomeWork1;

public class Main {
    public static void main(String[] args) {
        Vending newVending = new HotDrinkVending();

        HotDrink newHotDrink1 = new HotDrinkTea("Чай", 187, 1L, 200, "Curtis",60);
        HotDrink newHotDrink2 = new HotDrinkTea("Чай", 98, 2L, 100, "Лисма", 45);
        HotDrink newHotDrink3 = new HotDrinkCoffe("Кофе", 215, 3L, 150, "Nescafe", 50);

        newVending.addProduct(newHotDrink1);
        newVending.addProduct(newHotDrink2);
        newVending.addProduct(newHotDrink3);

        System.out.println(newVending.getProduct("Чай"));
        System.out.println(newVending.getProduct("Лисма", 50, 50));

    }
}
