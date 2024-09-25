package se.iths.game.dungeon;

import se.iths.game.dungeon.items.Item;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private String name;
    private List<Item> items = new ArrayList<>();

    public Room(String name, List<Item> items) {
        this.name = name;
        if (items != null) {
            //Copy from items to this.items
            this.items.addAll(items);
        }
    }

    public void describe() {
        System.out.println("You are entering " + name + ".");
        System.out.println("In front of you, you can see the following items;");
        for (Item item : items) {
            item.describe();
        }
        //items.forEach(Item::describe);
    }

    public List<Item> getItems() {
        return List.copyOf(items);
    }

}
