package com.mooc.jiangzh.dubbo.springboot.provider.quickstart;

import com.alibaba.dubbo.config.annotation.Service;
import com.mooc.jiangzh.dubbo.springboot.ServiceAPI;
import org.springframework.stereotype.Component;

/**
 * Createed by  slix
 * 2019/4/14 15:25
 */
@Component
@Service(interfaceClass = ServiceAPI.class)
public class QuickStartServiceImpl implements ServiceAPI{

    @Override
    public String sendMmessage(String message) {
        return "quickstart-provider-message="+message;
    }
}
