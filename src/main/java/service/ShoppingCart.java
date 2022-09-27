package service;
import model.Food;

public class ShoppingCart {

    static Food[] foodCart = new Food[3];

    public  ShoppingCart (Food[] food){
        for (int i=0; i< foodCart.length;i++){
            this.foodCart[i]=food[i];
        }
    }

    //В классе ShoppingCart реализуй методы для работы с корзиной:
    //получить общую сумму товаров в корзине без скидки,
    public double getAllSum() {
        double sum = 0;
        for (int i = 0; i < foodCart.length; i++) {
            sum = sum + foodCart[i].getPrice()*foodCart[i].getAmount();
        }
        return sum;
    }

    //получить общую сумму товаров в корзине со скидкой,
    public static double getAllSumDiscount() {
        double sumDiscount = 0;
        for (int i = 0; i < foodCart.length; i++) {
            if (foodCart[i].getDiscount() == 0) {
                sumDiscount = sumDiscount + foodCart[i].getPrice()*foodCart[i].getAmount();
            } else {
                sumDiscount = sumDiscount + (foodCart[i].getPrice() * foodCart[i].getDiscount() / 100*foodCart[i].getAmount());
            }
        }
        return sumDiscount;
    }

    //получить общую сумму всех вегетарианских продуктов в корзине без скидки.
    public static double getAllSumVegetarian() {
        double sumVegitarian = 0;
        for (int i = 0; i < foodCart.length; i++) {
            if (foodCart[i].isVegetarian()) {
                sumVegitarian = sumVegitarian + foodCart[i].getPrice()*foodCart[i].getAmount();
            }
        }
        return sumVegitarian;
    }
}
