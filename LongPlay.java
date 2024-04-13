package Excercise1;

public class LongPlay extends Recording {
    public LongPlay(String name, String artist, int year, int condition, double price) {
        super(name, artist, year, condition, price);

    }

    @Override
    public double getPrice() {
        return ((2024 - getYear()) * 5) + super.getPrice();
    }

    @Override
    public String getType() {
        return "LP";
    }

}