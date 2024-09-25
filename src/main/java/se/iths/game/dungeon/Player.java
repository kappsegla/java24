package se.iths.game.dungeon;

import se.iths.game.dungeon.items.Item;

import java.util.HashSet;
import java.util.Set;

public class Player {
    private final Set<Item> backpack = new HashSet<>();

    public void addItemToBackpack(Item item) {
        if(!backpack.add(item))
            System.out.println("You already had the item in the backpack");
    }

    public void removeItemFromBackpack(Item item) {
        backpack.remove(item);
    }

    public Set<Item> getBackpack() {
        return Set.copyOf(backpack);
    }
}
