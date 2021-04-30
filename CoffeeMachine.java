package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int water = 400;
        int milk = 540;
        int beans = 120;
        int cups = 9;
        int money = 550;
        
        System.out.println("Write action (buy, fill, take):");
        String action = sc.next();
        
        while (!action.equals("exit")) {
            if (action.equals("buy")) {
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                String userWants = sc.next();
                if (!userWants.equals("back")) {
                    int wantsToBuy = Integer.parseInt(userWants);
                    if (wantsToBuy == 1) {
                        if (beans >= 16 && water >= 250 && cups >= 1) {
                            System.out.println("I have enough resources, making you a coffee!");
                            beans -= 16;
                            water -= 250;
                            cups -= 1;
                            money += 4;
                        } else {
                            if (beans < 16) {
                                System.out.println("Sorry, not enough beans!");
                            } else if (water < 250) {
                                System.out.println("Sorry, not enough water!");
                            } else if (cups == 0) {
                                System.out.println("Sorry, not enough cups!");
                            }
                        }
                    } else if (wantsToBuy == 2) {
                        // 350 ml of water, 75 ml of milk, and 20 g of coffee beans. It costs $7.
                        if (water >= 350 && milk >= 75 && beans >= 20 && cups >= 1) {
                            System.out.println("I have enough resources, making you a coffee!");
                            water -= 350;
                            milk -= 75;
                            beans -= 20;
                            cups -= 1;
                            money += 7;
                        } else {
                            if (beans < 20) {
                                System.out.println("Sorry, not enough beans!");
                            } else if (milk < 75) {
                                System.out.println("Sorry, not enough milk!");
                            } else if (water < 350) {
                                System.out.println("Sorry, not enough water!");
                            } else if (cups == 0) {
                                System.out.println("Sorry, not enough cups!");
                            } 
                        }
                    } else if (wantsToBuy == 3) {
                        // 200 ml of water, 100 ml of milk, and 12 g of coffee beans. It costs $6.
                        if (water >= 200 && milk >= 100 && beans >= 12 && cups >= 1) {
                            System.out.println("I have enough resources, making you a coffee!");
                            water -= 200;
                            milk -= 100;
                            beans -= 12;
                            cups -= 1;
                            money += 6;
                        } else {
                            if (beans < 12) {
                                System.out.println("Sorry, not enough beans!");
                            } else if (milk < 100) {
                                System.out.println("Sorry, not enough milk!");
                            } else if (water < 200) {
                                System.out.println("Sorry, not enough water!");
                            } else if (cups == 0) {
                                System.out.println("Sorry, not enough cups!");
                            } 
                        }
                    }
                }
            } else if (action.equals("fill")) {
                System.out.println("Write how many ml of water you want to add:");
                int waterToAdd = Integer.parseInt(sc.next());
                System.out.println("Write how many ml of milk you want to add:");
                int milkToAdd = Integer.parseInt(sc.next());
                System.out.println("Write how many grams of coffee beans you want to add:");
                int beansToAdd = Integer.parseInt(sc.next());
                System.out.println("Write how many disposable cups of coffee you want to add:");
                int cupsToAdd = Integer.parseInt(sc.next());
                water += waterToAdd;
                milk += milkToAdd;
                beans += beansToAdd;
                cups += cupsToAdd;
            } else if (action.equals("take")) {
                System.out.println("I gave you " + money);
                money = 0;
            } else if (action.equals("remaining")) {
                System.out.println("");
                System.out.println("The coffee machine has:");
                System.out.println("" + water + " ml of water");
                System.out.println("" + milk + " ml of milk");
                System.out.println("" + beans + " g of coffee beans");
                System.out.println("" + cups + " disposable cups");
                System.out.println("$" + money + " of money");
            }
        
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            action = sc.next();
        }
    }
}
