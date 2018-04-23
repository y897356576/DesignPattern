package stonesStrict.pattern_strategy.pay.payProcessor;

import stonesStrict.pattern_strategy.pay.PayContext;

/**
 * Created by admin on 2018/4/23.
 */
public class AliPayProcessor extends AbstractPayProcessor {

    @Override
    protected Boolean preCheck(PayContext context) {
        System.out.println("进行支付宝支付前置验证。");
        if (context.getCent() <= 0) {
            context.setMsg("支付金额必须大于0。");
            return false;
        }
        return true;
    }

    @Override
    protected void doPay(PayContext context) {
        System.out.println("调用支付宝支付：交易额[" + context.getCent() + "]...");
    }

    @Override
    protected ProcessorEnum getChannel() {
        return ProcessorEnum.ALI_PAY;
    }
}
