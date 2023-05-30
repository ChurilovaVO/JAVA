package JAVA.OOP.HomeWork1;

public abstract class HotDrink extends Product{
    private int volume;
    private String name;
    private int temperature;

    public HotDrink(String kind, double price, Long id, int volume, String name, int temperature) {
        super(kind, price, id);
        this.volume = volume;
        this.name = name;
        this.temperature = temperature;
    }

    public int getVolume() {return volume;}

    public void setVolume(int volume) {this.volume = volume;}

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString (){
        return  String.format("%s %s, %s грамм, температура %s'", getKind(), getName(), getVolume(),getTemperature());
    }
}
