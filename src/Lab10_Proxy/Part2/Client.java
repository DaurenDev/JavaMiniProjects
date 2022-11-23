package Lab10_Proxy.Part2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Map<String, InformationUsage> users = new HashMap<>();

        intro();
        int numberOfUsers = scanner.nextInt();
        names();

        for(int i = 0; i < numberOfUsers; i++){
            String name = scanner.next();
            users.put(name, new DataBaseProxy("http://microsoft.com"));
        }

        for(Map.Entry<String, InformationUsage> item : users.entrySet()){
            String name = item.getKey();
            downloadMethod(name);
            menu();
            int choice = scanner.nextInt();

            if(choice == 1){
                InformationUsage informationUsage = item.getValue();
                System.out.println("It may take some time...");
                Thread.sleep(3500);
                informationUsage = new DataBase("http://microsoft.com");
                System.out.println();
            }
            else if(choice == 2){
                InformationUsage informationUsage = item.getValue();
                System.out.println("To download file you have to write command: /get");
                String command = scanner.next();
                if(command.equalsIgnoreCase("/get")){
                    Thread.sleep(1500);
                    informationUsage.getFile();
                    System.out.println();
                }
            }
        }
        toEnd();
        String anyButton = scanner.next();
    }

    static void intro(){
        System.out.println("Hello! There are users who want to download your products.\n" +
                           "Since there many of them, define number of users you want to service.");

        System.out.println("How many users would you like to service / process?");
    }

    static void menu(){
        System.out.println("1. All products \t 2. Select products");
    }

    static void downloadMethod(String name){
        System.out.println(name + ", choose how you want to download product/products.");
    }

    static void names(){
        System.out.println("Write their names, please.");
    }

    static void toEnd(){
        System.out.println("Press any button to complete...");
    }
}
