package game.items;

public class Relics extends Items implements Comparable<Relics> {
    private boolean cursed;

    public Relics(String name, int value, boolean cursed) {
        super(name, value);// Kalder superklassens constructor
        this.cursed = cursed;
    }


    public String Name() {return super.getName();
    }

    @Override
    public int getValue() {
        return super.getValue();
    }

    @Override
    public void setValue(int value) {
        super.setValue(value);
    }

    public boolean isCursed() {

        return cursed;
    }

    public void setCursed(boolean cursed) {

        this.cursed = cursed;
    }

    @Override
    public void displayInfo() {
        System.out.println("Relic: " + getName() + ", Value: " + getValue() + ", Cursed: " + cursed);
    }

    @Override
    public int compareTo(Relics other) { // Sorterer efter værdi (dyreste først)
        return Integer.compare(other.getValue(), this.getValue());
    }
}
