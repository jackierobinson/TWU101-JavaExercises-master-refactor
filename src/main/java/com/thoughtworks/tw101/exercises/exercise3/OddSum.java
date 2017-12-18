package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {

    public static int of(int start, int end) {
        int firstTerm = start%2==0 ? start+1: start+2;
        int lastTerm = end%2==0 ? end-1: end-2;
        if (firstTerm>lastTerm){
            return 0;
        }
        int numberOfTerms = 1+(lastTerm-firstTerm)/2;
        return numberOfTerms*(firstTerm+lastTerm)/2;
    }

}
