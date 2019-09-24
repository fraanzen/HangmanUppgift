package se.ecutb.mattias.model;

import java.util.Arrays;

public class Hangman{

    private int numberOfGuessesMade;
    public final int MAXGUESSES = 8;
    private StringBuilder guessedLetters;
    private String secretWord;
    private char[] wordToGuess;

    public Hangman(String secretWord){
        numberOfGuessesMade = 0;
        this.guessedLetters = new StringBuilder();
        this.secretWord = secretWord;
        this.wordToGuess = new char[secretWord.length()];
        Arrays.fill(wordToGuess, '_');

    }

    public boolean theGuess(String wordGuess){
        if (wordGuess.equalsIgnoreCase(secretWord)){
            wordToGuess = secretWord.toCharArray();
            return true;
        }
        numberOfGuessesMade++;
        return false;
    }

    public boolean theGuess(char letterGuess){
        if (secretWord.contains(letterGuess + "")){
            for (int i = 0; i < wordToGuess.length ; i++){
                if (letterGuess == secretWord.charAt(i)){
                    wordToGuess[i] = letterGuess;
                }
            }
            guessedLetters.append(wordToGuess);
            return true;
        }
        numberOfGuessesMade++;
        guessedLetters.append(letterGuess);
        return false;
    }

    public boolean checkGuess(String input){
        input = input.toLowerCase();
        if (input.length() > 1){
            return theGuess(input);
        }if (!guessedLetters.toString().contains(input)){
            return theGuess(input.charAt(0));
        }
        return false;
    }

    public boolean checkWin(){
        boolean winner = String.valueOf(wordToGuess).equals(secretWord);
        return winner;
    }

    public int getGuessCount() {
        return this.numberOfGuessesMade;
    }

    public String getGuessedLetters() {
        return guessedLetters.toString();
    }
    @Override
    public String toString(){
        return String.copyValueOf(wordToGuess);
    }
}
