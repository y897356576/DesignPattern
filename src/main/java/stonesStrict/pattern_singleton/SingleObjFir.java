package stonesStrict.pattern_singleton;

/**
 * Created by 石头 on 2018/4/22.
 */
public class SingleObjFir {

    private static SingleObjFir obj = new SingleObjFir();

    private SingleObjFir(){}

    public static SingleObjFir getSingleObj() {
        return obj;
    }

}
