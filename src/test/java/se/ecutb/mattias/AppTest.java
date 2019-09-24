package se.ecutb.mattias;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import se.ecutb.mattias.model.Hangman;

public class AppTest{

    Hangman game;

    @Before
    public void init(){
        game = new Hangman("test");
    }

    @Test
    public void test_of_init(){
        String expected = "____";
        String actual = game.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test_if_word_contains_guess(){
        String letterGuess = "t";
        Assert.assertTrue(game.checkGuess(letterGuess));
        String expectedResult = "t__t";
        Assert.assertEquals(expectedResult, game.toString());
        int expectedGuessCount = 0;
        Assert.assertEquals(expectedGuessCount, game.getGuessCount());
    }

    @Test
    public void correct_full_word_guess(){
        String wordGuess = "test";
        Assert.assertTrue(game.checkGuess(wordGuess));
        Assert.assertEquals(wordGuess, game.toString());
        Assert.assertTrue(game.checkWin());
    }

    @Test
    public void wrong_guess_test(){
        String letterGuess = "f";
        Assert.assertFalse(game.checkGuess(letterGuess));
        String expectedResult = "____";
        Assert.assertEquals(expectedResult, game.toString());
        int expectedGuessCount = 1;
        Assert.assertEquals(expectedGuessCount, game.getGuessCount());
    }

     @Test
    public void wrong_full_word_guess_test(){
        String wrongWordGuess = "fail";
        Assert.assertFalse(game.checkGuess(wrongWordGuess));
        int expectedGuessCount = 1;
        Assert.assertEquals(expectedGuessCount, game.getGuessCount());
        Assert.assertFalse(game.checkWin());

     }

}
