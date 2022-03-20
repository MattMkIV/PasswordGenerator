package view.panel;

import view.listener.SliderListener;

import javax.swing.*;
import java.awt.*;

public class MidPanel extends JPanel {

    private JSlider slider;

    public MidPanel() {
        this.setLayout(new FlowLayout());

        slider = new JSlider(8, 30, 12);
        JLabel sliderValue = new JLabel(slider.getValue() + " caratteri");
        slider.addChangeListener(new SliderListener(slider, sliderValue));

        add(slider);
        add(sliderValue);
    }

    public JSlider getSlider() {
        return slider;
    }
}
