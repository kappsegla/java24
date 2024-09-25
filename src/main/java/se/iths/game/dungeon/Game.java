package se.iths.game.dungeon;

import se.iths.game.dungeon.items.Gold;
import se.iths.game.dungeon.items.Spider;

import java.util.List;

public class Game {
    public static void main(String[] args) {
        new Game().play();
    }

    private void play() {
        var room = new Room("Room1", List.of(new Gold(), new Spider()));
        room.describe();

        Player player = new Player();
        player.addItemToBackpack(new Gold());
        player.addItemToBackpack(new Spider());
        player.addItemToBackpack(new Gold());

        player.getBackpack().forEach(System.out::println);
    }

}
