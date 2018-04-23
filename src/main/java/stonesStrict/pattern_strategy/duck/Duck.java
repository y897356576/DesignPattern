package stonesStrict.pattern_strategy.duck;

import stonesStrict.pattern_strategy.duck.flyBehavior.FlyBehavior;
import stonesStrict.pattern_strategy.duck.quackBehavior.QuackBehavior;

/**
 * Created by admin on 2018/4/17.
 */
public abstract class Duck {

    protected FlyBehavior flyBehavior;

    protected QuackBehavior quackBehavior;

    public void swim() {
        System.out.println("do swim.");
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
