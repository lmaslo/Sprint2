package model;

public abstract class Food implements Discountable {

    protected int amount;
    protected double price;
    protected boolean isVegetarian;

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public double getAmountPrice() {
        return amount*price;
    }
}

