package model;

import static model.constants.Discount.DISCOUNT;

public class Apple extends Food {
    private String color;

    public Apple(int amount, double price, String color) {
        this.amount = amount;
        this.price = price;
        this.color = color;
        isVegetarian = true;
    }

    public double getDiscount() {
        if (color.equals("red")) {
            return DISCOUNT;
        } else {
            return 0;
        }
    }
}
