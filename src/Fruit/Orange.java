package Fruit;

import edible.Edible;

public class Orange extends Fruit implements Edible {
    public String howToEat(){
        return "Orange can eat";
    }
}
