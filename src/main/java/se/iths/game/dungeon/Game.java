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
                case "g" -> go(scanner);
                case "d" -> currentRoom.describe();
                case "t" -> currentRoom.getItems().forEach(player::addItemToBackpack);
                case "i" -> player.getBackpack().forEach(System.out::println);
                case "q" -> quit = true;
            }
        }
        System.out.println("Little chicken went home!");
    }

    private void go(Scanner scanner) {
        System.out.println("There are doors in the following directions");
        currentRoom.getDirections().forEach(System.out::println);
        System.out.print("Where do you want to go?");
        var choice = scanner.nextLine();
        var roomName = currentRoom.getRoomName(Direction.valueOf(choice));
        currentRoom = rooms.get(roomName);
    }

    private void initialize() {
        var room1 = new Room("Room1", List.of(new Gold(), new Spider()));
        var room2 = new Room("Room2", List.of());
        var room3 = new Room("Room3", List.of(new Gold(), new Gold(), new Gold()));

        room1.addRoom(Direction.NORTH, "room2");
        room2.addRoom(Direction.SOUTH, "room1");
        room2.addRoom(Direction.WEST, "room3");
        room3.addRoom(Direction.EAST, "room2");
        room3.addRoom(Direction.NORTH, "room1");
        room1.addRoom(Direction.EAST, "room3");

        rooms.put("room1", room1);
        rooms.put("room2", room2);
        rooms.put("room3", room3);

        currentRoom = room1;
    }

}
