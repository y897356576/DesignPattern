package stonesStrict.pattern_decorator.condiment;


import stonesStrict.pattern_decorator.Beverage;
import stonesStrict.pattern_decorator.CondimentDecorator;

/**
 * Created by admin on 2018/4/12.
 */
public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public Double cost() {
        return .20 + beverage.cost();
    }
}
