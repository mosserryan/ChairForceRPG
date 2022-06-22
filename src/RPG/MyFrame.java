package RPG;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;

class TestingLayoutManagers {

    private JPanel northFlowLayoutPanel;
    private JPanel inventoryPanel;
    private JPanel gamePanel;
    private JPanel menuPanel;
    private JPanel actionPanel;
    private JPanel actionItems = new JPanel(new GridLayout(3,2,5,5));
    private JPanel actionMovements = new JPanel(new GridLayout(4,1,5,5));


    private final JButton map = new JButton("Map");
    private final JButton save = new JButton("Save Game");
    private final JButton load = new JButton("Load Game");
    private final JButton options = new JButton("Options");
    private final JButton exit = new JButton("Exit Game");

    private final JButton attack = new JButton("Attack");
    private final JButton talk = new JButton("Talk");
    private final JButton craft = new JButton("Craft");
    private final JButton drop = new JButton("Drop");
    private final JButton use = new JButton("Use");
    private final JButton inspect = new JButton("Inspect");

    private final JButton north = new JButton("North");
    private final JButton east = new JButton("East");
    private final JButton south = new JButton("South");
    private final JButton west = new JButton("West");

    private final JButton submit = new JButton("Submit");
    Border border = new LineBorder(Color.GREEN, 1, false);

    public TestingLayoutManagers() {


        inventoryPanel = new JPanel(new GridLayout(2,2));
        gamePanel = new JPanel(new BorderLayout());
        actionPanel = new JPanel(new GridLayout(2,1));
        menuPanel = new JPanel(new GridLayout(5,1, 0,5));

        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(300,40));
        textField.setBackground(Color.BLACK);
        textField.setForeground(Color.green);
        textField.setCaretColor(Color.green);
        textField.setBorder(border);

        south.setFocusPainted( false );
        south.setBackground(Color.green);
        south.setForeground(Color.black);
        south.setBorder(border);

        north.setFocusPainted( false );
        north.setBackground(Color.green);
        north.setForeground(Color.black);
        north.setBorder(border);

        east.setFocusPainted( false );
        east.setBackground(Color.green);
        east.setForeground(Color.black);
        east.setBorder(border);

        west.setFocusPainted( false );
        west.setBackground(Color.green);
        west.setForeground(Color.black);
        west.setBorder(border);

        attack.setFocusPainted( false );
        attack.setBackground(Color.green);
        attack.setForeground(Color.black);
        attack.setBorder(border);

        talk.setFocusPainted( false );
        talk.setBackground(Color.green);
        talk.setForeground(Color.black);
        talk.setBorder(border);

        craft.setFocusPainted( false );
        craft.setBackground(Color.green);
        craft.setForeground(Color.black);
        craft.setBorder(border);

        drop.setFocusPainted( false );
        drop.setBackground(Color.green);
        drop.setForeground(Color.black);
        drop.setBorder(border);

        use.setFocusPainted( false );
        use.setBackground(Color.green);
        use.setForeground(Color.black);
        use.setBorder(border);

        inspect.setFocusPainted( false );
        inspect.setBackground(Color.green);
        inspect.setForeground(Color.black);
        inspect.setBorder(border);

        map.setFocusPainted( false );
        map.setBackground(Color.green);
        map.setForeground(Color.black);
        map.setBorder(border);

        save.setFocusPainted( false );
        save.setBackground(Color.green);
        save.setForeground(Color.black);
        save.setBorder(border);

        load.setFocusPainted( false );
        load.setBackground(Color.green);
        load.setForeground(Color.black);
        load.setBorder(border);

        options.setFocusPainted( false );
        options.setBackground(Color.green);
        options.setForeground(Color.black);
        options.setBorder(border);

        exit.setFocusPainted( false );
        exit.setBackground(Color.green);
        exit.setForeground(Color.black);
        exit.setBorder(border);

        actionItems.add(attack);
        actionItems.add(talk);
        actionItems.add(craft);
        actionItems.add(drop);
        actionItems.add(use);
        actionItems.add(inspect);
        actionItems.setBackground(Color.black);
        actionItems.setBorder(BorderFactory.createTitledBorder(border, "Actions", 0,2, null, Color.green));

        actionMovements.setBorder(BorderFactory.createTitledBorder("Action Movements"));
        actionMovements.add(north);
        actionMovements.add(east);
        actionMovements.add(south);
        actionMovements.add(west);
        actionMovements.setBackground(Color.black);
        actionMovements.setBorder(BorderFactory.createTitledBorder(border, "Directions", 0,2, null, Color.green));

        inventoryPanel.setPreferredSize(new Dimension(0, 350));
        inventoryPanel.setBorder(BorderFactory.createTitledBorder(border, "Inventory", 0,2, null, Color.green));
        inventoryPanel.setBackground(Color.black);

        gamePanel.setBorder(BorderFactory.createTitledBorder("Game Window"));
        gamePanel.add(textField, BorderLayout.PAGE_END);
        gamePanel.setBackground(Color.black);
        gamePanel.setBorder(BorderFactory.createTitledBorder(border, "Game Window", 0,2, null, Color.green));

        actionPanel.setBorder(BorderFactory.createTitledBorder("Actions"));
        actionPanel.setPreferredSize(new Dimension(350, 0));
        actionPanel.add(actionMovements, BorderLayout.PAGE_START);
        actionPanel.add(actionItems, BorderLayout.PAGE_END);
        actionPanel.setBackground(Color.black);
        actionPanel.setBorder(BorderFactory.createTitledBorder(border, "Commands", 0,2, null, Color.green));

        menuPanel.setPreferredSize(new Dimension(100, 0));
        menuPanel.add(map);
        menuPanel.add(save);
        menuPanel.add(load);
        menuPanel.add(options);
        menuPanel.add(exit);
        menuPanel.setBorder(BorderFactory.createTitledBorder("Menu"));
        menuPanel.setBackground(Color.black);
        menuPanel.setBorder(BorderFactory.createTitledBorder(border, "Menu", 0,2, null, Color.green));

        JFrame frame = new JFrame("Game Frame");
        frame.setLayout(new BorderLayout());
        frame.add(inventoryPanel, BorderLayout.PAGE_END);
        frame.add(gamePanel, BorderLayout.CENTER);
        frame.add(menuPanel, BorderLayout.LINE_END);
        frame.add(actionPanel, BorderLayout.LINE_START);
        frame.setBackground(Color.black);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        //frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //frame.setSize(1200,675);

    }
}