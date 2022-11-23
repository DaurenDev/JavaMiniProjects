package Lab11_ChainOfResponsibility.Part_1;

import Lab10_Proxy.Part2.InformationUsage;

import java.util.ArrayList;
import java.util.Scanner;

public class ChainPatternDemo {
    public static void main(String[] args) throws InterruptedException {
        AbstractLogger consoleLogger = new ConsoleLogger(LoggingType.INFO);
        AbstractLogger fileLogger = new FileLogger(LoggingType.DEBUG);
        AbstractLogger errorLogger = new ErrorLogger(LoggingType.ERROR);

        intro();
        ArrayList<AbstractLogger> list = new ArrayList<>();
        sortOut(list);
    }

    static void sortOut(ArrayList<AbstractLogger> list) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's get started sorting everything out! How many problems do you have?");
        int number = scanner.nextInt();

        for(int i = 0; i < number; i++){
            menu();
            int choice = scanner.nextInt();
            if(choice == 1){
                AbstractLogger consoleLogger = new ConsoleLogger(LoggingType.INFO);
                list.add(consoleLogger);
                System.out.println("Please, type what you want to test and display:");
                String message = scanner.next();
                consoleLogger.logMessage(message, LoggingType.INFO);
            }
            else if(choice == 2){
                AbstractLogger consoleLogger = new ConsoleLogger(LoggingType.INFO);
                AbstractLogger fileLogger = new FileLogger(LoggingType.DEBUG);
                System.out.println("What's a specific case you want to fix?");
                String message = scanner.next();
                consoleLogger.setAbstractLogger(fileLogger);
                consoleLogger.logMessage(message, LoggingType.DEBUG);

            }
            else if(choice == 3){
                AbstractLogger consoleLogger = new ConsoleLogger(LoggingType.INFO);
                AbstractLogger fileLogger = new FileLogger(LoggingType.DEBUG);
                AbstractLogger errorLogger = new ErrorLogger(LoggingType.ERROR);
                System.out.println("Write down a message you wanna spread everywhere:");
                String message = scanner.next();
                consoleLogger.setAbstractLogger(fileLogger);
                fileLogger.setAbstractLogger(errorLogger);
                consoleLogger.logMessage(message, LoggingType.ERROR);
            }
        }
    }

    static void intro(){
        System.out.println("Welcome to System Problem Sorter!");
    }

    static void menu(){
        System.out.println("1. Make testing    2. Fix tiny problem    3. Inform everywhere");
    }
}
