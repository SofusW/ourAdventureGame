package game.items;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Room {

    Merchant merchant = new Merchant();
    List<Items> items = new ArrayList<>(); // hvis du har en Order-klasse

    public void openRoom() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n🌟 Welcome adventurer!");
            System.out.println("Choose your destination:");
            System.out.println("1. 🛒 Merchant Room");
            System.out.println("2. ⚔️ Combat Room");
            System.out.println("3. 💤 Resting Room");
            System.out.println("4. 🎁 Loot Room");
            System.out.println("5. 🚪 Exit");

            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    openMerchantRoom(scanner);
                    break;
                case "2":
                    openCombatRoom(scanner);
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

    private void openMerchantRoom(Scanner scanner) {
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

    private void openCombatRoom(Scanner scanner) {
        System.out.println("⚔️ You enter a dark room... a monster appears!");
        System.out.println("⚔️ You enter a dark room... A wild " + monster.getName() + " appears!");
        System.out.println("You both have 10 HP. Fight begins!");

        while (userCharacter.isAlive() && monster.isAlive()) {
            System.out.println("\nYour HP: " + userCharacter.getHealth() + " | " + monster.getName() + "'s HP: " + monster.getHealth());
            System.out.println("Choose your action:");
            System.out.println("1. Attack");
            System.out.println("2. Drink Potion");
            System.out.println("3. Run");

            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    int damageToMonster = userCharacter.attackPower();
                    monster.takeDamage(damageToMonster);
                    System.out.println("🗡️ You dealt " + damageToMonster + " damage!");
                    break;
                case "2":
                    userCharacter.heal();
                    break;
                case "3":
                    System.out.println("🏃‍♂️ You fled the fight!");
                    return; // afslutter metoden
                default:
                    System.out.println("❌ Invalid input.");
                    continue;
            }

            if (!monster.isAlive()) {
                System.out.println("🎉 You defeated the " + monster.getName() + "!");
                break;
            }

            // Monster's turn
            int damageToPlayer = monster.attack();
            userCharacter.takeDamage(damageToPlayer);
            System.out.println("💥 " + monster.getName() + " attacked you for " + damageToPlayer + " damage!");

            if (!userCharacter.isAlive()) {
                System.out.println("☠️ You have been defeated by the " + monster.getName() + "...");
            }
        }
    }

    private void openRestingRoom(Scanner scanner) {
        System.out.println("💤 You take a break and heal some health.");
        // Evt. healing logic
    }

    private void openLootRoom(Scanner scanner) {
        System.out.println("🎁 You find a chest filled with loot!");
        // Tilføj loot-generering her
    }
}
