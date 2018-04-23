package stonesStrict.pattern_strategy.pay.payProcessor;

import stonesStrict.pattern_strategy.pay.PayContext;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by admin on 2018/4/23.
 */
public interface IPayProcessor {

    public static Map<ProcessorEnum, IPayProcessor> channelMap = new HashMap<>();

    void payProcessor(PayContext context);

}
