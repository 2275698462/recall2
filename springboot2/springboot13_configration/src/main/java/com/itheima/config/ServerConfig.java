package com.itheima.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;


@Data
@ConfigurationProperties(prefix = "servers")

//开启对当前bean的属性注入校验
@Validated
public class ServerConfig {
    private String ipAddress;
    @Max(value = 9999, message = "你太大了兄弟")
    private int port;
    private long timeout;
}
