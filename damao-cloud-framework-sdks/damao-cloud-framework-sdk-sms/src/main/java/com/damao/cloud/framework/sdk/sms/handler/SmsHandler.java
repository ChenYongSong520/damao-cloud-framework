package com.damao.cloud.framework.sdk.sms.handler;

import com.damao.cloud.framework.sdk.sms.model.SmsModel;

/**
 * <p>描述: [类型描述] </p>
 * <p>创建时间: 2020/12/9 </p>
 *
 * @author <a href="mailto:chenys@highzap.com" rel="nofollow">陈永松</a>
 * @version v1.0
 */
public interface SmsHandler {
    /**
     * 描述: [发送验证]
     *
     * @param smsModel 短信实体
     * @auther 陈永松
     * @date 2020/12/9 17:24
     */
    void sendSms(SmsModel smsModel);
}
