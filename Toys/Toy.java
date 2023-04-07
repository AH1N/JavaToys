package Toys;

import java.util.UUID;

import ToyTipes.Toyinterface;

public abstract class Toy implements Toyinterface  {
    protected String toyId;
    protected String name;
    protected String toyType;
    protected int dropChance;

    public Toy(String name, String toyType, int dropChance) {
        this.toyId = idGen();
        this.name = name;
        this.toyType = toyType;
        this.dropChance = dropChance;
    }

    public String idGen() {
        UUID uuid = UUID.randomUUID();
        String toyId = uuid.toString().substring(0, 5);
        return toyId; 
    }

    public String getId(){
        return this.toyId;
    }
        
    public String getName(){
        return this.name;
    }

    public String getToyType()
    {
        return this.toyType;
    }
    
    public String getdropChance()
    {
        return Integer.toString(this.dropChance);
    }

    public void getData() {
        System.out.println("ID-"+ getId() + "\t" + getName()+ "\t" + getToyType()+ "\t" +getdropChance());
    }

    



    
}