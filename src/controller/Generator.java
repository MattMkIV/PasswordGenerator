package controller;

import view.DownPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.Arrays;
import java.util.Random;

public class Generator {
    public Generator(JSlider slider, JTextField password, DownPanel downPanel) {
        String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String specialCharacters = "!@#$%^&*+-/.,{}[]();:";
        String numbers = "1234567890";

        int lungPass = slider.getValue();

        Random random = new Random();
        char[] passwdString = new char[lungPass];

        Boolean[] checkBox = {false, false, false, false};
        String combinedChars = "";

        if (downPanel.getLettereMaius().isSelected()) {
            checkBox[0] = true;
            combinedChars = combinedChars + capitalCaseLetters;
        }
        if (downPanel.getLettereMin().isSelected()) {
            checkBox[1] = true;
            combinedChars = combinedChars + lowerCaseLetters;
        }
        if (downPanel.getNumeri().isSelected()) {
            checkBox[2] = true;
            combinedChars = combinedChars + numbers;
        }
        if (downPanel.getCarSpeciali().isSelected()) {
            checkBox[3] = true;
            combinedChars = combinedChars + specialCharacters;
        }

        int[] posCharSel = {-1, -1, -1, -1};

        if(checkBox[0]) {
            posCharSel[0] = random.nextInt(lungPass);
            passwdString[posCharSel[0]] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
        }
        if(checkBox[1]) {
            posCharSel[1] = random.nextInt(lungPass);
            for (int i = 0; i < 1; i++) {
                while (posCharSel[1] == posCharSel[i]) {
                    posCharSel[1] = random.nextInt(lungPass);
                }
            }
            passwdString[posCharSel[1]] = lowerCaseLetters.charAt((random.nextInt(lowerCaseLetters.length())));
        }
        if(checkBox[2]) {
            posCharSel[2] = random.nextInt(lungPass);
            for(int i=0; i<2; i++) {
                while(posCharSel[2] == posCharSel[i]) {
                    posCharSel[2] = random.nextInt(lungPass);
                }
            }
            passwdString[posCharSel[2]] = numbers.charAt((random.nextInt(numbers.length())));
        }
        if(checkBox[3]) {
            posCharSel[3] = random.nextInt(lungPass);
            for(int i=0; i<3; i++)
                while(posCharSel[3] == posCharSel[i])
                    posCharSel[3] = random.nextInt(lungPass);
            passwdString[posCharSel[3]] = specialCharacters.charAt((random.nextInt(specialCharacters.length())));
        }

        Boolean[] compare = {false, false, false, false};

        if(Arrays.equals(checkBox, compare))
            password.setText("Selezionare almeno una casella");
        else {
            for (int i = 0; i < lungPass; i++)
                for (int k = 0; k < 4; k++)
                    if ((posCharSel[k] != -1) && (i != posCharSel[k]))
                        passwdString[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));

            password.setText(String.valueOf(passwdString));
        }

        copy(password);
    }

    private void copy(JTextField password) {
        StringSelection stringSelection = new StringSelection (password.getText());
        Clipboard clpbrd = Toolkit.getDefaultToolkit ().getSystemClipboard ();
        clpbrd.setContents (stringSelection, null);
    }
}
