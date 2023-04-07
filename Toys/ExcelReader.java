package Toys;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import java.io.File;
import java.io.IOException;

import ToyTipes.HighPriceToy;
import ToyTipes.LowPriceToy;
import ToyTipes.NormalPricePlusToy;
import ToyTipes.NormalPriceToy;


public class ExcelReader {
    
    public static ToyBag readExcelFile(String filePath, ToyBag bag) throws IOException, BiffException {
        
        File file = new File("toyBag.xls");//тут поменять "toyBag.xls" на filePath
        Workbook workbook = Workbook.getWorkbook(file);
        Sheet sheet = workbook.getSheet(0);
        bag.name = sheet.getCell(0, 0).getContents(); // тут тоже потом пересмотреть, может использовать getCellValue 
        System.out.println(sheet.getRows());
        for (int i = 1; i < 8; i++) {
            int quantity = Integer.parseInt(sheet.getCell(0, i).getContents());
            for (int j = 1; j <= 1; j++) {
                for(int n = 0; n < quantity; n++)
                {        // ТУТ НАДО СВИТЧ КЕЙС

                    Toy toy;
                    String toyType = sheet.getCell(j+1, i).getContents();
                    //System.out.println(toyType);
                    
                    switch (toyType) 
                    {
    
                        case "NormalPrice":  
                            toy = new NormalPriceToy(sheet.getCell(j, i).getContents(), //name
                                                                        sheet.getCell(j+1, i).getContents(), //toyType
                                                                        Integer.parseInt(sheet.getCell(j+2, i).getContents()));//dropChance
                        bag.toyList.add(toy);
                        //toy.getData();
                        break;

                        case "LowPrice": 
                                toy = new LowPriceToy(sheet.getCell(j, i).getContents(), //name
                                                        sheet.getCell(j+1, i).getContents(),//, //toyType
                                                        Integer.parseInt(sheet.getCell(j+2, i).getContents()));//dropChance
                        bag.toyList.add(toy);
                        //toy.getData();
                        break;   

                        case "NormalPricePlus": 
                                toy = new NormalPricePlusToy(sheet.getCell(j, i).getContents(), //name
                                                            sheet.getCell(j+1, i).getContents(), //toyType
                                                            Integer.parseInt(sheet.getCell(j+2, i).getContents()));//dropChance
                        bag.toyList.add(toy);
                        // toy.getData();
                        break;  

                        case "HighPrice": 
                                toy = new HighPriceToy(sheet.getCell(j, i).getContents(), //name
                                                        sheet.getCell(j+1, i).getContents(), //toyType
                                                        Integer.parseInt(sheet.getCell(j+2, i).getContents()));//dropChance
                        bag.toyList.add(toy);
                        //toy.getData();
                        break;    

                        case "Candy": 
                                toy = new HighPriceToy(sheet.getCell(j, i).getContents(), //name
                                                        sheet.getCell(j+1, i).getContents(), //toyType
                                                        Integer.parseInt(sheet.getCell(j+2, i).getContents()));//dropChance);
                        bag.toyList.add(toy);
                        break;    

                        default: System.out.println(toyType + "  ШОТА У АШОТА");
                        break;
                    }
                     
                    System.out.print("\n" +((n+1)+")"+ sheet.getCell(j, i).getContents() +"  "+ sheet.getCell(j+1, i).getContents() + "\t"+"  "+ sheet.getCell(j+2, i).getContents()));
                }
            }
            System.out.println();
        }
        workbook.close();
        return bag;
    }


    public String cellTostring(Cell cell)
    {
        return cell.getContents();
    }

    public static String getCellValue(String filePath, int sheetIndex, int column, int row) throws IOException, BiffException {
        File file = new File(filePath);
        Workbook workbook = Workbook.getWorkbook(file);
        Sheet sheet = workbook.getSheet(sheetIndex);
        Cell cell = sheet.getCell(column, row);
        String content = cell.getContents();
        workbook.close();
        return content;
    }

        
        

}