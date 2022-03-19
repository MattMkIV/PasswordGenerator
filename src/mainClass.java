import com.formdev.flatlaf.FlatDarkLaf;
import view.FrameClass;

import javax.swing.*;

public class mainClass {
    public static void main(String[] args) {
        FlatDarkLaf.setup();
        UIManager.put("Button.arc", 13);
        UIManager.put("TextComponent.arc", 18);
        new FrameClass();
    }
}