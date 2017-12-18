package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {

    public int of(int start, int end) {
        if (start>=end) {
            return 0;
        }
        if (start>=0){
            return getOddSumOf(start, end);
        } else if(end>=0) {
            return of(0,end)-of(0,-start);
        } else {
            return -of(-end,-start);
        }
    }

    private int getOddSumOf(int start, int end) {
        int sumOf = getSumOf(start, end);
        int evenSumOf = getEvenSumOf(start, end);
        return Math.max(sumOf-evenSumOf,0);
    }

    private int getEvenSumOf(int start, int end) {
        int totalEvenSum=evenSumTo(end-1);
        int startEvenSum=evenSumTo(start);
        return totalEvenSum-startEvenSum;
    }

    private int getSumOf(int start, int end) {
        int totalSum=sumTo(end-1);
        int startSum=sumTo(start);
        return totalSum-startSum;
    }

    private int evenSumTo(int i) {
        if (i%2==0) {
            return sumTo(i/2)*2;
        }
        else {
            return sumTo((i-1)/2)*2;
        }
    }

    private int sumTo(int n) {
        return (n*(n+1))/2;
    }

}
