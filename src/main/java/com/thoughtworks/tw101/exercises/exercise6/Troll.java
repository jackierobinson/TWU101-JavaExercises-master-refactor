package com.thoughtworks.tw101.exercises.exercise6;

public class Troll implements Monster{

    private double hp;

    public Troll(){
        hp=40;
    }

    @Override
    public void takeDamage(int amount) {
        double damage = amount/2.0;
        hp-=damage;
        hp=Math.max(hp,0);
    }

    @Override
    public void reportStatus() {
        System.out.print("Troll "+hp);
    }
}
