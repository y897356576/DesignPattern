package stonesStrict.pattern_factory;

import stonesStrict.pattern_factory.factory.MilkFactory;
import stonesStrict.pattern_factory.factory.MilkSimpleFactory;

/**
 * Created by 石头 on 2018/4/15.
 */
public class FactoryTest {

    public static void main(String[] args) {
        System.out.println(MilkFactory.getMengniu().getName());
        System.out.println(MilkFactory.getTelunsu().getName());

        System.out.println(MilkSimpleFactory.getMilk("三元").getName());
        System.out.println(MilkSimpleFactory.getMilk("三次元").getName());
    }

}
