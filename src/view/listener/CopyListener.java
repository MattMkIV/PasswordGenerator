package view.listener;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CopyListener implements ActionListener {
    private JTextField password;

    public CopyListener(JTextField password) {
        this.password = password;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        StringSelection stringSelection = new StringSelection (password.getText());
        Clipboard clpbrd = Toolkit.getDefaultToolkit ().getSystemClipboard ();
        clpbrd.setContents (stringSelection, null);
    }
}
