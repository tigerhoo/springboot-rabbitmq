package com.damao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author huyongxing
 * @email huyongxing@qihaiyun.com
 * @date 2018/7/11 15:22
 */
@ComponentScan(basePackages = "com")
@SpringBootApplication
public class ApplicationAction {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationAction.class);
    }
}
