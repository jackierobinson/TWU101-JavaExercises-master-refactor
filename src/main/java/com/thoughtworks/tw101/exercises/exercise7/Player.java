package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Scanner;

public class Player {
    public int getGuess(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
