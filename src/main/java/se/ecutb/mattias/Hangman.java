package se.ecutb.mattias;

import java.util.Random;

public class Hangman {
    private static Random random = new Random();
    private int maxGuesses;
    private int guessAmount;
    private String[] secretWords = {"police", "grass", "coffee"};
    private char[] guessesArray;
    private char[] lettersArray;
    private StringBuilder guessesMade = new StringBuilder();

    public Hangman(int maxGuesses, int guessAmount, String[] secretWords, char[] guessesArray, char[] lettersArray) {
        this.maxGuesses = maxGuesses;
        this.guessAmount = guessAmount;
        this.secretWords = secretWords;
        this.guessesArray = guessesArray;
        this.lettersArray = lettersArray;
    }

    public int getMaxGuesses() {
        return maxGuesses;
    }

    public int getGuessAmount() {
        return guessAmount;
    }

    public String[] getSecretWords() {
        return secretWords;
    }

    public char[] getGuessesArray() {
        return guessesArray;
    }

    public char[] getLettersArray() {
        return lettersArray;
    }

    public boolean guesses(String guess) {
        guessAmount ++;
        char[] wordsToGuess = secretWords[random.nextInt(secretWords.length)].toCharArray();
        char[] playerGuess = new char[guessAmount];

        for (int i = 0; i < playerGuess.length; i++){
            playerGuess[i] = '_';

        }
        return false;
    }

}
