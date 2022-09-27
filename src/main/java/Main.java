
import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

import static model.constants.Colour.*;

public class Main {
    public static void main(String args[]) {

        Meat meat = new Meat(5, 100);
        Apple appleRed = new Apple(10, 50, COLOR_RED);
        Apple appleGreen = new Apple(8, 60, COLOR_GREEN);

        Food[] food = {meat, appleRed, appleGreen};

        //общую сумму товаров без скидки,
        System.out.println("Общая сумма товаров без скидки " + ShoppingCart.getAllSum());

        /*//общую сумму товаров со скидкой
        System.out.println("Общая сумма товаров со скидкой " + ShoppingCart.getAllSumDiscount(food));

        //сумму всех вегетарианских продуктов без скидки.
        System.out.println("Общая сумма товаров со скидкой " + ShoppingCart.getAllSumVegetarian(food));*/

    }


}


