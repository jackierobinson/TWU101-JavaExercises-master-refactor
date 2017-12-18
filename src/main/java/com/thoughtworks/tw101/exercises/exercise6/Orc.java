package com.thoughtworks.tw101.exercises.exercise6;

public class Orc implements Monster{

    private int hp;

    public Orc(){
        hp=20;
    }

    @Override
    public void takeDamage(int amount) {
        hp-=amount;
        hp=Math.max(hp,0);
    }

    @Override
    public void reportStatus() {
        System.out.print("Orc "+hp);
    }
}
