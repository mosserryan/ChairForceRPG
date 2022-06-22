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

    // Business Methods
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

    public void setName(String name) {
        this.name = name;
    }

    public void setHealthPoints(int number) { this.healthPoints = getHealthPoints() + number; }

    public void setStamina(int number) { this.stamina = getStamina() + number; }

    public void setMana(int number) { this.mana = getMana() + number; }

    public void setLevel(int number) { this.level = getLevel() + number; }

    public void setRace(String race) { this.race = race; }

    public void setPlayerClass(String playerClass) { this.playerClass = playerClass; }

    @Override
    public String toString() {
        return "Name: " + this.name + "\n"
                + "Health: " + this.healthPoints + "\n"
                + "Stamina: " + this.stamina + "\n"
                + "Mana: " + this.mana + "\n"
                + "Level: " + this.level + "\n"
                + "Class: " + this.playerClass + "\n"
                + "Race: " + this.race;
    }
}
