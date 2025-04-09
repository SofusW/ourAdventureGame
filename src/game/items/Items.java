package game.items;

public abstract class Items {
    private String name;

    public Items(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void displayInfo(); // Abstrakt metode til visning af info
}
