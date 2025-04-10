package game.entities;

public class Monster implements GameCharacter {
    // Klassen game.entities.Monster implementerer fra game.entities.GameCharacter interface

    //hver monster har sin egen tilstand
    private String name;    // Monsterets navn
    private int health;    // Monsterets liv
    private int attackPower;// Hvor meget skade monsteret kan gøre

    // Constructor: Når vi laver et nyt monster sætter vi navn og liv og power
    public Monster(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    // Implementering af Health() fra game.entities.GameCharacter
    @Override
    // Returnerer det aktuelle liv (health) for monsteret
    public int getHealth() {
        return health;
    }

    // Implementering af name() fra game.entities.GameCharacter
    @Override
    // Returnerer monsterets navn
    public int getAttackPower() {
        return attackPower;
    }

    // Implementering af Attack() fra game.entities.GameCharacter
    @Override
    public String getName() {
        return name;
    }

// Her angriber monsteret en anden game.entities.GameCharacter fx spilleren

    @Override
    public void attack(GameCharacter target) {
        // Udskriver hvad der sker i kampen
        System.out.println(name + " angriber " + target.getName() + " og gør " + attackPower + " skade!");

        // Hvis målet er en userCharacter kalder vi takeDamage på den
        if (target instanceof UserCharacter) {
            ((UserCharacter) target).takeDamage(attackPower);
        } else if (target instanceof Monster) {
            ((Monster) target).takeDamage(attackPower);
        }

    }

    // Metode til at tage skade trækker liv fra monsteret
    public void takeDamage(int damageToPlayer){
        health -= damageToPlayer; // Trækker skade fra livet
        // Hvis monsteret dør (liv <= 0), printer den en besked
        if (health <= 0) {
            health = 0; // Liv kan ikke være negativt
            System.out.println(name + " er blevet dræbt!");
        }

    }

    @Override
    public void heal() {
    }

    // Returnerer true hvis monsteret stadig er i live (liv > 0)
    public boolean getIsAlive() {

        if (health > 0) {
            return true;
        } else {
            return false;
        }

    }

}