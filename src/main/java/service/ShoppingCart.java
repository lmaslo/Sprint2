package service;
import model.Food;

import static model.constants.Discount.NOT_DISCOUNT;

public class ShoppingCart {

    Food[] foodCart;

    public  ShoppingCart (Food[] food){
        this.foodCart=food;
    }

    //В классе ShoppingCart реализуй методы для работы с корзиной:
    //получить общую сумму товаров в корзине без скидки,
    public double getAllSum() {
        double sum = 0;
        for (Food food : foodCart) {
            sum = sum + food.getPrice()*food.getAmount();
        }
        return sum;
    }

    //получить общую сумму товаров в корзине со скидкой,
    public double getAllSumDiscount() {
        double sumDiscount = 0;
        for (Food food : foodCart) {
            if (food.getDiscount() == NOT_DISCOUNT) {
                sumDiscount = sumDiscount + food.getPrice()*food.getAmount();
            } else {
                double costDiscountFood=  (food.getPrice()*food.getAmount()) - (food.getPrice()*food.getAmount() *food.getDiscount()/100);
                sumDiscount = sumDiscount+costDiscountFood;
            }
        }
        return sumDiscount;
    }

    //получить общую сумму всех вегетарианских продуктов в корзине без скидки.
    public double getAllSumVegetarian() {
        double sumVegetarian = 0;
        for (Food food : foodCart) {
            if (food.isVegetarian()) {
                sumVegetarian = sumVegetarian + food.getPrice()*food.getAmount();
            }
        }
        return sumVegetarian;
    }
}
