package br.softhouse.strategy;

public class Robot {

    private Behavior behavior;

    public void setBehavior(Behavior behavior) {
        this.behavior = behavior;
    }

    public void move(int displacement ) {
        for (int i = 0; i < displacement; i++)
            behavior.move();
    }
}
