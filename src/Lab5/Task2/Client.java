package Lab5.Task2;

import Lab5.Task2.Decorators.FacebookDecorator;
import Lab5.Task2.Decorators.SMSDecorator;
import Lab5.Task2.Decorators.SlackDecorator;
import Lab5.Task2.Users.User1;
import Lab5.Task2.Users.User2;
import Lab5.Task2.Users.User3;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Notifier user1 = new User1();
        Notifier user2 = new User2();
        Notifier user3 = new User3();

        System.out.print("User1  \n");
        user1.query();
        String choiceForUser1 = scanner.nextLine();

        System.out.print("User2  \n");
        user2.query();
        String choiceForUser2 = scanner.next();

        System.out.print("User3  \n");
        user3.query();
        String choiceForUser3 = scanner.next();

        System.out.println("\t \t \t ATTENTION!");
        System.out.println("-----------------------------------------");


        switch (choiceForUser1) {
            case "SMS" -> user1 = new SMSDecorator(user1);
            case "Slack" -> user1 = new SlackDecorator(user1);
            case "Facebook" -> user1 = new FacebookDecorator(user1);
            default -> throw new IllegalArgumentException("There's no such a way as " + choiceForUser1);
        }

        switch (choiceForUser2) {
            case "SMS" -> user2 = new SMSDecorator(user2);
            case "Slack" -> user2 = new SlackDecorator(user2);
            case "Facebook" -> user2 = new FacebookDecorator(user2);
            default -> throw new IllegalArgumentException("There's no such a way as " + choiceForUser2);
        }

        switch (choiceForUser3) {
            case "SMS" -> user3 = new SMSDecorator(user3);
            case "Slack" -> user3 = new SlackDecorator(user3);
            case "Facebook" -> user3 = new FacebookDecorator(user3);
            default -> throw new IllegalArgumentException("There's no such a way as " + choiceForUser3);
        }

        System.out.println(user1.sendFor());
        System.out.println(user2.sendFor());
        System.out.println(user3.sendFor());
        System.out.println("-----------------------------------------");
    }
}
