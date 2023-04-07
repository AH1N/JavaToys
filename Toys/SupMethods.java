package Toys;

import java.util.Random;

public class SupMethods {
    
    public static int rnd(int n) 
    { 
        Random rand = new Random();
        int diceRandom = rand.nextInt(n);
        return diceRandom;
    }

    public static void wait(int n) {
        try {
            Thread.sleep(n);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }  
    }

    
}
