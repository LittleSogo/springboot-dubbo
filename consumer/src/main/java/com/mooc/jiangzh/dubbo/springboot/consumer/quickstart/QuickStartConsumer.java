package com.mooc.jiangzh.dubbo.springboot.consumer.quickstart;

import com.alibaba.dubbo.config.annotation.Reference;
import com.mooc.jiangzh.dubbo.springboot.ServiceAPI;
import org.springframework.stereotype.Component;

/**
 * Createed by  slix
 * 2019/4/14 14:55
 */
@Component
public class QuickStartConsumer {

    @Reference(url = "dubbo://localhost:20880")
    ServiceAPI serviceAPI;

    public void sendMessage(String message){
        System.out.println(serviceAPI.sendMmessage(message));

    }
}
