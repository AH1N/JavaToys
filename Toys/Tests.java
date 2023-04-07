package Toys;
import java.io.IOException;
import jxl.read.biff.BiffException;
import Toys.ExcelReader;


public class Tests {
    
    public static void main(String[] args) throws BiffException, IOException {
        System.out.println("$$$$$$$$$$$$$$$$НАЧИНАЕТСЯ ВЕЛИКИй РОЗЫГРЫШ$$$$$$$$$$$$$$$$$$");
        System.out.println("Малыши, вытягивайте лотерейные билетики!!!");
        ToyBag testBag = ToyBag.fillToyBag("toyBag.xls");

        testBag.getRandomToy();
        // testBag.getToyBagList().get(1).getData();
        // System.out.println(testBag.getToyBagList().get(1).getName());
        // System.out.println(testBag.toyList.size());
        // testBag.getToyBagList().get(1).getInfo();
        // System.out.println(Toys.ExcelReader.getCellValue("toyBag.xls", 0, 1,  1));
        // System.out.println(Toys.ExcelReader.getCellValue("toyBag.xls", 0, 2,  1));
        // System.out.println(Toys.ExcelReader.getCellValue("toyBag.xls", 0, 3,  1));
        // System.out.println(Integer.parseInt(Toys.ExcelReader.getCellValue("toyBag.xls", 0, 3,  1)));
    }
       
}
