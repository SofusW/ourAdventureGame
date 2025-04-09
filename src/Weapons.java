package game.items;

public class Weapons extends Items {
    private int damage;

    public Weapons(String name, int damage) {
        super(name); // Kalder superklassens constructor
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public void displayInfo() {
        System.out.println("Weapon: " + getName() + ", Damage: " + damage);
    }
}
public class Weapons {
}
