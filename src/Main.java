import com.formdev.flatlaf.intellijthemes.*;

import view.FrameClass;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        FlatNordIJTheme.setup();
        UIManager.put("Button.arc", 13);
        UIManager.put("TextComponent.arc", 18);
        new FrameClass();
    }
}