package RPG;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BattleScreen extends JFrame implements ActionListener {

    JButton attackButtonP1;
    JButton healButtonP1;
    JButton shieldButtonP1;
    JButton attackButtonP2;
    JButton healButtonP2;
    JButton shieldButtonP2;
    JLabel playerOneName;
    JLabel playerTwoName;

    JProgressBar healthPointsP1 = new JProgressBar();
    JProgressBar healthPointsP2 = new JProgressBar();

    // Border border = BorderFactory.createLineBorder(Color.black, 5);

    BattleScreen(String p1Name, int p1HP, String p2Name, int p2HP) {

        playerOneName = new JLabel();
        playerTwoName = new JLabel();

//        playerOneName.setHorizontalTextPosition(JLabel.CENTER);
//        playerTwoName.setHorizontalTextPosition(JLabel.CENTER);
//        playerOneName.setVerticalTextPosition(JLabel.CENTER);
//        playerTwoName.setVerticalTextPosition(JLabel.CENTER);
//        playerOneName.setHorizontalAlignment(JLabel.CENTER); // Sets the horizontal position of items within the label
//        playerOneName.setOpaque(true);
//        playerOneName.setBorder(border);
//        playerOneName.setBackground(Color.blue);


        playerOneName.setText(p1Name);
        playerTwoName.setText(p2Name);
        playerOneName.setFont(new Font("MV Boli", Font.BOLD, 40));
        playerTwoName.setFont(new Font("MV Boli", Font.BOLD, 40));


        playerOne(p1Name, p1HP);
        playerTwo(p2Name, p2HP);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(screenSize.width, screenSize.height);
        this.setVisible(true);
        this.playerOneName.setBounds(100,25, 525, 100);
        this.playerTwoName.setBounds(1270,25, 525, 100);
        this.add(playerOneName);
        this.add(playerTwoName);
        this.add(attackButtonP1);
        this.add(healthPointsP1);
        this.add(healButtonP1);
        this.add(shieldButtonP1);
        this.add(attackButtonP2);
        this.add(healthPointsP2);
        this.add(healButtonP2);
        this.add(shieldButtonP2);
        this.add(healthPointsP2);

    }

    private void playerOne (String name, int healthPoints) {
        ImageIcon swordIcon = new ImageIcon("sword.png");
        swordIcon.setImage(swordIcon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        ImageIcon healingIcon = new ImageIcon("redPotion.png");
        healingIcon.setImage(healingIcon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        ImageIcon shieldIcon = new ImageIcon("shield.png");
        shieldIcon.setImage(shieldIcon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));

        attackButtonP1 = new JButton();
        attackButtonP1.setBounds(100,200, 125, 125);
        attackButtonP1.addActionListener(this);
        attackButtonP1.setFocusable(false);
        attackButtonP1.setIcon(swordIcon);

        healButtonP1 = new JButton();
        healButtonP1.setBounds(500,200, 125, 125);
        healButtonP1.addActionListener(this);
        healButtonP1.setFocusable(false);
        healButtonP1.setIcon(healingIcon);

        shieldButtonP1 = new JButton();
        shieldButtonP1.setBounds(300,200, 125, 125);
        shieldButtonP1.addActionListener(this);
        shieldButtonP1.setFocusable(false);
        shieldButtonP1.setIcon(shieldIcon);

        healthPointsP1.setMaximum(healthPoints);
        healthPointsP1.setValue(healthPoints); // Variable
        healthPointsP1.setBounds(100,100,525,50);
        healthPointsP1.setStringPainted(true);
        healthPointsP1.setString(healthPointsP1.getValue() + "/" + healthPointsP1.getMaximum()); // variable dependent
        healthPointsP1.setForeground(Color.red);
        healthPointsP1.setBackground(Color.black);

    }

    private void playerTwo (String name, int healthPoints) {

        ImageIcon swordIcon = new ImageIcon("sword.png");
        swordIcon.setImage(swordIcon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        ImageIcon healingIcon = new ImageIcon("redPotion.png");
        healingIcon.setImage(healingIcon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        ImageIcon shieldIcon = new ImageIcon("shield.png");
        shieldIcon.setImage(shieldIcon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));

        attackButtonP2 = new JButton();
        attackButtonP2.setBounds(1270,200, 125, 125);
        attackButtonP2.addActionListener(this);
        attackButtonP2.setFocusable(false);
        attackButtonP2.setIcon(swordIcon);

        healButtonP2 = new JButton();
        healButtonP2.setBounds(1670,200, 125, 125);
        healButtonP2.addActionListener(this);
        healButtonP2.setFocusable(false);
        healButtonP2.setIcon(healingIcon);

        shieldButtonP2 = new JButton();
        shieldButtonP2.setBounds(1470,200, 125, 125);
        shieldButtonP2.addActionListener(this);
        shieldButtonP2.setFocusable(false);
        shieldButtonP2.setIcon(shieldIcon);

        healthPointsP2.setMaximum(healthPoints);
        healthPointsP2.setValue(healthPoints); // Variable
        healthPointsP2.setBounds(1270,100,525,50);
        healthPointsP2.setStringPainted(true);
        healthPointsP2.setString(healthPointsP2.getValue() + "/" + healthPointsP2.getMaximum()); // variable dependent
        healthPointsP2.setForeground(Color.red);
        healthPointsP2.setBackground(Color.black);

    }



    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == attackButtonP1) {
            System.out.println( playerOneName.getText() + " attacks " + playerTwoName.getText() + " for 10 damage!");

            if(healthPointsP2.getValue() > 0) {
                healthPointsP2.setValue(healthPointsP2.getValue() - 10); // variable dependent
                healthPointsP2.setString(healthPointsP2.getValue() + "/" + healthPointsP2.getMaximum());
            }

            if(healthPointsP2.getValue() <= 0) {
                attackButtonP1.setEnabled(false);
            }

        }

        if(e.getSource() == attackButtonP2) {
            System.out.println(playerTwoName.getText() + " attacks " + playerOneName.getText() + " for 10 damage!");

            if(healthPointsP1.getValue() > 0) {
                healthPointsP1.setValue(healthPointsP1.getValue() - 10); // variable dependent
                healthPointsP1.setString(healthPointsP1.getValue() + "/" + healthPointsP1.getMaximum());
            }

            if(healthPointsP1.getValue() <= 0) {
                attackButtonP2.setEnabled(false);
            }

        }

        if(e.getSource() == healButtonP1) {

            if(healthPointsP1.getValue() < healthPointsP1.getMaximum()) {
                healthPointsP1.setValue(healthPointsP1.getValue() + 30); // Change 30 to a passed in value.
                System.out.println(playerOneName.getText() + " has healed 30 HP!");
            } else {
                System.out.println(playerOneName.getText() + " is already at full health.");
            }

            healthPointsP1.setString(healthPointsP1.getValue() + "/" + healthPointsP1.getMaximum());

        }

        if(e.getSource() == healButtonP2) {

            if(healthPointsP2.getValue() < healthPointsP2.getMaximum()) {
                healthPointsP2.setValue(healthPointsP2.getValue() + 30); // Change 30 to a passed in value.
                System.out.println( playerTwoName.getText() + " has healed 30 HP!");
            } else {
                System.out.println(playerTwoName.getText() + " already has full health.");
            }

            healthPointsP2.setString(healthPointsP2.getValue() + "/" + healthPointsP2.getMaximum());

        }
    }

}
