package se.ecutb.mattias;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

import java.util.Random;

public class Hangman {
    private static Random random = new Random();
    private int maxGuesses;
    private int guessAmount;
    String[] secretWords = {"police", "grass", "coffee"};

    public Hangman(String[] secretWords) {
            this.secretWords = secretWords;
            guessAmount = 1;
            maxGuesses = 8;
    }

    public int getMaxGuesses(){
        return maxGuesses;
    }

    public int getGuessAmount(){
        return guessAmount;
    }

    public String[] getSecretWords(){
        return secretWords;
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
