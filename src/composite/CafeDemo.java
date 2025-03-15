package composite;

public class CafeDemo {
    public static void main(String[] args) {

        CafeShop cafeShop = new CafeShop("My Cafe");


        Product coffee = new Product("Coffee", 30000);
        Product tea = new Product("Tea", 25000);
        Product milkTea = new Product("Milk Tea", 35000);
        Product water = new Product("Water", 10000);


        Table table1 = new Table(1);
        table1.addItem(coffee);
        table1.addItem(tea);
        table1.addItem(water);


        Table table2 = new Table(2);
        table2.addItem(milkTea);
        table2.addItem(milkTea);  
        table2.addItem(water);


        cafeShop.addItem(table1);
        cafeShop.addItem(table2);

        System.out.println("Bàn " + table1.getTableNumber() + " : " + table1.getPrice() + " VND");
        System.out.println("Bàn " + table2.getTableNumber() + " : " + table2.getPrice() + " VND");
        System.out.println("Tổng : " + cafeShop.getPrice() + " VND");
    }

}
