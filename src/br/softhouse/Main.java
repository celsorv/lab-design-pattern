package br.softhouse;

import br.softhouse.facade.Facade;
import br.softhouse.singleton.SingletonEager;
import br.softhouse.singleton.SingletonLazy;
import br.softhouse.singleton.SingletonLazyHolder;
import br.softhouse.strategy.*;

public class Main {

    public static void main(String[] args) {

        singletonTests();
        strategyTests();
        facadeTests();

    }

    private static void facadeTests() {
        Facade facade = new Facade();
        facade.migrateCustomer("Annelise", "13611315");
    }

    private static void strategyTests() {

        Behavior[] behaviors = {
            new DefensiveBehavior(),
            new NormalBehavior(),
            new AggressiveBehavior()
        };

        int[] displacement = {2, 1, 3};

        Robot robot = new Robot();

        int index = 0;
        for (Behavior behavior: behaviors) {
            robot.setBehavior(behavior);
            robot.move(displacement[index++]);
        }

    }

    private static void singletonTests() {
        System.out.println("\nSingleton Lazy: it's the same instance?");
        System.out.println("-".repeat(50));
        System.out.println(SingletonLazy.getInstance());
        System.out.println(SingletonLazy.getInstance());

        System.out.println("\nSingleton Eager: it's the same instance?");
        System.out.println("-".repeat(50));
        System.out.println(SingletonEager.getInstance());
        System.out.println(SingletonEager.getInstance());

        System.out.println("\nSingleton Lazy Holder: it's the same instance?");
        System.out.println("-".repeat(50));
        System.out.println(SingletonLazyHolder.getInstance());
        System.out.println(SingletonLazyHolder.getInstance());
    }

}
