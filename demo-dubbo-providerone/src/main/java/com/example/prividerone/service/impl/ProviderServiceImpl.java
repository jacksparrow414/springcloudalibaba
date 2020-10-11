package com.example.prividerone.service.impl;

import com.example.prividerone.api.ProviderApi;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author jacksparrow414
 * @date 2020/10/11
 */
@DubboService
public class ProviderServiceImpl implements ProviderApi {
    
    @Override
    public String getInfo(String name) {
        String info = "Hi, " + name + ", I got you";
        System.out.println(info);
        return info;
    }
}
