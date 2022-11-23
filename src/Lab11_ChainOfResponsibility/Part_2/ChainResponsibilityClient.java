package Lab11_ChainOfResponsibility.Part_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ChainResponsibilityClient {
    public static void main(String[] args) throws InterruptedException {
        Map<String, UserLogger> authenticatedUsers = new HashMap<>();
        Map<String, UserLogger> permanentUsers = new HashMap<>();
        intro();
        proceedTotalAuthentication(authenticatedUsers, permanentUsers);
        initializeRepetition(authenticatedUsers, permanentUsers);
        viewPermanentUsers(permanentUsers);

    }

    static void proceedTotalAuthentication(Map<String, UserLogger> authenticatedUsers, Map<String, UserLogger> permanentUsers) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many users would you like to check out?");
        int numberOfUsers = scanner.nextInt();

        System.out.println("Please, write their names");
        for(int i = 0; i < numberOfUsers; i++){
            String name = scanner.next();
            authenticatedUsers.put(name, new EmailLogger(AuthenticationType.EMAIL));
        }

        for(Map.Entry<String, UserLogger> user : authenticatedUsers.entrySet()){
            boolean pass = true;
            int failureAttempts = 0;
            while(pass) {
                System.out.println(user.getKey() + ", write your email, please:");
                String login = scanner.next();
                boolean trueEmail = emailValidation(login);
                if (!trueEmail) {
                    user.getValue().sendNotification(user.getKey(), AuthenticationType.EMAIL);
                    user.getValue().setNextUserLogger(new PasswordLogger(AuthenticationType.PASSWORD));
                    pass = false;
                } else {
                    System.out.println("Failed attempt: " + (failureAttempts + 1));
                    failureAttempts++;
                    if (failureAttempts == 3) {
                        System.out.println("You failed 3 times to make authentication, you'll be banned for a while." +
                                " If nothing changes later, please, let us know");
                        authenticatedUsers.remove(user.getKey());
                        pass = false;
                    }
                }
            }
            boolean anotherPass = true;
            while (anotherPass){
                System.out.println(user.getKey() + ", write your password, please:");
                String password = scanner.next();
                boolean truePassword = passwordValidation(password);
                if(!truePassword){
                    user.getValue().sendNotification(user.getKey(), AuthenticationType.PASSWORD);
                    failureAttempts = 0;
                    anotherPass = false;
                }
                else {
                    System.out.println("Failed attempt: " + (failureAttempts + 1));
                    failureAttempts++;
                    if(failureAttempts == 3){
                        System.out.println("You failed 3 times to make authentication, you'll be banned for a while." +
                                " If nothing changes later, please, let us know");
                        authenticatedUsers.remove(user.getKey());
                        anotherPass = false;
                    }
                }
            }
            permanentUsers.put(user.getKey(), user.getValue());
        }
        authenticatedUsers.clear();
        System.out.println();
    }

    static void repeatAuthentication(Map<String, UserLogger> users, Map<String, UserLogger> permanentUsers) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        proceedTotalAuthentication(users, users);
        System.out.println("Would you like to add more users again?");
        System.out.println("1. Yes     2. No");
        int choice = scanner.nextInt();
        if(choice == 1){
            repeatAuthentication(users, users);
        }
        else{
            finish();
        }
    }

    static void initializeRepetition(Map<String, UserLogger> users, Map<String, UserLogger> permanentUsers) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Would you like to add more users?");
        System.out.println("1. Yes     2. No");
        int choice = scanner.nextInt();
        if(choice == 1){
            repeatAuthentication(users, permanentUsers);
        }
        else{
            finish();
        }
    }

    static void viewPermanentUsers(Map<String, UserLogger> permanentUsers) throws InterruptedException {
        System.out.println("HERE'S OUR PERMANENT USERS:");
        for (Map.Entry<String, UserLogger> item : permanentUsers.entrySet()){
            Thread.sleep(1000);
            System.out.println(item.getKey());
        }
    }

    static void intro(){
        System.out.println("\t\tWELCOME BACK! ");
        System.out.println("There are users who want to pass authentication. Please, take over to process everything successfully.");
    }

    static void finish(){
        System.out.println("Ok, all users proceeded their authentications.");
    }

    static boolean emailValidation(String login){
        String temp = "";
        String tempName = "";
        boolean correctEmail = true;
        if(login.length() >= 13){
            ArrayList<Character> array = new ArrayList<>();
            ArrayList<Character> arrayOfEmailName = new ArrayList<>();

            int emailStartName = 0;
            int emailEndName = login.length() - 10;

            char[] charNameArray = new char[emailEndName - emailStartName];
            login.getChars(emailStartName, emailEndName, charNameArray, 0);

            for(int i = 0; i < charNameArray.length; i++){
                arrayOfEmailName.add(charNameArray[i]);
            }
            for(int i = 0; i < arrayOfEmailName.size(); i++){
                String anotherString = Character.toString(arrayOfEmailName.get(i));
                tempName = tempName + anotherString;
            }

            int start = login.length() - 10;
            int end = login.length();

            char[] charArray = new char[end - start];
            login.getChars(start, end, charArray, 0);

            for(int i = 0; i < charArray.length; i++){
                array.add(charArray[i]);
            }
            for(int i = 0; i < array.size(); i++){
                String anotherString = Character.toString(array.get(i));
                temp = temp + anotherString;
            }
            if(temp.equalsIgnoreCase("@gmail.com")){
                System.out.println(tempName + temp);
                return false;
            }
            else{
                System.out.println("Please, write your email correctly!");
                System.out.println("REMEMBER: your email address should have at least 3 symbols (letters and numbers");
                System.out.println("Make sure you've written configuration (@gmail.com) correctly.");
                System.out.println("EXAMPLE: user123@gmail.com");
                System.out.println("ATTENTION: After 3 failures you won't be able to authenticate via this account.");
                return true;
            }
        }
        else{
            System.out.println("Please, write your email correctly!");
            System.out.println("REMEMBER: your email address should have at least 3 symbols (letters and numbers");
            System.out.println("Make sure you've written configuration (@gmail.com) correctly.");
            System.out.println("EXAMPLE: user123@gmail.com");
            System.out.println("ATTENTION: After 3 failures you won't be able to authenticate via this account.");
            return true;
        }
    }

    static boolean passwordValidation(String password){
        String temp = "";
        boolean correctPassword = true;
        if(password.length() >= 12){
            ArrayList<Character> symbols = new ArrayList<>();
            int start = 0;
            int end = password.length();
            char[] finalArray = new char[end - start];
            password.getChars(start, end, finalArray, 0);

            for(int i = 0; i < finalArray.length; i++){
                symbols.add(finalArray[i]);
            }
            for(int i = 0; i < finalArray.length; i++){
                if(finalArray[i] == '1'||finalArray[i] == '2'||
                        finalArray[i] == '3'||finalArray[i] == '4'||
                        finalArray[i] == '5'||finalArray[i] == '6'||
                        finalArray[i] == '7'||finalArray[i] == '8'||
                        finalArray[i] == '9'||finalArray[i] == '0'){
                    correctPassword = false;
                }
            }
            if(!correctPassword){
                return false;
            }
            else{
                System.out.println("Your password should have at least 1 digit!");
                return true;
            }
        }
        else{
            System.out.println("Your password should be at least 12 letters and digits!");
            return true;
        }
    }
}
