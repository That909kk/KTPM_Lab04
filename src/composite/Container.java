package composite;

import java.util.ArrayList;
import java.util.List;

public abstract class Container implements IPriceItem {
    protected List<IPriceItem> items = new ArrayList<>();

    public void addItem(IPriceItem item) {
        items.add(item);
    }

    public void removeItem(IPriceItem item) {
        items.remove(item);
    }

    @Override
    public int getPrice() {
        return items.stream().mapToInt(IPriceItem::getPrice).sum();
    }
}