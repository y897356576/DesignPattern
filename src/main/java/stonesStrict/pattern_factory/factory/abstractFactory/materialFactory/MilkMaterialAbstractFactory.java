package stonesStrict.pattern_factory.factory.abstractFactory.materialFactory;

import stonesStrict.pattern_factory.factory.abstractFactory.material.CowMilk;
import stonesStrict.pattern_factory.factory.abstractFactory.material.Packing;
import stonesStrict.pattern_factory.factory.abstractFactory.material.Water;

/**
 * Created by admin on 2018/4/20.
 */
public interface MilkMaterialAbstractFactory {

    CowMilk getCowMilk();

    Water getWater();

    Packing getPacking();

}
