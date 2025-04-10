package game.items;

import game.entities.GameCharacter;
import game.entities.Monster;
import game.entities.UserCharacter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Room {

    public static void main(String[] args) {

        List<Items> items = new ArrayList<>(); // hvis du har en Order-klasse

        Merchant merchant = new Merchant(items);

        GameCharacter player = new UserCharacter("Deniz", 1000, 35);
        GameCharacter monster = new Monster("Rat", 100, 1);

        System.out.println("\n🌟 Welcome adventurer!");
        openRoom(player, monster, merchant);

    }

    public static void openRoom(GameCharacter player, GameCharacter monster, Merchant merchant) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {

            System.out.println("Choose your destination:");
            System.out.println("1. 🛒 Merchant Room");
            System.out.println("2. ⚔️ Combat Room");
            System.out.println("3. 💤 Resting Room");
            System.out.println("4. 🎁 Loot Room");
            System.out.println("5. 🚪 Exit");

            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    openMerchantRoom(scanner, merchant);
                    break;
                case "2":
                    openCombatRoom(scanner, player, monster);
                    break;
                case "3":
                    openRestingRoom(scanner);
                    break;
                case "4":
                    openLootRoom(scanner);
                    break;
                case "5":
                    running = false;
                    System.out.println("Goodbye, traveler!");
                    break;
                default:
                    System.out.println("❌ Invalid choice. Try again!");
            }
        }
        scanner.close();
    }

    private static void openMerchantRoom(Scanner scanner, Merchant merchant) {
        System.out.println("\n━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("📜 Welcome to Patches' shop");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━");
        List<Items> products = merchant.getItems();

        for (Items item : products) {
            System.out.println("• " + item.getName());
        }

        System.out.println("Type anything to return...");
        scanner.nextLine();
    }

    private static void openCombatRoom(Scanner scanner, GameCharacter player, GameCharacter monster) {
        System.out.println("⚔️ You enter a dark room... A wild " + monster.getName() + " appears!");
        System.out.println("You both have 10 HP. Fight begins!");

        while (player.getIsAlive() && monster.getIsAlive()) {
            System.out.println("\nYour HP: " + player.getHealth() + " | " + monster.getName() + "'s HP: " + monster.getHealth());
            System.out.println("Choose your action:");
            System.out.println("1. Attack");
            System.out.println("2. Drink Potion");
            System.out.println("3. Run");

            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    int damageToMonster = player.getAttackPower();
                    monster.takeDamage(damageToMonster);
                    System.out.println("🗡️ You dealt " + damageToMonster + " damage!");
                    break;
                case "2":
                    player.heal();
                    break;
                case "3":
                    System.out.println("🏃‍♂️ You fled the fight!");
                    return; // afslutter metoden
                default:
                    System.out.println("❌ Invalid input.");
                    continue;
            }

            if (!monster.getIsAlive()) {
                System.out.println("🎉 You defeated the " + monster.getName() + "!");
                break;
            }

            // game.entities.Monster's turn

            player.takeDamage(monster.getAttackPower());
            System.out.println("💥 " + monster.getName() + " attacked you for " + monster.getAttackPower() + " damage!");

            if (!player.getIsAlive()) {
                System.out.println("☠️ You have been defeated by the " + monster.getName() + "...");
            }
        }
    }

    private static void openRestingRoom(Scanner scanner) {
        System.out.println("💤 You take a break and heal some health.");
        // Evt. healing logic
    }

    private static void openLootRoom(Scanner scanner) {
        System.out.println("🎁 You find a chest filled with loot!");
        // Tilføj loot-generering her
    }
}
