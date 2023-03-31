package thuchanh.ArrayList_LinkedList;

public class ProductView {
    public static void main(String[] args) {
        ProductManager list = new ProductManager();
        list.add(1, "Ban", 500000);
        list.add(2, "Ghe", 150000);
        list.add(3, "Den", 50000);
        list.add(4, "Tu", 1000000);

        list.render();

        list.change(1,"Ban 4 chan", 350000);
        list.render();

        list.remove(2);
        list.render();

        list.find("Tu");
        list.find("Laptop");

        list.ascendingSort();
        list.render();

        list.descendingSort();
        list.render();
    }
}