package stonesStrict.pattern_strategy.pay.payProcessor;

import stonesStrict.pattern_strategy.pay.PayContext;

import javax.annotation.PostConstruct;

/**
 * Created by admin on 2018/4/23.
 */
public abstract class AbstractPayProcessor implements IPayProcessor {

    @Override
    public void payProcessor(PayContext context) {
        baseCheck(context);
        if (!preCheck(context)) {
            return;
        }
        doPay(context);
    }

    protected void baseCheck(PayContext context) {
        if (context == null) {
            throw new RuntimeException("支付接口调用异常，请求参数无效。");
        }
    }

    protected abstract Boolean preCheck(PayContext context);

    protected abstract void doPay(PayContext context);

    @PostConstruct
    protected void initChannelMap() {
        channelMap.put(getChannel(), this);
    }

    protected abstract ProcessorEnum getChannel();

}
