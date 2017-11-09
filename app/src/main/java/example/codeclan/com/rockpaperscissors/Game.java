package example.codeclan.com.rockpaperscissors;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by user on 08/11/2017.
 */

public class Game {

    public ArrayList<String> choices;

    public String playerChoice;
    public String comChoice;

    private Integer playerScore;
    private Integer comScore;

    public String winner;

    public Game() {
        choices = new ArrayList<String>();
        setChoices();
        playerScore = 0;
        comScore = 0;
    }

    public String getPlayerScore() {
        return playerScore.toString();
    }

    public String getComScore() {
        return comScore.toString();
    }

    public String getPlayerChoice() {
        return playerChoice;
    }

    public String getComChoice() {
        return comChoice;
    }

    public ArrayList<String> getChoices() {
        return choices;
    }

    public void setChoices(){
        choices.add("Rock");
        choices.add("Paper");
        choices.add("Scissors");
    }

    public void setPlayerChoice(String choice){
        playerChoice = choice;
    }

    public void setComChoice(){
        Random rand = new Random();
        int number = rand.nextInt(3);
        comChoice = choices.get(number);
    }

    public String compareChoices(String player, String com){
        switch (player){
            case "Rock":
                if (com.equals("Scissors")){
                    return winner = "you";
                }
                else if (com.equals("Paper")){
                    return winner = "computer";
                }
                break;
            case "Paper":
                if (com.equals("Rock")){
                    return winner = "you";
                }
                else if (com.equals("Scissors")){
                    return winner = "computer";
                }
                break;
            case "Scissors":
                if (com.equals("Paper")){
                    return winner = "you";
                }
                else if (com.equals("Rock")){
                    return winner = "computer";
                }
                break;
        }
        winner = "no-one, it's a draw";
        return winner;
    }


    public String giveResults(){

        return "You chose " + playerChoice + "\n" + "The computer chose " + comChoice + "\n" + "The winner of this " +
                "round is " + winner + "!";

    }

    public void runGame(String playerChose){
        setPlayerChoice(playerChose);
        setComChoice();
        compareChoices(playerChoice, comChoice);
        setScores();
    }

    public void setScores(){
        if (winner.equals("you")){
            playerScore += 1;
        }
        if (winner.equals("computer")){
            comScore += 1;
        }
    }







}
