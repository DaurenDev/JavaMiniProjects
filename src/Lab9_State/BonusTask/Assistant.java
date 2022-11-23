package Lab9_State.BonusTask;


import java.util.*;

public class Assistant {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Map<String, Context> notReadyList = new HashMap<>();
        Map<String, Context> readyList = new HashMap<>();

        intro();
        additionalOption();
        int choose = scanner.nextInt();

        if(choose == 1){
            execute(notReadyList, readyList);
        }

        System.out.println("Is there anyone else you would like to add?");
        additionalOption();
        int answer = scanner.nextInt();

        if(answer == 1){
            repeat(notReadyList, readyList);
        }
        else if(answer == 2){
            System.out.println("Processing...");
            Thread.sleep(3000);
            System.out.println("\t\t<<<GOOD LUCK>>>");
        }

    }

    static void execute(Map<String, Context> notReadyList, Map<String, Context> readyList){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many students do you want to add?");
        int num = scanner.nextInt();
        System.out.println("Please, enter their names.");

        for(int i = 0; i < num; i++){
            String names = scanner.next();
            notReadyList.put(names, new Context(new NotReadyState()));
        }

        for(Map.Entry<String, Context> item : notReadyList.entrySet()){
            System.out.println(item.getKey() + "! Are you ready now?");
            additionalOption();
            int question = scanner.nextInt();

            if(question == 1){
                item.getValue().getReady();
                readyList.put(item.getKey(), item.getValue());
                System.out.println();
                System.out.println("Good! Wait for start!");
                System.out.println();

            }
            else if(question == 2){
                item.getValue().delay();
                readyList.remove(item.getKey());
                System.out.println();
                System.out.println("OK, possibly you won't have another chance but it's still worth to try again when you are ready!");
                System.out.println();
            }
        }

        System.out.println("Participants who are ready to begin: ");
        for(Map.Entry<String, Context> item : readyList.entrySet()){
            System.out.println("\t\t" + item.getKey());

        }
        System.out.println();
    }

    static void repeat(Map<String, Context> notReadyList, Map<String, Context> readyList) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        execute(notReadyList, readyList);
        System.out.println("Is there anyone else you would like to add again?");
        additionalOption();
        int rep = scanner.nextInt();
        if(rep == 1){
            repeat(notReadyList, readyList);
        }
        else if(rep == 2){
            System.out.println("Processing...");
            Thread.sleep(3000);
            System.out.println("\t\t<<<GOOD LUCK>>>");
        }
    }

    static void intro() throws InterruptedException {
        System.out.println("\t\t<<<WELCOME HERE, DEAR ASSISTANT!>>>");
        System.out.println("WE'RE ASKING YOU TO MAKE SURE EVERYTHING IS OK BEFORE WE START LETTING STUDENTS IN");
        Thread.sleep(5000);
        System.out.println("Now you can add them! Ready to start?");
    }

    static void additionalOption(){
        System.out.println("1. Yes \t\t 2. No");
    }
}
