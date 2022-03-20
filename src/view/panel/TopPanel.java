package view.panel;

import view.listener.CopyListener;

import javax.swing.*;
import java.awt.*;

public class TopPanel extends JPanel {

    private JTextField password;
    private JButton copy;

    public TopPanel() {
        password = new JTextField("Password");
        password.setPreferredSize(new Dimension(300, 25));
        password.setHorizontalAlignment(JTextField.CENTER);
        password.setFocusable(false);
        password.setEditable(false);

        copy = new JButton("Copia");
        copy.setPreferredSize(new Dimension(65, 25));

        copy.addActionListener(new CopyListener(password));

        add(password);
        add(copy);
    }

    public JTextField getPassword() {
        return password;
    }
}
