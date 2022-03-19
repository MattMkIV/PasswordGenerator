package view;

import javax.swing.*;
import java.awt.*;

public class FrameClass extends JFrame {
    public FrameClass() {
        setTitle("Generatore di password");
        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        TopPanel topPanel = new TopPanel();
        BottomPanel bottomPanel = new BottomPanel();

        add(topPanel);
        add(new MidPanel(bottomPanel, topPanel.getPassword()));
        add(bottomPanel);

        setPreferredSize(new Dimension(450,200));
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
}
