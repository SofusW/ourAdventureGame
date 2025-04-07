import java.util.Scanner;

    public class Room {



        public static void MerchantRoom(Scanner scanner, PlayerCharacter player){
            System.out.println("Welcome to my humble shop, traveler!");
            System.out.println("I am....Patches\uD83E\uDD78");
            System.out.println("What can i do for you");

            boolean finished = false;

            while(!finished) {
                System.out.println("1. Buy");
                System.out.println("2. Sell");
                System.out.println("3. Leave Merchant");

                String choice = scanner.nextLine();
                int[] list = {1, 2, 3, 4, 5};

                switch (choice) {
                    case "1":
                        System.out.println(1 + "Potion 25 $\n Potion heals 10 hp");
                        System.out.println(2 + "Demon great Sword 75 $\n " +
                                "Ones belonged to a great Demon that ravaged ancient kingdoms\n" +
                                "15 damage on enemies");
                        System.out.println(3 + "The Kings forgotten sword 100 $\n A sword that once belonged" +
                                " to a righteous");
                        System.out.println(4 + "Old Giants Axe 35 $");
                        System.out.println(5 + "Club 5 $");

                }
            }



        }
    }

