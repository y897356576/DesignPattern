package stonesStrict.pattern_decorator;

import stonesStrict.pattern_decorator.beverageChildren.Espresso;
import stonesStrict.pattern_decorator.beverageChildren.HouseBlend;
import stonesStrict.pattern_decorator.condimentChildren.Milk;
import stonesStrict.pattern_decorator.condimentChildren.Mocha;
import stonesStrict.pattern_decorator.condimentChildren.Whip;

/**
 * Hello world!
 *
 */
public class DecoratorTest {

    public static void main( String[] args ) {
        Beverage beverage = new Mocha(new Milk(new HouseBlend()));
        System.out.println(beverage.getDescription() + "\r\ncost: $" + beverage.cost());
        beverage = new Espresso();
        System.out.println(beverage.getDescription() + "\r\ncost: $" + beverage.cost());
        beverage = new Whip(new Milk(new Espresso()));
        System.out.println(beverage.getDescription() + "\r\ncost: $" + beverage.cost());
    }

}
