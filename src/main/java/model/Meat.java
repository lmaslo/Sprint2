package model;

public class Meat extends Food {
    public Meat(int amount, double price) {
        this.amount = amount;
        this.price = price;
        isVegetarian = false;
    }

    public double getDiscount() {
        return 0;
    }

}

