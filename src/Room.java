import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Room {

    Merchant merchant = new Merchant();
    List<Item> items = new ArrayList<>(); // hvis du har en Order-klasse

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
        List<Item> products = merchant.getItems();

        for (Item item : products) {
            System.out.println("• " + item.getName());
        }

        System.out.println("Type anything to return...");
        scanner.nextLine();
    }

    private void openCombatRoom(Scanner scanner) {
        System.out.println("⚔️ You enter a dark room... a monster appears!");
        // Her kan du tilføje kamp-logik senere
        System.out.println("You fought bravely!");
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


