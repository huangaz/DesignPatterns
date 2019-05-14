package com.xiaomi.Duck;

public class DuckSimulator {

    public void simulate(AbstractDuckFactory duckFactory) {
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("\nDuck Simulator");

        Flock flock = new Flock();
        flock.add(redheadDuck);
        flock.add(duckCall);
        flock.add(rubberDuck);
        flock.add(gooseDuck);

        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();

        Flock flockOfMallards = new Flock();
        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);

        flock.add(flockOfMallards);

        System.out.println("\nDuck Simulator: With Observer");
        Quackologist quackologist = new Quackologist();
        flock.registerObserver(quackologist);

        simulate(flock);
        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
