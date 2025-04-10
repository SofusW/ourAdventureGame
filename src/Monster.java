public class Monster implements GameCharacter {
    // Klassen Monster implementerer fra GameCharacter interface

    //hver monster har sin egen tilstand
    private int health;    // Monsterets liv
    private int attackPower;  // Hvor meget skade monsteret kan gøre
    private String monsterName; // Monsterets navn

    // Constructor: Når vi laver et nyt monster sætter vi navn og liv og power
    public Monster(String name, int health, int attackPower) {
        this.monsterName = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    // Implementering af Health() fra GameCharacter
    @Override
    // Returnerer det aktuelle liv (health) for monsteret
    public int Health() {
        return health;
    }

    // Implementering af name() fra GameCharacter
    @Override
    // Returnerer monsterets navn
    public int attackPower() {
        return attackPower;
    }

    // Implementering af Attack() fra GameCharacter
    @Override
    public String name() {
        return monsterName;
    }
// Her angriber monsteret en anden GameCharacter fx spilleren

    @Override
    public void Attack(GameCharacter target) {
        // Udskriver hvad der sker i kampen
        System.out.println(this.name() + " angriber " + target.name() + " og gør " + this.attackPower() + " skade!");

        // Hvis målet er en userCharacter kalder vi takeDamage på den
        if (target instanceof userCharacter) {
            ((userCharacter) target).takeDamage(this.attackPower);
        } else if (target instanceof Monster) {
            ((Monster) target).takeDamage(this.attackPower);
        }

    }

        // Metode til at tage skade trækker liv fra monsteret
        public void takeDamage(int damage){
            health -= damage; // Trækker skade fra livet
            // Hvis monsteret dør (liv <= 0), printer den en besked
            if (health <= 0) {
                health = 0; // Liv kan ikke være negativt
                System.out.println(this.name() + " er blevet dræbt!");
            }


        }
        // Returnerer true hvis monsteret stadig er i live (liv > 0)
        public boolean alive() {
            if (health > 0) {
                return true;
            } else {
                return false;
            }

        }

}