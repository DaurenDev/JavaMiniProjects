package Lab10_Proxy.BonusTask_Proxy;

import Lab10_Proxy.BonusTask_Proxy.Figures.Diamond;
import Lab10_Proxy.BonusTask_Proxy.Figures.Square;
import Lab10_Proxy.BonusTask_Proxy.Figures.Triangle;
import Lab10_Proxy.BonusTask_Proxy.FiguresProxy.DiamondProxy;
import Lab10_Proxy.BonusTask_Proxy.FiguresProxy.SquareProxy;
import Lab10_Proxy.BonusTask_Proxy.FiguresProxy.TriangleProxy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProxyPatternBonusMain {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        List<Image> images = new ArrayList<>();
        intro();
        showImages(images);
        attemptForMore();
        int choice = scanner.nextInt();
        if(choice == 1){
            repeatAll(images);
        }
        else{
            System.out.println("Ok, nothing more.");
        }
        System.out.println();
        System.out.println("Viewing all images...");
        Thread.sleep(2000);
        viewAll(images);
    }

    static void showImages(List<Image> images){
        Scanner scanner = new Scanner(System.in);
        int numberOfImages = scanner.nextInt();

        for(int i = 0; i < numberOfImages; i++){
            chooseImageType();
            int imageType = scanner.nextInt();

            if(imageType == 1){
                chooseImageDetail();
                int imageDetail = scanner.nextInt();

                if(imageDetail == 1){
                    Image image = new SquareProxy("http://klike.com");
                    images.add(image);
                    boolean trueCommand = true;
                    while (trueCommand){
                        promptCommand();
                        String command = scanner.next();
                        if(command.equalsIgnoreCase("/getImage")){
                            image.getImage();
                            trueCommand = false;
                        }
                        else{
                            System.out.println("Error, please type command properly.");
                        }
                    }
                }
                else if(imageDetail == 2){
                    Image image = new Square("http://klike.com");
                    images.add(image);
                }
            }

            else if(imageType == 2){
                chooseImageDetail();
                int imageDetail = scanner.nextInt();

                if(imageDetail == 1){
                    Image image = new TriangleProxy("http://klike.com");
                    images.add(image);
                    boolean trueCommand = true;
                    while (trueCommand){
                        promptCommand();
                        String command = scanner.next();
                        if(command.equalsIgnoreCase("/getImage")){
                            image.getImage();
                            trueCommand = false;
                        }
                        else{
                            System.out.println("Error, please type command properly.");
                        }
                    }
                }
                else if(imageDetail == 2){
                    Image image = new Triangle("http://klike.com");
                    images.add(image);
                }
            }

            else if(imageType == 3){
                chooseImageDetail();
                int imageDetail = scanner.nextInt();

                if(imageDetail == 1){
                    Image image = new DiamondProxy("http://klike.com");
                    images.add(image);
                    boolean trueCommand = true;
                    while (trueCommand){
                        promptCommand();
                        String command = scanner.next();
                        if(command.equalsIgnoreCase("/getImage")){
                            image.getImage();
                            trueCommand = false;
                        }
                        else{
                            System.out.println("Error, please type command properly.");
                        }
                    }
                }
                else if(imageDetail == 2){
                    Image image = new Diamond("http://klike.com");
                    images.add(image);
                }
            }
        }
    }

    static void repeatAll(List<Image> images){
        Scanner scanner = new Scanner(System.in);
        System.out.println("DEFINE NUMBER OF IMAGE PACKAGES YOU WANT TO DOWNLOAD!");
        showImages(images);
        System.out.println("Do you wanna download more images again?");
        System.out.println("1. Yes   2. No");
        int choose = scanner.nextInt();

        if(choose == 1){
            repeatAll(images);
        }
        else if(choose == 2){
            System.out.println("Ok, nothing more.");
        }
    }

    static void viewAll(List<Image> images) throws InterruptedException {
        for(Image item : images){
            Thread.sleep(500);
            if(item instanceof SquareProxy || item instanceof TriangleProxy || item instanceof DiamondProxy){
                item.getImage();
                System.out.println();
            }
            else if(item instanceof Square){
                ((Square) item).loadSquarePackage();
                System.out.println();
            }
            else if(item instanceof Triangle){
                ((Triangle) item).loadTrianglePackage();
                System.out.println();
            }
            else if(item instanceof Diamond){
                ((Diamond) item).loadDiamondPackage();
            }
        }
    }

    static void attemptForMore(){
        System.out.println("Do you wanna download more images?");
        System.out.println("1. Yes   2. No");
    }

    static void intro(){
        System.out.println("WELCOME! DEFINE NUMBER OF IMAGE PACKAGES YOU WANT TO DOWNLOAD!");
    }

    static void chooseImageType(){
        System.out.println("1. Square   2. Triangle    3. Diamond");
    }

    static void chooseImageDetail(){
        System.out.println("1. Image    2. Text Replacement");
    }

    static void promptCommand(){
        System.out.println("Write /getImage to download image:");
    }
}
