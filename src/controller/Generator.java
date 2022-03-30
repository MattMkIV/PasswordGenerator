package controller;

import view.panel.BottomPanel;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Generator {

    private final String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
    private final String specialCharacters = "!@#$%^&*+-/.,{}[]();:";
    private final String numbers = "1234567890";

    private int passwordLenght;
    private BottomPanel bottomPanel;

    public Generator(int passwordLenght, BottomPanel bottomPanel) {
        this.passwordLenght = passwordLenght;
        this.bottomPanel = bottomPanel;
    }

    /**
     * Generates and returns a collection of integers and shuffle them.
     *
     * @return a collection of integer
     */
    private Integer[] generateRandomPos() {
        Integer[] collection = new Integer[passwordLenght];
        for (int i = 0; i < collection.length; i++)
            collection[i] = i;

        Collections.shuffle(Arrays.asList(collection));
        return collection;
    }

    /**
     * Check the options selected by the user and returns the string with the combination of matching characters.
     *
     * @return the string with the combination of matching characters.
     */
    private String getPasswordCharacters() {
        String combinedChars = "";

        if (bottomPanel.getLettereMaius().isSelected())
            combinedChars = capitalCaseLetters;

        if (bottomPanel.getLettereMin().isSelected())
            combinedChars += lowerCaseLetters;

        if (bottomPanel.getNumeri().isSelected())
            combinedChars += numbers;

        if (bottomPanel.getCarSpeciali().isSelected())
            combinedChars += specialCharacters;

        return combinedChars;
    }

    public char[] generatePassword() {
        char[] passwdString = new char[passwordLenght];
        Integer[] posCharSel = generateRandomPos();
        Random random = new Random();

        String combinedChars;
        if (!bottomPanel.getLettereMaius().isSelected() && !bottomPanel.getLettereMin().isSelected() && !bottomPanel.getNumeri().isSelected() && !bottomPanel.getCarSpeciali().isSelected()) {
            combinedChars = capitalCaseLetters + lowerCaseLetters + numbers;
        } else {
            combinedChars = getPasswordCharacters();
            if (bottomPanel.getLettereMaius().isSelected())
                passwdString[posCharSel[0]] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));

            if (bottomPanel.getLettereMin().isSelected())
                passwdString[posCharSel[1]] = lowerCaseLetters.charAt((random.nextInt(lowerCaseLetters.length())));

            if (bottomPanel.getNumeri().isSelected())
                passwdString[posCharSel[2]] = numbers.charAt((random.nextInt(numbers.length())));

            if (bottomPanel.getCarSpeciali().isSelected())
                passwdString[posCharSel[3]] = specialCharacters.charAt((random.nextInt(specialCharacters.length())));
        }

        for (int i = 0; i < passwordLenght; i++)
            for (int j = 0; j < 4; j++)
                if (i != posCharSel[j])
                    passwdString[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));

        CopyToClipboard.copy(String.valueOf(passwdString));
        return passwdString;
    }
}
