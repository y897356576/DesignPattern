package stonesStrict.pattern_factory.factory.abstractFactory;

import stonesStrict.pattern_factory.factory.abstractFactory.materialFactory.MengniuMaterialFactory;
import stonesStrict.pattern_factory.factory.abstractFactory.materialFactory.MilkMaterialAbstractFactory;
import stonesStrict.pattern_factory.factory.abstractFactory.materialFactory.YiliMaterialFactory;

/**
 * Created by admin on 2018/4/20.
 */
public class MilkAbstractFactoryTest {

    public static void main(String[] args) {
        MilkMaterialAbstractFactory materialFactory = new MengniuMaterialFactory();
        System.out.println(materialFactory.getCowMilk().getName() + " + " + materialFactory.getWater().getName() +
                " + " + materialFactory.getPacking().getName() + " --> 蒙牛牛奶");

        materialFactory = new YiliMaterialFactory();
        System.out.println(materialFactory.getCowMilk().getName() + " + " + materialFactory.getWater().getName() +
                " + " + materialFactory.getPacking().getName() + " --> 伊利牛奶");
    }

}
