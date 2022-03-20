package view.panel;

import view.listener.GeneratorListener;

import javax.swing.*;
import java.awt.*;

public class BottomPanel extends JPanel {

    private JCheckBox lettereMaius;
    private JCheckBox lettereMin;
    private JCheckBox numeri;
    private JCheckBox carSpeciali;
    private JButton generate;

    public BottomPanel(JSlider slider, JTextField password) {
        this.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        lettereMaius = new JCheckBox("Lettere maiuscole A-Z");
        lettereMaius.setSelected(true);

        lettereMin = new JCheckBox("Lettere minuscole a-z");
        lettereMin.setSelected(true);

        numeri = new JCheckBox("Numeri 0-9");
        numeri.setSelected(true);

        carSpeciali = new JCheckBox("Caratteri speciali !@#$%^&*+-/.,{}[]();:");
        carSpeciali.setSelected(true);

        generate = new JButton("Genera");
        generate.setPreferredSize(new Dimension(100, 25));
        generate.addActionListener(new GeneratorListener(slider, password, this));

        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 0;
        this.add(lettereMaius, constraints);

        constraints.gridx = 1;
        constraints.gridy = 0;
        this.add(lettereMin, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        this.add(numeri, constraints);

        constraints.gridx = 1;
        constraints.gridy = 1;
        this.add(carSpeciali, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        this.add(generate, constraints);

    }

    public JCheckBox getLettereMaius() {
        return lettereMaius;
    }

    public JCheckBox getLettereMin() {
        return lettereMin;
    }

    public JCheckBox getNumeri() {
        return numeri;
    }

    public JCheckBox getCarSpeciali() {
        return carSpeciali;
    }
}
