package composite;

public class Product implements IPriceItem {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}