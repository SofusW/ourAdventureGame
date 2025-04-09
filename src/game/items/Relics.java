package game.items;

public class Relics extends Items implements Comparable<Relics> {
    private int value;
    private boolean cursed;

    public Relics(String name, int value, boolean cursed) {
        super(name); // Kalder superklassens constructor
        this.value = value;
        this.cursed = cursed;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isCursed() {
        return cursed;
    }

    public void setCursed(boolean cursed) {
        this.cursed = cursed;
    }

    @Override
    public void displayInfo() {
        System.out.println("Relic: " + getName() + ", Value: " + value + ", Cursed: " + cursed);
    }

    @Override
    public int compareTo(Relics other) { // Sorterer efter værdi (dyreste først)
        return Integer.compare(other.getValue(), this.getValue());
    }
}
