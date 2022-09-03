

public enum Grocery {

    FRIDGE(400),
    TV(600),
    WASHING_MACHINE(800),
    ESPRESSO_MACHINE(250);

    final int price;
    Grocery(int price) {
        this.price = price;
    }
}
