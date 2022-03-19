package view.listener;

import controller.Generator;
import view.DownPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GeneratorListener implements ActionListener {

    private JSlider slider;
    private JTextField password;
    private DownPanel downPanel;

    public GeneratorListener(JSlider slider, JTextField password, DownPanel downPanel) {
        this.slider = slider;
        this. password = password;
        this.downPanel = downPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new Generator(slider, password, downPanel);
    }
}
