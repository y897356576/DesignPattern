package stonesStrict.pattern_decorator.beverageChildren;

import stonesStrict.pattern_decorator.Beverage;

/**
 * Created by admin on 2018/4/12.
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        this.description = "HouseBlend";
    }

    @Override
    public Double cost() {
        return .89;
    }
}
