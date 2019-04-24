package com.damao.controller;

import com.qihai.commerce.framework.mq.producer.RabbitMqSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huyongxing
 * @site www.skson.com
 * @date 2018/7/11 15:25
 */
@RestController
public class AMQPProducer {

    @Autowired
    private RabbitMqSender sender;

    @RequestMapping("/api/send")
    public void send(String code) {
        sender.sendRabbitmqDirect("ex1", "test1", "queue1", code);

    }
}
