package com.codewithsimo.service;

import com.codewithsimo.enums.FruitCategory;
import com.codewithsimo.model.Fruit;

import java.util.ArrayList;
import java.util.List;

public class FruitService {
    private final List<Fruit> fruitList = new ArrayList<>();
    private int nextId = 1;

    public Fruit addFruit(String name, double price, int quantity, FruitCategory category) {
        Fruit fruit = new Fruit(nextId, name, price, quantity, category);
        fruitList.add(fruit);
        nextId++;
        return fruit;
    }


    public List<Fruit> getAllFruits() {
        return new ArrayList<>(fruitList);
    }

    public Fruit getFruitById(int id) {
        for (Fruit fruit : fruitList) {
            if (fruit.getId() == id) {
                return fruit;
            }
        }
        return null;
    }

    public boolean updateFruit(int id, String name, double price, int quantity, FruitCategory category) {

        Fruit fruit = getFruitById(id);
        if (fruit == null) {
            return false;
        }
        fruit.setName(name);
        fruit.setPrice(price);
        fruit.setQuantity(quantity);
        fruit.setCategory(category);
        return true;
    }

    public boolean deleteFruit(int id) {
        Fruit fruit = getFruitById(id);
        if (fruit == null) {
            return false;
        }
        fruitList.remove(fruit);
        return true;
    }

}
