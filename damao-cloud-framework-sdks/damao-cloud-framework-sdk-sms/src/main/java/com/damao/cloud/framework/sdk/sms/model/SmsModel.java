package com.damao.cloud.framework.sdk.sms.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * <p>描述: [类型描述] </p>
 * <p>创建时间: 2020/12/9 </p>
 *
 * @author <a href="mailto:chenys@highzap.com" rel="nofollow">陈永松</a>
 * @version v1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SmsModel {
    private String smsContent;
    private List<String> phone;
}
