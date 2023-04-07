package ToyTipes;

import Toys.Toy;


public class HighPriceToy extends Toy {
    
    public HighPriceToy(String name, String toyType, int dropChance) {
        super(name, toyType, dropChance);
    }
 

    public void getData() {
        System.out.println("ID-"+ getId() + "\t" + getName()+ "\t" + getToyType()+ "\t" +getdropChance());
    }
}

