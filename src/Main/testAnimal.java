package Main;
import Animal.Chicken;
import Animal.Tiger;
import Animal.Animal;


public class testAnimal {
    public static void main(String[] args) {
        Animal [] animals = new Animal[2];
        animals[0]=new Tiger();
        animals[1]=new Chicken();
        for (int i = 0; i < animals.length; i++){
             animals[i].makeSoun();
            System.out.println(animals[i].makeSoun());
        }
    }
}
