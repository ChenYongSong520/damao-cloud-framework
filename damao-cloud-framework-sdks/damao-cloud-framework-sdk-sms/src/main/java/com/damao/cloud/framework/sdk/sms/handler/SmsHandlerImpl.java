package com.damao.cloud.framework.sdk.sms.handler;

import com.damao.cloud.framework.sdk.sms.model.SmsModel;
import org.springframework.stereotype.Component;

/**
 * <p>描述: [类型描述] </p>
 * <p>创建时间: 2020/12/9 </p>
 *
 * @author <a href="mailto:chenys@highzap.com" rel="nofollow">陈永松</a>
 * @version v1.0
 */
@Component
public class SmsHandlerImpl implements SmsHandler {
    /**
     * 描述: [发送短信]
     *
     * @param smsModel 内容
     * @auther 陈永松
     * @date 2020/12/9 17:24
     */
    @Override
    public void sendSms(SmsModel smsModel) {
        System.out.println("验证码发送成功咯");
    }
}
