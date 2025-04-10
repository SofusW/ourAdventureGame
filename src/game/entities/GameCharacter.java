package game.entities;

public interface GameCharacter {

    void attack(GameCharacter target);

    String getName();

    boolean getIsAlive();

    int getHealth();

    int getAttackPower();

    void takeDamage(int damageToPlayer);

    void heal();
}
