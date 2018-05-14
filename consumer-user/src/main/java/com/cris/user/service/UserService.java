package com.cris.user.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cris.ticket.service.TicketService;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserService
 * @Description TODO
 * @Author zc-cris
 * @Version 1.0
 **/
@Service
public class UserService {

    @Reference  // 根据全类名来引用注册中心的服务提供者
    TicketService ticketService;

    public void buy(){
        System.out.println("买到票了："+ticketService.saleTicket());
    }
}
