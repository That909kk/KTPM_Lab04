package composite;
public class Table extends Container {
    private int tableNumber;

    public Table(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public int getTableNumber() {
        return tableNumber;
    }
}