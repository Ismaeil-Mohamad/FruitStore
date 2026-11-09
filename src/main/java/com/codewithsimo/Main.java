package com.codewithsimo;

import com.codewithsimo.enums.FruitCategory;
import com.codewithsimo.model.Fruit;
import com.codewithsimo.service.FruitService;

import java.util.List;

public class Main {
    static void main() {
        FruitService fruitService = new FruitService();
        fruitService.addFruit("Apple", 2.50, 30, FruitCategory.POME_FRUIT);

        fruitService.addFruit("Pear", 2.00, 20, FruitCategory.POME_FRUIT);

        fruitService.addFruit("Orange", 1.80, 40, FruitCategory.CITRUS);

        fruitService.addFruit("Lemon", 1.50, 25, FruitCategory.CITRUS);

        fruitService.addFruit("Mango", 3.50, 15, FruitCategory.TROPICAL);

        fruitService.addFruit("Pineapple", 4.00, 10, FruitCategory.TROPICAL);

        fruitService.addFruit("Strawberry", 3.00, 35, FruitCategory.BERRY);

        fruitService.addFruit("Blueberry", 4.50, 20, FruitCategory.BERRY);

        fruitService.addFruit("Peach", 2.80, 18, FruitCategory.STONE_FRUIT);

        fruitService.addFruit("Cherry", 5.00, 12, FruitCategory.STONE_FRUIT);

        for(Fruit fruit : fruitService.getAllFruits()){
            System.out.println(fruit);
        }

        System.out.println("---------------------------------");
        Fruit fruit = fruitService.getFruitByName("PEAR");
        System.out.println(fruit);

        System.out.println("---------------------------------");
         List<Fruit> fruit1 = fruitService.getFruitByPrice(2);
         for(Fruit fruit2 : fruit1){
             System.out.println(fruit2);
         }


    }
}
