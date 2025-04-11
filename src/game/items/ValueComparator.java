package game.items;


public class ValueComparator implements java.util.Comparator<Items> {

    @Override
    public int compare(Items p1, Items p2) {
        return Integer.compare(p2.getValue(), p1.getValue());
    }

}

