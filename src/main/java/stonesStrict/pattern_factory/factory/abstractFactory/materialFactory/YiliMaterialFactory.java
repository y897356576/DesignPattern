package stonesStrict.pattern_factory.factory.abstractFactory.materialFactory;

import stonesStrict.pattern_factory.factory.abstractFactory.material.CowMilk;
import stonesStrict.pattern_factory.factory.abstractFactory.material.Packing;
import stonesStrict.pattern_factory.factory.abstractFactory.material.Water;

/**
 * Created by admin on 2018/4/20.
 */
public class YiliMaterialFactory implements MilkMaterialAbstractFactory {

    @Override
    public CowMilk getCowMilk() {
        return new YiliCowMilk();
    }

    @Override
    public Water getWater() {
        return new YiliWater();
    }

    @Override
    public Packing getPacking() {
        return new YiliPacking();
    }



    /*-------------------------------------------*/

    String factoryName = "[伊利]";

    class YiliCowMilk extends CowMilk{
        @Override
        public String getName() {
            return super.getName() + factoryName;
        }
    }

    class YiliWater extends Water{
        @Override
        public String getName() {
            return super.getName() + factoryName;
        }
    }

    class YiliPacking extends Packing{
        @Override
        public String getName() {
            return super.getName() + factoryName;
        }
    }
}
