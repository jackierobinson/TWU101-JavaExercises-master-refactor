package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
        drawADiamondWithYourName(3);
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {
        int width = getWidth(n);
        for(int row=0; row<n; row++){
            printDiamondRow(width, row);
        }
    }

    private static void printDiamondRow(int width, int row) {
        int numberOfAsterisks = 2*row+1;
        int numberOfSpaces = (width-numberOfAsterisks);
        print(" ",numberOfSpaces/2);
        print("*",numberOfAsterisks);
        print(" ",numberOfSpaces/2);
        System.out.println();
    }

    private static void print(String str,int n){
        for (int i=0;i<n;i++){
            System.out.print(str);
        }
    }

//    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {
        drawADiamondTop(n);
        drawADiamondMiddle(n);
        drawADiamondBottom(n);
    }

    private static void drawADiamondTop(int n) {
        int width = getWidth(n);
        int height = getHeight(n);
        for(int row=0; row<height; row++){
            printDiamondRow(width, row);
        }
    }

    private static int getHeight(int n) {
        return n-1;
    }

    private static int getWidth(int n) {
        return 2*(n-1)+1;
    }

    private static void drawADiamondMiddle(int n) {
        int width = getWidth(n);
        print("*",width);
        System.out.println();
    }

    private static void drawADiamondBottom(int n){
        int width = getWidth(n);
        int height = getHeight(n);
        for(int row=height-1; row>-1; row--){
            printDiamondRow(width, row);
        }
    }

//    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {
        drawADiamondTop(n);
        System.out.println("Ethan");
        drawADiamondBottom(n);
    }
}
