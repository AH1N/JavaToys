package Toys;

import java.io.IOException;
import java.util.ArrayList;
import jxl.read.biff.BiffException;
import java.util.Random;


public class ToyBag {
    
    public String name;
    public ArrayList<Toy> toyList;
    public String filePath;
    
    
    public ToyBag(String filePath){
        this.name = name;
        this.toyList = new ArrayList<>(101);   
    }

        
    public ArrayList<Toy> getToyBagList()
    {
        return toyList;
    }

    

   
    private Toy removeToyFromBag(Toy toy)
    {  
        this.toyList.remove(toy);
        return toy;
    }

    // достать рандои игрушку из колоды
    public Toy getRandomToy() {
        System.out.println("Всего в сумке " + this.toyList.size() + "игрушек" );
        System.out.println("60 и выше - Плюшевый мишка");
        SupMethods.wait(1000);
        System.out.println("20-59 кукла или мячик");
        SupMethods.wait(1000);
        System.out.println("8-19 МP3 плеер или Рация(WalkTalk)");
        SupMethods.wait(1000);
        System.out.println("0-4 Планшет");
        SupMethods.wait(1000);
        System.out.println("КРУЧУ-ВЕРЧУ-ЗАПУТАТЬ ХОЧУ");
        SupMethods.wait(1000);
        int tmp = SupMethods.rnd(100);
        int tmp2 = tmp;
        System.out.println("Teбе выпала цифра :" + tmp2);
        System.out.println("Это значит ты получишь...");
        if(this.toyList.size() > 0)
        {      
            if (tmp2>=60) {
                getToy(40).getData();
                return removeToyFromBag(getToy(40));
            }
            else if (tmp2<=59  && tmp2 >= 20 ){
                getToy(20).getData();
                return removeToyFromBag(getToy(20));
            }
            else if (tmp2>=5 && tmp2<=19){
                getToy(8).getData();
                return removeToyFromBag(getToy(8));
            }
            else{
                System.out.println("таких игрушек больше нет((");
                System.out.println("вот тебе конфетка");
                getToy(1000);
            }

        }
        else
        {
            System.out.println("Сумка пуста");
        }
        return getToy(1000);
    }

    // заполнить корзину
    public static ToyBag fillToyBag(String filepath) throws BiffException, IOException
    {   
        return ExcelReader.readExcelFile("toyBag.xls", new ToyBag(filepath));
    }

    // Информация о корзине
    public void getToyBagInfo()
    {
        for (Toy toy : this.toyList) {
            toy.getData();
        } 
    }

    public Toy getToy(int n)
    {
        Toy foundToy = null;
        for (Toy toy : this.toyList) {
            if (toy.dropChance == n) {
                foundToy = toy;
                break;
            }
            
        }
        if (foundToy == null) {
            System.out.println("Такой игрушки нет в мешке");
            System.out.println("Вот тебе конфетка!");
            return this.toyList.get(100); 
        }
        removeToyFromBag(foundToy);
        return foundToy; 
    }
}
