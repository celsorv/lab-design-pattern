package br.softhouse.strategy;

public class AggressiveBehavior implements Behavior {
    @Override
    public void move() {
        System.out.println("Moving aggressively");
    }
}
