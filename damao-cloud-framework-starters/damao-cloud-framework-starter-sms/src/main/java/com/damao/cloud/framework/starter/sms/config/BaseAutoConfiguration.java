package com.damao.cloud.framework.starter.sms.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * <p>描述: [类型描述] </p>
 * <p>创建时间: 2020/12/9 </p>
 *
 * @author <a href="mailto:chenys@highzap.com" rel="nofollow">陈永松</a>
 * @version v1.0
 */
// 扫描 sdk 下的所有注解，并通过 resource/META-INF/spring.factories 扫描自动配置类
@ComponentScan("com.damao.cloud.framework.sdk.sms")
@Configuration
public class BaseAutoConfiguration {
}
