package software.ulpgc.kata7;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class MainFrame extends JFrame {

    private JPanel jPanel;
    private JButton jButton;;
    private Random random = new Random();
    private Color[] colors = new Color[]{Color.PINK, Color.WHITE, Color.ORANGE, Color.GREEN, Color.RED, Color.YELLOW, Color.BLUE};


    public MainFrame() throws HeadlessException {
        jPanel = new JPanel();
        jPanel.setBackground(colors[0]);
        jButton = new JButton("Generate random color");
        jButton.setSize(200,50);
        jButton.addActionListener(e -> jPanel.setBackground(colors[random.nextInt(0,6)]));
        this.setTitle("Color selector");
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        this.add(jButton);
        this.add(jPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
