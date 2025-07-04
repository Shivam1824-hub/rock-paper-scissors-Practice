package com.example.demo;

import java.util.Random;

public class RockPaperScissors {
    private static final String[] Choices = {"Rock", "Paper", "Scissor"};
    public String getComputerChoice(){
        return computerChoice;
    }
    public int getComputerScore(){
        return computerScores;
    }
    public int getPlayerScore(){
        return playerScores;
    }
    private String computerChoice;

    private int computerScores;
    private int playerScores;

    private  Random random;

    public RockPaperScissors() {
        random = new Random();
    }

    public String playerRockPaperScissors(String playerChoice) {
        computerChoice = Choices[random.nextInt(Choices.length)];

        String result;
        if (computerChoice.equalsIgnoreCase(playerChoice)) {
            result = "Draw";
        } else if ((playerChoice.equalsIgnoreCase("Rock") && computerChoice.equalsIgnoreCase("Scissor")) ||
                (playerChoice.equalsIgnoreCase("Paper") && computerChoice.equalsIgnoreCase("Rock")) ||
                (playerChoice.equalsIgnoreCase("Scissor") && computerChoice.equalsIgnoreCase("Paper"))) {
            result = "Player Win";
            playerScores++;
        } else {
            result = "Computer Win";
            computerScores++;
        }
        return result;
    }
}
