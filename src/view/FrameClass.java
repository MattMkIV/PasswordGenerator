package view;

import view.panel.BottomPanel;
import view.panel.MidPanel;
import view.panel.TopPanel;

import javax.swing.*;
import java.awt.*;

public class FrameClass extends JFrame {
    public FrameClass() {
        setTitle("Generatore di password");
        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        TopPanel topPanel = new TopPanel();
        add(topPanel);
        MidPanel midPanel = new MidPanel();
        add(midPanel);
        BottomPanel bottomPanel = new BottomPanel(midPanel.getSlider(), topPanel.getPassword());
        add(bottomPanel);

        setPreferredSize(new Dimension(480, 210));

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
}
