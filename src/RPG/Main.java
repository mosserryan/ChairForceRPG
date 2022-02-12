package RPG;

import javax.swing.*;

public class Main {

    public static void main (String[] args) {

        String characterName01 = JOptionPane.showInputDialog("Enter your character's name.");
        Player ryeGuy = new Player(characterName01);
        System.out.println(ryeGuy);
        ryeGuy.createCharacter();

        String characterName02 = JOptionPane.showInputDialog("Enter your character's name.");
        Player melvin = new Player(characterName02);
        System.out.println(melvin);
        melvin.createCharacter();

        BattleScreen battleScreen = new BattleScreen(ryeGuy.getName(), ryeGuy.getHealthPoints(), melvin.getName(), melvin.getHealthPoints());

    }

}
