package game.items;

import java.util.ArrayList;
import java.util.List;

public class Merchant {


    List<Items> items = new ArrayList<>();

    public Merchant(){

        items.add(new Item("Sword"));
        items.add(new Item("Forgotten Relic"));
        items.add(new Item("Axe"));
        items.add(new Item("Cursed Relic"));
        items.add(new Item("Dual Sword"));
        items.add(new Item("Fire Relic"));
        items.add(new Item("Great Hammer"));

    }


    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }

}