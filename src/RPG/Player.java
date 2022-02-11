package RPG;

import javax.swing.*;

public class Player {

    public String name;
    private int healthPoints;
    private int stamina;
    private int mana;
    private int level;
    private String playerClass;
    private String race;


    Player(String name) {

        setName(name);
        setHealthPoints(100);
        setStamina(100);
        setMana(100);
        setLevel(1);

    }

    public String toString() {
        return "Name: " + this.name + "\n"
                + "Health: " + this.healthPoints + "\n"
                + "Stamina: " + this.stamina + "\n"
                + "Mana: " + this.mana + "\n"
                + "Level: " + this.level + "\n"
                + "Class: " + this.playerClass + "\n"
                + "Race: " + this.race;
    }




    // Start character creation

    public void createCharacter() {

        chooseRace();
        System.out.println("\n" + this);
        chooseClass();
        System.out.println("\n" + this);

    }

    private void chooseRace() {

        String characterRace = JOptionPane.showInputDialog("Enter your character's race. [Human or Orc]");

        while (!characterRace.equalsIgnoreCase("human") && !characterRace.equalsIgnoreCase("orc")) {

            characterRace = JOptionPane.showInputDialog(

                    "You chose " + characterRace
                            + ". You did not choose one of the two options! Enter your character's class. [Human or Orc]").toLowerCase();

        }

        characterRace = characterRace.substring(0, 1).toUpperCase() + characterRace.substring(1); // Capitalize first letter of string, just in case user doesn't.


        if (characterRace.equalsIgnoreCase("human")) {

            setHealthPoints(10);
            setStamina(10);
            setMana(10);
            setRace(characterRace);

        } else if (characterRace.equalsIgnoreCase("orc")) {

            setHealthPoints(10);
            setStamina(15);
            setMana(5);
            setRace(characterRace);

        }

    }



    private void chooseClass() {

        String characterClass = JOptionPane.showInputDialog("Enter your character's class. [Warrior, Hunter, or Wizard]");

        while (!characterClass.equalsIgnoreCase("warrior")
                && !characterClass.equalsIgnoreCase("hunter")
                && !characterClass.equalsIgnoreCase("wizard")
                && !characterClass.equalsIgnoreCase("melvin")) {

            characterClass = JOptionPane.showInputDialog(

                    "You chose " + characterClass
                            + ". You did not choose one of the three options! Enter your character's class. "
                            + "[Warrior, Hunter, or Wizard]");

        }

        // Capitalize first letter of string, just in case user doesn't.
        characterClass = characterClass.substring(0, 1).toUpperCase() + characterClass.substring(1);

        if(characterClass.equalsIgnoreCase("warrior")) {

            setHealthPoints(30);
            setStamina(15);
            setMana(5);
            setPlayerClass(characterClass);

        } else if (characterClass.equalsIgnoreCase("hunter")) {

            setHealthPoints(20);
            setStamina(20);
            setMana(10);
            setPlayerClass(characterClass);

        } else if (characterClass.equalsIgnoreCase("wizard")) {

            setHealthPoints(10);
            setStamina(10);
            setMana(30);
            setPlayerClass(characterClass);

        } else if (characterClass.equalsIgnoreCase("melvin")) {

            setHealthPoints(-10);
            setStamina(-20);
            setMana(-100);
            setPlayerClass(characterClass);

        }

    }

    // End character creation

    // Getters

    public String getName() {
        return this.name;
    }

    public int getHealthPoints() {
        return this.healthPoints;
    }

    public int getStamina() {
        return this.stamina;
    }

    public int getMana() {
        return this.mana;
    }

    public int getLevel() { return this.level; }

    public String getRace() { return this.race; };

    // Setters

    private void setName(String name) {
        this.name = name;
    }

    private void setHealthPoints(int number) { this.healthPoints = getHealthPoints() + number; }

    private void setStamina(int number) { this.stamina = getStamina() + number; }

    private void setMana(int number) { this.mana = getMana() + number; }

    private void setLevel(int number) { this.level = getLevel() + number; }

    private void setRace(String race) { this.race = race; }

    private void setPlayerClass(String playerClass) { this.playerClass = playerClass; }

    // Actions

    public void battle(String action) {

        if (action.equalsIgnoreCase("attack")) {
            attack();
        } else if (action.equalsIgnoreCase("rest")) {
            rest();
        }

    }

    private void attack() { System.out.println(this.name + " attacks with their sword."); }

    private void rest() {
        System.out.println(this.name + " skips this turn to rest.");
    }
}
