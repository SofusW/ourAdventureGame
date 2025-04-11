package game.items;

import java.util.ArrayList;
import java.util.List;

public class Merchant {

    List<Items> items = new ArrayList<>();

    public Merchant(List<Items> items){

        this.items = items;
        items.add(new Weapons("Sword", 100, 10));
        items.add(new Relics("Forgotten Relic", 100, false));
        items.add(new Weapons("Axe", 150, 12));
        items.add(new Relics("Cursed Relic", 125, true));
        items.add(new Weapons("Dual Sword", 225, 17));
        items.add(new Relics("Fire Relic", 200, false));
        items.add(new Weapons("Great Hammer", 250, 20));

    }

    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }

}