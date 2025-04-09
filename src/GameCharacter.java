interface GameCharacter {
    int Health();
    int attackPower();
    String name();
    void Attack(GameCharacter target);

}


class userCharacter implements GameCharacter {

    public static int health;
    public static int attackPower;
    public static String playerName;

    public userCharacter (String name, int health, int attackPower){
        playerName = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public int Health(){
        return health;
    }

    public int attackPower(){
        return attackPower;
    }

    public String name(){
        return playerName;
    }

    public void Attack(GameCharacter target){

        System.out.println(this.name() + " Angriber " + target.name() + "Og gøre " + this.attackPower());
    }

    public void takeDamage(int damage){
        health -= damage;
        if (health <= 0){
            health = 0;
            System.out.println("Du er døde ;(");
        }
    }

    public boolean alive(){
        return health > 0;
    }

    public static void playAble(){
        userCharacter player1 = new userCharacter("Spiller 1", 200, 25);

        System.out.println(player1.name() + " har " + player1.Health() + " liv");
        System.out.println(player1.name() + " har " + player1.attackPower() + " Skade ");

        player1.Health();
        player1.attackPower();
        player1.name();
    }

}