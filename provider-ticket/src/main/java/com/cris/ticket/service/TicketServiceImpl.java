package com.cris.ticket.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @ClassName TicketServiceImpl
 * @Description TODO
 * @Author zc-cris
 * @Version 1.0
 **/
@Component
@Service    // 使用dubbo 的@Service 注解将服务注册到zookeeper
public class TicketServiceImpl implements TicketService {
    @Override
    public String saleTicket() {
        return "复仇者联盟三";
    }
}
