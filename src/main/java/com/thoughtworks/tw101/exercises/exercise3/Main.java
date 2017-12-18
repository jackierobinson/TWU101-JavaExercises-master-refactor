package com.thoughtworks.tw101.exercises.exercise3;

public class Main {

//    Exercise #3: Create a function 'of' in the class OddSum that returns the sum of all odd integers between a starting
//    and ending integer value.

    public static void main(String[] args) {
        OddSum oddSum = new OddSum();

        Integer sum = oddSum.of(3, 100);
        System.out.println(sum);
        sum = oddSum.of(-100, -3);
        System.out.println(sum);
        sum = oddSum.of(-100, 0);
        System.out.println(sum);
        sum = oddSum.of(0, 0);
        System.out.println(sum);
        sum = oddSum.of(-100, 5);
        System.out.println(sum);
        sum = oddSum.of(0,6);
        System.out.println(sum);
    }
}
