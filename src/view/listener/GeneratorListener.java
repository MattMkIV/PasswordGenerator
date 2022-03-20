package view.listener;

import controller.Generator;
import view.panel.BottomPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GeneratorListener implements ActionListener {

    private JSlider slider;
    private JTextField password;
    private BottomPanel bottomPanel;

    public GeneratorListener(JSlider slider, JTextField password, BottomPanel bottomPanel) {
        this.slider = slider;
        this.password = password;
        this.bottomPanel = bottomPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Generator g = new Generator(slider.getValue(), bottomPanel);
        char[] pasString = g.generatePassword();
        password.setText(String.valueOf(pasString));
    }
}
