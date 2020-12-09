package com.damao.cloud.framework.sample.comtroller;

import com.damao.cloud.framework.sdk.sms.handler.SmsHandler;
import com.damao.cloud.framework.sdk.sms.model.SmsModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>描述: [类型描述] </p>
 * <p>创建时间: 2020/12/9 </p>
 *
 * @author <a href="mailto:chenys@highzap.com" rel="nofollow">陈永松</a>
 * @version v1.0
 */
@RestController
@RequestMapping("/api/sms")
public class SmsController {

    private final SmsHandler smsHandler;

    public SmsController(SmsHandler smsHandler) {
        this.smsHandler = smsHandler;
    }

    @RequestMapping("/sms-code")
    public void sendSms() {
        List<String> phone = new ArrayList<>();
        phone.add("17726287401");
        smsHandler.sendSms(new SmsModel("sss", phone));
    }
}
