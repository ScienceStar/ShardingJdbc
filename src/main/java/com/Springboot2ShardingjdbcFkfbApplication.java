package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @ClassName com.Springboot2ShardingjdbcFkfbApplication
 * @Description: TODO
 * @Author lxc
 * @Date 2020/8/15 21:45
 * @Version V1.0
 **/
@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@EnableTransactionManagement(proxyTargetClass = true)
@EnableConfigurationProperties
public class Springboot2ShardingjdbcFkfbApplication {
    public static void main(String[] args) {
        SpringApplication.run(Springboot2ShardingjdbcFkfbApplication.class, args);
    }
}
