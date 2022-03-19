package view;

import javax.swing.*;

public class BottomPanel extends JPanel {
    private JCheckBox lettereMaius;
    private JCheckBox lettereMin;
    private JCheckBox numeri;
    private JCheckBox carSpeciali;

    public BottomPanel() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        lettereMaius = new JCheckBox("Lettere maiuscole A-Z");
        lettereMin = new JCheckBox("Lettere minuscole a-z");
        numeri = new JCheckBox("Numeri 0-9");
        carSpeciali = new JCheckBox("Caratteri speciali !@#$%^&*+-/.,{}[]();:");

        lettereMaius.setSelected(true);
        lettereMin.setSelected(true);
        numeri.setSelected(true);
        carSpeciali.setSelected(true);

        add(lettereMaius);
        add(lettereMin);
        add(numeri);
        add(carSpeciali);
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
