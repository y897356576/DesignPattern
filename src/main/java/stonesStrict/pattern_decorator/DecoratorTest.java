package stonesStrict.pattern_decorator;

import stonesStrict.pattern_decorator.beverage.Espresso;
import stonesStrict.pattern_decorator.beverage.HouseBlend;
import stonesStrict.pattern_decorator.condiment.Milk;
import stonesStrict.pattern_decorator.condiment.Mocha;
import stonesStrict.pattern_decorator.condiment.Whip;

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
