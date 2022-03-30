package view.panel;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import view.listener.CopyListener;

import javax.swing.*;
import java.awt.*;

public class TopPanel extends JPanel {

    private JTextField password;
    private JButton copy;

    public TopPanel() {
        password = new JTextField("Password");
        password.setEditable(false);
        password.setFocusable(false);
        password.setHorizontalAlignment(JTextField.CENTER);
        password.setPreferredSize(new Dimension(370, 31));
        password.setFont(new Font("Arial", Font.PLAIN, 17));

        copy = new JButton(new FlatSVGIcon(getClass().getResource("/copy24.svg")));
        copy.setFocusable(false);
        copy.setToolTipText("Copia");
        copy.setBorderPainted(false);
        copy.setBackground(super.getBackground());
        copy.addActionListener(new CopyListener(password));
        copy.setPreferredSize(new Dimension(32, 32));

        add(password);
        add(copy);
    }

    public JTextField getPassword() {
        return password;
    }
}
