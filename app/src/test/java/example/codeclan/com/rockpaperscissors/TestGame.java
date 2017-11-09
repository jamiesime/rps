package example.codeclan.com.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 08/11/2017.
 */

public class TestGame {

    Game game;

    @Before
    public void setUp(){
        game = new Game();
    }

    @Test
    public void testPlayerChoice(){
        game.setPlayerChoice("Scissors");
        assertEquals("Scissors", game.getPlayerChoice());
    }

    @Test
    public void testComChoice(){
        game.setComChoice();
        assert(game.getChoices().contains(game.getComChoice()));
    }

    @Test
    public void testComparison(){
        assertEquals("computer", game.compareChoices("Scissors", "Rock"));
        assertEquals("you", game.compareChoices("Paper", "Rock"));
        assertEquals("no-one, it's a draw", game.compareChoices("Paper", "Paper"));
    }


}
