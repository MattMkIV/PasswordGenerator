package view.panel;

import view.listener.GeneratorListener;
import view.listener.SliderListener;

import javax.swing.*;
import java.awt.*;

public class MidPanel extends JPanel {
    private JButton generate;

    public MidPanel(BottomPanel bottomPanel, JTextField password) {
        JLabel sliderValue = new JLabel("12 caratteri  ");

        JSlider slider =new JSlider(8, 30,12);
        slider.addChangeListener(new SliderListener(slider, sliderValue));

        generate = new JButton("Genera");
        generate.setPreferredSize(new Dimension(100,25));
        generate.addActionListener(new GeneratorListener(slider, password, bottomPanel));

        add(slider);
        add(sliderValue);
        add(generate);
    }
}
