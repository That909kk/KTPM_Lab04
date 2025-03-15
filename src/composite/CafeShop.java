package composite;

public class CafeShop extends Container {
    private String name;

    public CafeShop(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}