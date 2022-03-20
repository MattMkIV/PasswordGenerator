package view.listener;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderListener implements ChangeListener {

    private JSlider slider;
    private JLabel sliderValue;

    public SliderListener(JSlider slider, JLabel sliderValue) {
        this.slider = slider;
        this.sliderValue = sliderValue;
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        this.sliderValue.setText(slider.getValue() + " caratteri");
    }
}
