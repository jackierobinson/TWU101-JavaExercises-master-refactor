package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Random;


public class GuessingGame {
    private int value;
    private Player player;

    public GuessingGame(){
        Random rand = new Random();
        value = rand.nextInt(100)+1;
        player = new Player();
    }

    public void play(){
        startGame();
        takeTurns();
        endGame();
    }

    private void takeTurns() {
        while(true){
            int guess = player.getGuess();
            if(guessWins(guess)){
                break;
            }
            else{
                giveHint(guess);
            }
        }
    }

    private void startGame() {
        System.out.println("I have thought of an integer between 1 and 100 inclusive. Please try to guess!");
    }

    private void endGame() {
        System.out.println("That guess was just right! You win!");
    }

    private void giveHint(int guess) {
        if(guess>value){
            System.out.println("That guess was too high. Guess again.");
        }
        else {
            System.out.println("That guess was too low. Guess again.");
        }
    }

    private boolean guessWins(int guess) {
        return value==guess;
    }

}
