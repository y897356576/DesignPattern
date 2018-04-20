package stonesStrict.pattern_factory.factory.abstractFactory.materialFactory;

import stonesStrict.pattern_factory.factory.abstractFactory.material.CowMilk;
import stonesStrict.pattern_factory.factory.abstractFactory.material.Packing;
import stonesStrict.pattern_factory.factory.abstractFactory.material.Water;

/**
 * Created by admin on 2018/4/20.
 */
public class MengniuMaterialFactory implements MilkMaterialAbstractFactory {

    @Override
    public CowMilk getCowMilk() {
        return new MengniuCowMilk();
    }

    @Override
    public Water getWater() {
        return new MengniuWater();
    }

    @Override
    public Packing getPacking() {
        return new MengniuPacking();
    }



    /*-------------------------------------------*/

    String factoryName = "[蒙牛]";

    class MengniuCowMilk extends CowMilk{
        @Override
        public String getName() {
            return super.getName() + factoryName;
        }
    }

    class MengniuWater extends Water{
        @Override
        public String getName() {
            return super.getName() + factoryName;
        }
    }

    class MengniuPacking extends Packing{
        @Override
        public String getName() {
            return super.getName() + factoryName;
        }
    }
}
