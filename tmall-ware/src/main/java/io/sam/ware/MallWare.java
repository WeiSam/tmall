package io.sam.ware;

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
public class MallWare {
    public static void main(String[] args) {
        SpringApplication.run(MallWare.class,args);
        log.info("仓储服务启动完成");
    }
}
