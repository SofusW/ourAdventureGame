package game.entities;

public class UserCharacter implements GameCharacter{

    public static String name;
    public static int health;
    public static int attackPower;;

    public UserCharacter (String name, int health, int attackPower){

        this.name = name;
        this.health = health;
        this.attackPower = attackPower;

    }

    public int getHealth(){
        return health;
    }

    public int attackPower(){
        return attackPower;
    }

    public void attack(GameCharacter target){

        System.out.println(name + " Angriber " + target.getName() + "Og gøre " + attackPower);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean getIsAlive() {
        if (health > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int getAttackPower() {
        return attackPower;
    }

    public void takeDamage(int damage){
        health -= damage;
        if (health <= 0){
            health = 0;
            System.out.println("Du er døde ;(");
        }
    }

    @Override
    public void heal() {

    }

    public static void playAble(){
        UserCharacter player1 = new UserCharacter("Spiller 1", 200, 25);

        System.out.println(player1.getName() + " har " + player1.health + " liv");
        System.out.println(player1.getName() + " har " + player1.attackPower() + " Skade ");

    }



}
