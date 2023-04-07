package ToyTipes;

import Toys.Toy;

public class NormalPricePlusToy extends Toy {

    public NormalPricePlusToy(String name, String toyType, int dropChance) {
        super(name, toyType, dropChance);
    }
    
   
    public void getData() {
        System.out.println("ID-"+ getId() + "\t" + getName()+ "\t" + getToyType()+ "\t" +getdropChance());
    }
}
