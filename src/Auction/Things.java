package Auction;

public class Things {

    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Things(double price, String name) {
        setName(name);
        setPrice(price);
    }
}
