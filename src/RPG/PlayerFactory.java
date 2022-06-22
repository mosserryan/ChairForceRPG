package RPG;

import javax.swing.*;

public class PlayerFactory {

    // Start character creation

    public static Player createCharacter() {
        Player player = initiatePlayer();
        chooseRace(player);
        System.out.println("\n" + player);
        chooseClass(player);
        System.out.println("\n" + player);
        return player;
    }

    private static Player initiatePlayer() {
        String characterName01 = JOptionPane.showInputDialog("Enter your character's name.");
        return new Player(characterName01);
    }


    private static void chooseRace(Player player) {

        String characterRace = JOptionPane.showInputDialog("Enter your character's race. [Human or Orc]");

        while (!characterRace.equalsIgnoreCase("human") && !characterRace.equalsIgnoreCase("orc")) {
            characterRace = JOptionPane.showInputDialog("You chose " + characterRace
                    + ". You did not choose one of the two options! Enter your character's class. [Human or Orc]").toLowerCase();
        }

        // Capitalize first letter of string, just in case user doesn't.
        characterRace = characterRace.substring(0, 1).toUpperCase() + characterRace.substring(1);

        if (characterRace.equalsIgnoreCase("human")) {
            player.setHealthPoints(10);
            player.setStamina(10);
            player.setMana(10);
            player.setRace(characterRace);
        } else if (characterRace.equalsIgnoreCase("orc")) {
            player.setHealthPoints(10);
            player.setStamina(15);
            player.setMana(5);
            player.setRace(characterRace);
        }

    }

    private static void chooseClass(Player player) {
        String characterClass = JOptionPane.showInputDialog("Enter your character's class. [Warrior, Hunter, or Wizard]");

        while (!characterClass.equalsIgnoreCase("warrior")
                && !characterClass.equalsIgnoreCase("hunter")
                && !characterClass.equalsIgnoreCase("wizard")
                && !characterClass.equalsIgnoreCase("melvin")) {

            characterClass = JOptionPane.showInputDialog("You chose " + characterClass
                            + ". You did not choose one of the three options! Enter your character's class. "
                            + "[Warrior, Hunter, or Wizard]");
        }

        // Capitalize first letter of string, just in case user doesn't.
        characterClass = characterClass.substring(0, 1).toUpperCase() + characterClass.substring(1);

        if(characterClass.equalsIgnoreCase("warrior")) {
            player.setHealthPoints(30);
            player.setStamina(15);
            player.setMana(5);
            player.setPlayerClass(characterClass);
        } else if (characterClass.equalsIgnoreCase("hunter")) {
            player.setHealthPoints(20);
            player.setStamina(20);
            player.setMana(10);
            player.setPlayerClass(characterClass);
        } else if (characterClass.equalsIgnoreCase("wizard")) {
            player.setHealthPoints(10);
            player.setStamina(10);
            player.setMana(30);
            player.setPlayerClass(characterClass);
        } else if (characterClass.equalsIgnoreCase("melvin")) {
            player.setHealthPoints(-10);
            player.setStamina(-20);
            player.setMana(-100);
            player.setPlayerClass(characterClass);
        }
    }

}