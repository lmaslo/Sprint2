package service;


import model.Food;

public class ShoppingCart {

    Food[] foodCart;

    public  ShoppingCart (Food[] food){
        this.foodCart=food;
    }


    //В классе ShoppingCart реализуй методы для работы с корзиной:
    //получить общую сумму товаров в корзине без скидки,
    public static double getAllSum() {
        double sum = 0;
        for (int i = 0; i < foodCart.length; i++) {
            sum = sum + foodCart[i].getPrice()*foodCart[i].getAmount();
        }
        return sum;
    }

/*
    //получить общую сумму товаров в корзине со скидкой,

    public static double getAllSumDiscount(Food[] food) {
        double sumDiscount = 0;
        for (int i = 0; i < food.length; i++) {
            if (food[i].getDiscount() == 0) {
                sumDiscount = sumDiscount + food[i].getPrice()*food[i].getAmount();
            } else {
                sumDiscount = sumDiscount + (food[i].getPrice() * food[i].getDiscount() / 100*food[i].getAmount());
            }
        }
        return sumDiscount;
    }

    //получить общую сумму всех вегетарианских продуктов в корзине без скидки.

    public static double getAllSumVegetarian(Food[] food) {
        double sumVegitarian = 0;
        for (int i = 0; i < food.length; i++) {
            if (food[i].isVegetarian()) {
                sumVegitarian = sumVegitarian + food[i].getPrice()*food[i].getAmount();
            }
        }
        return sumVegitarian;
    }*/
}
