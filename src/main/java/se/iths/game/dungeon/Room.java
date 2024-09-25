package se.iths.game.dungeon;

import se.iths.game.dungeon.items.Item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Room {
    private String name;
    private List<Item> items = new ArrayList<>();
    private Map<Direction, String> directions = new HashMap<>();

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

    public void addRoom(Direction direction, String name) {
        directions.put(direction, name);
    }

    public String getRoomName(Direction direction) {
        return directions.getOrDefault(direction, this.name);
    }

}
