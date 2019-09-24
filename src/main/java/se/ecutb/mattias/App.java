package se.ecutb.mattias;

import se.ecutb.mattias.model.Hangman;

import java.util.Random;
import java.util.Scanner;

public class App {

    private static String[] randomWords = {"police", "coffee", "computer", "television", "ambulance"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String wordsToGuess = randomWords[random.nextInt(randomWords.length)];
        Hangman game = new Hangman(wordsToGuess);
        System.out.println("******Welcome to Hangman!******\n" + "You have 8 tries to guess the secret word.\n" + "Guess a single letter or a whole word.\n" + "GOOD LUCK!");

        do {
            System.out.println("Make your guess");
            String userInput = scanner.nextLine();
            game.checkGuess(userInput);
            System.out.println(String.format("You have guessed wrong %d times", game.getGuessCount()));
            System.out.println("Current correct guesses: " + game);
            if (game.checkWin()){
                System.out.println("You win");
            }


        } while (!game.checkWin() && game.getGuessCount() < game.MAXGUESSES);


    }
}

