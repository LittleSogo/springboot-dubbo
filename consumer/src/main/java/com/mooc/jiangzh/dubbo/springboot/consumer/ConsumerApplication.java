package com.mooc.jiangzh.dubbo.springboot.consumer;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import com.mooc.jiangzh.dubbo.springboot.consumer.quickstart.QuickStartConsumer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableDubboConfiguration
public class ConsumerApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext run =  SpringApplication.run(ConsumerApplication.class, args);
        QuickStartConsumer quickStartConsumer = (QuickStartConsumer) run.getBean("quickStartConsumer");
        quickStartConsumer.sendMessage("同学们都可以找到一个百万年薪的工作");
    }

}
