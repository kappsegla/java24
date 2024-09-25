package se.iths.game.dungeon;

import se.iths.game.dungeon.items.Gold;
import se.iths.game.dungeon.items.Spider;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Game {
    Map<String, Room> rooms = new HashMap<>();

    public static void main(String[] args) {
        new Game().play();
    }

    private void play() {
        initialize();

        Player player = new Player();
        player.addItemToBackpack(new Gold());
        player.addItemToBackpack(new Spider());
        player.addItemToBackpack(new Gold());

        player.getBackpack().forEach(System.out::println);
    }

    private void initialize() {
        var room1 = new Room("Room1", List.of(new Gold(), new Spider()));
        var room2 = new Room("Room2", List.of());
        var room3 = new Room("Room3", List.of(new Gold(), new Gold(), new Gold()));

        rooms.put("room1", room1);
        rooms.put("room2", room2);
        rooms.put("room3", room3);
    }

}
