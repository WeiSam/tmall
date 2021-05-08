package io.sam.order;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zhuweimu
 * @description
 * @date 2021/5/7 16:33
 */
@Slf4j
@EnableDiscoveryClient
@SpringBootApplication
public class MallOrder {
    public static void main(String[] args) {
        SpringApplication.run(MallOrder.class,args);
        log.info("订单服务启动完成");
    }
}
