package com.thoughtworks.tw101.introductory_programming_exercises;

//  Prime Factors Exercise
//  Write a method generate(int n) that given an integer N will return a list of integers such that the numbers
//  are the factors of N and are arranged in increasing numerical order.
//
//  For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrimeFactors {
    public static void main(String[] args) {
        List<Integer> primeFactors = generate(30);
    }

    private static List<Integer> generate(int n) {
        Set<Integer> factors = new LinkedHashSet<Integer>();
        if(n<2){
            return new ArrayList<Integer>();
        }
        int sqrt =(int)Math.sqrt(n);
        if(n%2==0){
            factors.add(2);
        }
        for (int i=3;i<=sqrt;i+=2) {
            if (n % i == 0) {
                factors.add(i);
            }
        }
        return new ArrayList<Integer>(factors);
    }
}
