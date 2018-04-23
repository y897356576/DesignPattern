package stonesStrict.pattern_strategy.pay;

import stonesStrict.pattern_strategy.pay.payProcessor.AliPayProcessor;
import stonesStrict.pattern_strategy.pay.payProcessor.IPayProcessor;
import stonesStrict.pattern_strategy.pay.payProcessor.ProcessorEnum;
import stonesStrict.pattern_strategy.pay.payProcessor.WechatPayProcessor;

/**
 * Created by admin on 2018/4/23.
 */
public class PayProcessorTest {

    public void doPayProcessor(IPayProcessor processor, PayContext context) {
        processor.payProcessor(context);
    }


    public static void main(String[] args) {
        IPayProcessor.channelMap.put(ProcessorEnum.ALI_PAY, new AliPayProcessor());
        IPayProcessor.channelMap.put(ProcessorEnum.WECHAT_PAY, new WechatPayProcessor());

        PayContext context = new PayContext();
        context.setCent(10000D);
        new PayProcessorTest().doPayProcessor(IPayProcessor.channelMap.get(ProcessorEnum.WECHAT_PAY), context);
    }

}
