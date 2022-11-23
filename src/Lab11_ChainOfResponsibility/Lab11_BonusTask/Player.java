package Lab11_ChainOfResponsibility.Lab11_BonusTask;

import java.util.Scanner;

public class Player {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MissionProgress simpleEnemy = new SimpleMission(MissionLevels.SIMPLE);
        MissionProgress hardEnemy = new HardMission(MissionLevels.HARD);
        MissionProgress bossFight = new BossFight(MissionLevels.BOSS);

        startPlaying(simpleEnemy, hardEnemy, bossFight);

    }

    static void startPlaying(MissionProgress simpleEnemy, MissionProgress hardEnemy, MissionProgress bossFight){
        Scanner scanner = new Scanner(System.in);
        int health = 1000;
        int simpleEnemyHealth = 300;
        int hardEnemyHealth = 500;
        int bossEnemyHealth = 700;

        System.out.println("<<SIMPLE ENEMY>>");
        System.out.println("Yours health -- " + health);
        System.out.println("Enemy's health -- " + simpleEnemyHealth);


        boolean stopFirstFight = true;
        boolean stopSecondFight = true;
        boolean stopThirdFight = true;


        while(stopFirstFight){
            if(health <= 0){
                stopFirstFight = false;
                stopSecondFight = false;
                stopThirdFight = false;
                System.out.println("You lost. You'll get to it next time!");
            }
            else if(simpleEnemyHealth <= 0){
                stopFirstFight = false;
                simpleEnemy.setMissionProgress(hardEnemy);
                simpleEnemy.showProgress(MissionLevels.SIMPLE);
            }
            else{
                System.out.println("Choose type of attack you want to use: ");
                hitMenu();
                int hit = scanner.nextInt();
                if(hit == 1){
                    System.out.println("Simple Attack --> Simple Enemy");
                    simpleEnemyHealth = simpleEnemyHealth - 50;
                    int enemyAttack = (int) (1 + Math.random() * 101);
                    System.out.println("You <-- Simple Enemy");
                    System.out.println("You loose " + enemyAttack + " points");
                    health = health - enemyAttack;
                    System.out.println("Your left health -- " + health);
                    System.out.println("Simple Enemy's left health -- " + simpleEnemyHealth);
                    System.out.println();
                }
                else if(hit == 2){
                    System.out.println("Hard Attack --> Simple Enemy");
                    simpleEnemyHealth = simpleEnemyHealth - 100;
                    int enemyAttack = (int) (1 + Math.random() * 101);
                    System.out.println("You <-- Simple Enemy");
                    System.out.println("You loose " + enemyAttack + " points");
                    health = health - enemyAttack;
                    System.out.println("Your left health -- " + health);
                    System.out.println("Simple Enemy's left health -- " + simpleEnemyHealth);
                    System.out.println();
                }
                else{
                    System.out.println("You missed this strike, be careful next time!");
                    int enemyAttack = (int) (1 + Math.random() * 101);
                    System.out.println("You <-- Simple Enemy");
                    System.out.println("You loose " + enemyAttack + " points");
                    health = health - enemyAttack;
                    System.out.println("Your left health -- " + health);
                    System.out.println("Simple Enemy's left health -- " + simpleEnemyHealth);
                    System.out.println();
                }
            }
        }


        if(health >= 0){
            System.out.println("<<HARD ENEMY>>");
            System.out.println("Yours health -- " + health);
            System.out.println("Enemy's health -- " + hardEnemyHealth);
        }
        while(stopSecondFight){
            if(health <= 0){
                stopSecondFight = false;
                stopThirdFight = false;
                System.out.println("You lost. You'll get to it next time!");

            }
            else if(hardEnemyHealth <= 0){
                stopSecondFight = false;
                hardEnemy.setMissionProgress(bossFight);
                simpleEnemy.showProgress(MissionLevels.HARD);
            }
            else{
                System.out.println("Choose type of attack you want to use: ");
                hitMenu();
                int hit = scanner.nextInt();
                if(hit == 1){
                    System.out.println("Simple Attack --> Hard Enemy");
                    hardEnemyHealth = hardEnemyHealth - 50;
                    int enemyAttack = (int) (1 + Math.random() * 101);
                    System.out.println("You <-- Hard Enemy");
                    System.out.println("You loose " + enemyAttack + " points");
                    health = health - enemyAttack;
                    System.out.println("Your left health -- " + health);
                    System.out.println("Hard Enemy's left health -- " + hardEnemyHealth);
                    System.out.println();
                }
                else if(hit == 2){
                    System.out.println("Hard Attack --> Hard Enemy");
                    hardEnemyHealth = hardEnemyHealth - 100;
                    int enemyAttack = (int) (1 + Math.random() * 101);
                    System.out.println("You <-- Hard Enemy");
                    System.out.println("You loose " + enemyAttack + " points");
                    health = health - enemyAttack;
                    System.out.println("Your left health -- " + health);
                    System.out.println("Hard Enemy's left health -- " + hardEnemyHealth);
                    System.out.println();
                }
                else{
                    System.out.println("You missed this strike, be careful next time!");
                    int enemyAttack = (int) (1 + Math.random() * 101);
                    System.out.println("You <-- Hard Enemy");
                    System.out.println("You loose " + enemyAttack + " points");
                    health = health - enemyAttack;
                    System.out.println("Your left health -- " + health);
                    System.out.println("Hard Enemy's left health -- " + hardEnemyHealth);
                    System.out.println();
                }
            }
        }


        if(health >= 0){
            System.out.println("<<BOSS FIGHT>>");
            System.out.println("Yours health -- " + health);
            System.out.println("Enemy's health -- " + bossEnemyHealth);
        }
        while(stopThirdFight){
            if(health <= 0){
                stopThirdFight = false;
                System.out.println("You lost. You'll get to it next time!");
            }
            else if(bossEnemyHealth <= 0){
                stopThirdFight = false;
                simpleEnemy.showProgress(MissionLevels.BOSS);
            }
            else{
                System.out.println("Choose type of attack you want to use: ");
                hitMenu();
                int hit = scanner.nextInt();
                if(hit == 1){
                    System.out.println("Simple Attack --> BOSS");
                    bossEnemyHealth = bossEnemyHealth - 50;
                    int enemyAttack = (int) (1 + Math.random() * 101);
                    System.out.println("You <-- BOSS");
                    System.out.println("You loose " + enemyAttack + " points");
                    health = health - enemyAttack;
                    System.out.println("Your left health -- " + health);
                    System.out.println("BOSS's left health -- " + bossEnemyHealth);
                    System.out.println();
                }
                else if(hit == 2){
                    System.out.println("Hard Attack --> BOSS");
                    bossEnemyHealth = bossEnemyHealth - 100;
                    int enemyAttack = (int) (1 + Math.random() * 101);
                    System.out.println("You <-- BOSS");
                    System.out.println("You loose " + enemyAttack + " points");
                    health = health - enemyAttack;
                    System.out.println("Your left health -- " + health);
                    System.out.println("BOSS's left health -- " + bossEnemyHealth);
                    System.out.println();
                }
                else{
                    System.out.println("You missed this strike, be careful next time!");
                    int enemyAttack = (int) (1 + Math.random() * 101);
                    System.out.println("You <-- BOSS");
                    System.out.println("You loose " + enemyAttack + " points");
                    health = health - enemyAttack;
                    System.out.println("Your left health -- " + health);
                    System.out.println("BOSS's left health -- " + bossEnemyHealth);
                    System.out.println();
                }
            }
        }

    }

    static void hitMenu(){
        System.out.println("1. Simple Attack (50 points)    2. Hard Attack (100 points)");
    }
}
