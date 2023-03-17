/**
 * The proposed system is a text adventure game called “Madreign”.
 * This text-based adventure game resembles an MMO RPG where the player will progress
 * through solving puzzles, increasing stats through equippable items, and defeating monsters.
 * Author: Muhammad Marenah
 */

// Author: Muhammad Marenah

import java.util.ArrayList;

public class Madreign {

    public static void main(String[] args) {

    }

}

class Player {
    private String name;
    private int healthPoints;
    private ArrayList<Item> inventory;

    public Player(String name) {
        this.name = name;
        this.healthPoints = 100;
        this.inventory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void addItemToInventory(Item item) {
        inventory.add(item);
    }

    public void removeItemFromInventory(Item item) {
        inventory.remove(item);
    }

    public void showInventory() {
        System.out.println("Inventory:");
        for (Item item : inventory) {
            System.out.println(item.getName());
        }
    }

    public void showStatus() {
        System.out.println("Name: " + name);
        System.out.println("Health Points: " + healthPoints);
    }

}

class Item {
    private String name;

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Puzzle {
    private String description;
    private String hint;

    public Puzzle(String description, String hint) {
        this.description = description;
        this.hint = hint;
    }

    public String getDescription() {
        return description;
    }

    public String getHint() {
        return hint;
    }
}

class Room {
    private String name;
    private String description;
    private ArrayList<Item> items;
    private ArrayList<Puzzle> puzzles;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
        this.items = new ArrayList<>();
        this.puzzles = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public void addPuzzle(Puzzle puzzle) {
        puzzles.add(puzzle);
    }

    public void removePuzzle(Puzzle puzzle) {
        puzzles.remove(puzzle);
    }

    public void showItems() {
        System.out.println("Items in the room:");
        for (Item item : items) {
            System.out.println(item.getName());
        }
    }

    public void showPuzzles() {
        System.out.println("Puzzles in the room:");
        for (Puzzle puzzle : puzzles) {
            System.out.println(puzzle.getDescription());
        }
    }

    public String getHintForPuzzle(String puzzleDescription) {
        for (Puzzle puzzle : puzzles) {
            if (puzzle.getDescription().equals(puzzleDescription)) {
                return puzzle.getHint();
            }
        }
        return null;
    }
}

class Game {
    private ArrayList<Room> rooms;
    private Player player;

    public Game() {
        rooms = new ArrayList<>();
        // room initialization code goes here
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void removeRoom(Room room) {
        rooms.remove(room);
    }}

/**
 * A text-based adventure game resembling an MMO RPG where the player will
 * progress through solving puzzles, increasing stats through equippable items,
 * and defeating monsters.
 *
 * Functional Requirements:
 * - Scan Room: Remove descriptions from scan command
 * - Add item to player’s inventory: Combined with Functional Requirement 3.2.5.A
 *   (Add to inventory)
 * - Remove item from player’s inventory: Combined with Functional Requirement
 *   3.2.5.B (Remove from inventory)
 * - Checking player’s health points (Check player status): Shortened command to
 *   “Status”
 * - Get Puzzle Hint: Shortened command to “Hint”
 *
 * Non-Functional Requirements:
 * - Security:
 *   - Protected Data: The save data from checkpoint rooms should be protected
 *     from tampering by the user or any other third party other than the program
 *     itself.
 * - Usability:
 *   - Help Command: When the player enters the “help” command, the console
 *     prints out a list of possible commands that the player can use in the
 *     current situation.
 * - Customization:
 *   - Player Name: When prompted during the introduction, the user will be able
 *     to enter their name. This name will be used to refer to the player from
 *     now on within the game.
 *
 * Author: Muhammad Marenah
 */
