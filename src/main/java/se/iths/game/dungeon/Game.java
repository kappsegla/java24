package se.iths.game.dungeon;

import se.iths.game.dungeon.items.Gold;
import se.iths.game.dungeon.items.Spider;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Game {
    Map<String, Room> rooms = new HashMap<>();
    Player player = new Player();
    Room currentRoom;

    public static void main(String[] args) {
        new Game().play();
    }

    private void play() {
        Scanner scanner = new Scanner(System.in);
        initialize();
        String alternatives = "(g)o, (d)escribe room, (t)ake, (i)nventory, (q)uit";
        boolean quit = false;

        while (!quit) {
            System.out.println(alternatives);
            String input = scanner.nextLine();
            switch (input) {
                case "g" -> go();
                case "d" -> currentRoom.describe();
                case "t" -> currentRoom.getItems().forEach(player::addItemToBackpack);
                case "i" -> player.getBackpack().forEach(System.out::println);
                case "q" -> quit = true;
            }
        }
        System.out.println("Little chicken went home!");
    }

    private void go() {
        //We are in current room..
        //Ask current room where we can go?
        //Ask where to go
        //Update current room with the new room we navigated too

    }

    private void initialize() {
        var room1 = new Room("Room1", List.of(new Gold(), new Spider()));
        var room2 = new Room("Room2", List.of());
        var room3 = new Room("Room3", List.of(new Gold(), new Gold(), new Gold()));

        rooms.put("room1", room1);
        rooms.put("room2", room2);
        rooms.put("room3", room3);

        currentRoom = room1;
    }

}
