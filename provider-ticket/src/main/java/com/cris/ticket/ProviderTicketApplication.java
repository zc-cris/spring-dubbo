package com.cris.ticket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
* @Author zc-cris
* @Description 将服务注册到服务中心
*               1. 引入dubbo和zookeeper的相关依赖
*               2. 配置dubbo的扫描包和注册中心地址
*               3. 使用@Service（dubbo的注解）发布服务
* @Param
* @return
**/
@SpringBootApplication
public class ProviderTicketApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderTicketApplication.class, args);
    }
}
