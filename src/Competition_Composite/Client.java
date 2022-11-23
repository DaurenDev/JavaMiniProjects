package Competition_Composite;

import Competition_Composite.PaperTypes.DesignerPaper.DesignerPaperBox;
import Competition_Composite.PaperTypes.DesignerPaper.DesignerPaperPackage;
import Competition_Composite.PaperTypes.NewsprintPaper.NewsprintPaperBox;
import Competition_Composite.PaperTypes.NewsprintPaper.NewsprintPaperPackage;
import Competition_Composite.PaperTypes.OffsetPaper.OffsetPaperBox;
import Competition_Composite.PaperTypes.OffsetPaper.OffsetPaperPackage;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintingPaperProduct offset = new OffsetPaperBox(6);
        PrintingPaperProduct newsprint = new NewsprintPaperBox(7);
        PrintingPaperProduct designer = new DesignerPaperBox(8);
        List<PrintingPaperProduct> list = new ArrayList<>();
        Date date = new Date();
        int additionalCounter = 0;

        introduction();
        choosePaperType();
        int choose = scanner.nextInt();

        if(choose == 1){
            System.out.println("How many packages would you like to have?");
            reminder();
            int amount = scanner.nextInt();

            if(amount >= 7){
                for(int i = 0; i < amount; i++){
                    list.add(new OffsetPaperPackage(5));
                    additionalCounter = additionalCounter + list.get(i).price;
                    offset.addProduct(new OffsetPaperPackage(5));
                }

                additionalCounter += offset.price;
                offset.printProducts(offset);
                double priceResult = (double) additionalCounter;
                priceResult = (priceResult * 90)/100;
                System.out.println();
                System.out.println(date);
                System.out.println("Original price: " + additionalCounter + "\n"+
                                    "Total price with 7% discount: " + priceResult);
            }

            else{
                for(int i = 0; i < amount; i++){
                    list.add(new OffsetPaperPackage(5));
                    additionalCounter = additionalCounter + list.get(i).price;
                    offset.addProduct(new OffsetPaperPackage(5));
                }

                additionalCounter += offset.price;
                offset.printProducts(offset);
                System.out.println();
                System.out.println(date);
                System.out.println("Total price: " + additionalCounter);
            }
            list.clear();
        }



        else if(choose == 2){
            System.out.println("How many packages would you like to have?");
            reminder();
            int amount = scanner.nextInt();

            if(amount >= 7){
                for(int i = 0; i < amount; i++){
                    list.add(new NewsprintPaperPackage(10));
                    additionalCounter = additionalCounter + list.get(i).price;
                    newsprint.addProduct(new NewsprintPaperPackage(10));
                }

                additionalCounter += newsprint.price;
                newsprint.printProducts(newsprint);
                double priceResult = (double) additionalCounter;
                priceResult = (priceResult * 90)/100;
                System.out.println();
                System.out.println(date);
                System.out.println("Original price: " + additionalCounter + "\n"+
                        "Total price with 7% discount: " + priceResult);
            }

            else{
                for(int i = 0; i < amount; i++){
                    list.add(new NewsprintPaperPackage(10));
                    additionalCounter = additionalCounter + list.get(i).price;
                    newsprint.addProduct(new NewsprintPaperPackage(10));
                }

                additionalCounter += newsprint.price;
                newsprint.printProducts(newsprint);
                System.out.println();
                System.out.println(date);
                System.out.println("Total price: " + additionalCounter);
            }
            list.clear();
        }



        else if(choose == 3){
            System.out.println("How many packages would you like to have?");
            reminder();
            int amount = scanner.nextInt();

            if(amount >= 7){
                for(int i = 0; i < amount; i++){
                    list.add(new DesignerPaperPackage(20));
                    additionalCounter = additionalCounter + list.get(i).price;
                    designer.addProduct(new DesignerPaperPackage(10));
                }

                additionalCounter += designer.price;
                designer.printProducts(designer);
                double priceResult = (double) additionalCounter;
                priceResult = (priceResult * 90)/100;
                System.out.println();
                System.out.println(date);
                System.out.println("Original price: " + additionalCounter + "\n"+
                        "Total price with 7% discount: " + priceResult);
            }

            else{
                for(int i = 0; i < amount; i++){
                    list.add(new DesignerPaperPackage(10));
                    additionalCounter = additionalCounter + list.get(i).price;
                    designer.addProduct(new DesignerPaperPackage(10));
                }

                additionalCounter += designer.price;
                designer.printProducts(designer);
                System.out.println();
                System.out.println(date);
                System.out.println("Total price: " + additionalCounter);
            }
            list.clear();
        }


    }

    static void introduction(){
        System.out.println("\t\t\t\t\tWELCOME!");
        System.out.println("We're very glad you've chosen our service! What a kind of paper would you like to order?");
    }

    static void choosePaperType(){
        System.out.println("1. Offset (5$) \t 2. Newsprint (10$) \t 3. Designer (20$)");
    }

    static void reminder(){
        System.out.println("(REMEMBER THAT IF YOU BUY >=7 PACKAGES THEN YOU'LL HAVE 7% DISCOUNT OF WHOLE ORDER!)");
    }
}



