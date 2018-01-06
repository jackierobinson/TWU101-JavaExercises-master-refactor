package com.thoughtworks.tw101.exercises.exercise8;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Player {
    private List<Integer> guesses;
    public Player(){
        guesses = new ArrayList<Integer>();
    }

    public int getNextGuess(){
        Scanner scanner = new Scanner(System.in);
        int result = getValidResult(scanner);
        guesses.add(result);
        return result;
    }

    private int getValidResult(Scanner scanner) {
        int result = 0;
        boolean waitingForValidGuess = true;
        while(waitingForValidGuess) {
            try {
                result = scanner.nextInt();
                waitingForValidGuess = false;
            } catch (InputMismatchException error) {
                System.out.println("Oops, please enter an integer");
                scanner.next();
            }
        }
        return result;
    }

    public void displayGuesses(){
        StringBuilder guessesBuilder = new StringBuilder("Your guesses:");
        for (int guess : guesses){
            guessesBuilder.append(guess).append(",");
        }
        System.out.println(guessesBuilder.toString());
    }
}
