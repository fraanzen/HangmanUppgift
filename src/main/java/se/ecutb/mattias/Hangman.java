package se.ecutb.mattias;


public class Hangman {
    private int maxGuesses;
    private int guessAmount;
    private String[] secretWords = {"police", "grass", "coffee"};
    private char[] guessesArray;
    private char[] lettersArray;
    private StringBuilder guessesMade = new StringBuilder();

    public Hangman(int maxGuesses, int guessAmount, String[] secretWords, char[] guessesArray, char[] lettersArray, StringBuilder guessesMade) {
        this.maxGuesses = maxGuesses;
        this.guessAmount = guessAmount;
        this.secretWords = secretWords;
        this.guessesArray = guessesArray;
        this.lettersArray = lettersArray;
        this.guessesMade = guessesMade;
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
}
