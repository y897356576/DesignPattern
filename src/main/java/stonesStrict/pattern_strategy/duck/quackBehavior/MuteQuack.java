package stonesStrict.pattern_strategy.duck.quackBehavior;

/**
 * Created by admin on 2018/4/17.
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< silence >>");
    }
}
