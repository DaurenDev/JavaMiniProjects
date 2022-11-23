package Lab10_Proxy.Part1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProxyPatternDemo {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        List<Image> images = new ArrayList<>();
        createImage(images);
        repeatPrompt(images);
        showDownloadedImages(images);
    }

    static void createImage(List<Image> images) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        askToTypeAnything();

        String typeAnything = scanner.nextLine();

        menuPrompt();

        boolean isBuiltImage = true;
        while (isBuiltImage){
            int choose = scanner.nextInt();
            if(choose == 1){
                ProxyImageHead image = new ProxyImageHead("https://avatarko.ru/kartinki");
                image.buildHead();
                questionPrompt();
                int confirm = scanner.nextInt();
                if(confirm == 1){
                    Image finalImage = new ProxyImageHead("https://avatarko.ru/kartinki");
                    finalImage.display();
                    images.add(finalImage);
                    isBuiltImage = false;
                }
                else{
                    System.out.println("Ok, you can still choose something else.");
                    menuPrompt();
                }
            }

            else if(choose == 2){
                ProxyImageBody image = new ProxyImageBody("https://avatarko.ru/kartinki");
                image.buildBody();
                questionPrompt();
                int confirm = scanner.nextInt();
                if(confirm == 1){
                    Image finalImage = new ProxyImageBody("https://avatarko.ru/kartinki");
                    finalImage.display();
                    images.add(finalImage);
                    isBuiltImage = false;
                }
                else{
                    System.out.println("Ok, you can still choose something else.");
                    menuPrompt();
                }
            }

            else if(choose == 3){
                ProxyImageArms image = new ProxyImageArms("https://avatarko.ru/kartinki");
                image.buildArms();
                questionPrompt();
                int confirm = scanner.nextInt();
                if(confirm == 1){
                    Image finalImage = new ProxyImageArms("https://avatarko.ru/kartinki");
                    finalImage.display();
                    images.add(finalImage);
                    isBuiltImage = false;
                }
                else{
                    System.out.println("Ok, you can still choose something else.");
                    menuPrompt();
                }
            }

            else if(choose == 4){
                ProxyImageLegs image = new ProxyImageLegs("https://avatarko.ru/kartinki");
                image.buildLegs();
                questionPrompt();
                int confirm = scanner.nextInt();
                if(confirm == 1){
                    Image finalImage = new ProxyImageLegs("https://avatarko.ru/kartinki");
                    finalImage.display();
                    images.add(finalImage);
                    isBuiltImage = false;
                }
                else{
                    System.out.println("Ok, you can still choose something else.");
                    menuPrompt();
                }
            }
        }
    }

    static void downloadMore(List<Image> images) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        createImage(images);
        System.out.println("Do you want to download more again?");
        System.out.println("1. Yes  2. No");
        int confirmToRepeat = scanner.nextInt();
        if(confirmToRepeat == 1){
            downloadMore(images);
        }
        else{
            System.out.println("Wait a few seconds...");
            Thread.sleep(2000);
            System.out.println("Ok. Thank you for using this service!");
        }
    }

    static void repeatPrompt(List<Image> images) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to download more?");
        System.out.println("1. Yes  2. No");
        int confirmToRepeat = scanner.nextInt();
        if(confirmToRepeat == 1){
            downloadMore(images);
        }
        else{
            System.out.println("Wait a few seconds...");
            System.out.println("Ok. Thank you for using this service!");
        }
    }

    static void showDownloadedImages(List<Image> images) throws InterruptedException {
        for(Image item : images){
            Thread.sleep(1000);
            if(item instanceof ProxyImageHead || item instanceof ProxyImageBody ||
                    item instanceof ProxyImageArms || item instanceof ProxyImageLegs){
                item.display();
                System.out.println();
            }
        }
    }

    static void intro(){
        System.out.println("Hello there! You're in luck today because you can download image that has to be built on your own!\n" +
                           "Good luck!");
    }
    static void askToTypeAnything(){
        System.out.println("Press any button to continue...");
    }

    static void menuPrompt(){
        System.out.println("How would you want your image look like?");
        System.out.print("1. Head  2. Head  3. Head 4. Head\n");
        System.out.print("            Body     Body    Body\n");
        System.out.print("                     Arms    Arms\n");
        System.out.print("                             Legs\n");
    }

    static void questionPrompt(){
        System.out.println("Are you sure you want to download this image?");
        System.out.println("1. Yes  2. No");
    }


}
