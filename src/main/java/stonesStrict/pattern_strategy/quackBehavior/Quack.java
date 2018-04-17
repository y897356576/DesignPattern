package stonesStrict.pattern_strategy.quackBehavior;

/**
 * Created by admin on 2018/4/17.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
