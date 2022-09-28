package model;

import static model.constants.Colour.*;
import static model.constants.Discount.*;

public class Apple extends Food {
    private String color;

    public Apple(int amount, double price, String color) {
        this.amount = amount;
        this.price = price;
        this.color = color;
        isVegetarian = true;
    }

    public double getDiscount() {
        /*if (color.equals(COLOR_RED)) {
            return DISCOUNT;
        } else {
            return NOT_DISCOUNT;
        }*/
        return color.equals(COLOR_RED) ? DISCOUNT:NOT_DISCOUNT;
    }
}
