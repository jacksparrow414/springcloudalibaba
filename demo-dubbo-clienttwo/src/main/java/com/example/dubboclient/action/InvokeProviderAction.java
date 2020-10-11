package com.example.dubboclient.action;

import com.example.prividerone.api.ProviderApi;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Component;

/**
 * @author jacksparrow414
 * @date 2020/10/11
 */
@Component
public class InvokeProviderAction {

    @DubboReference()
    private ProviderApi providerApi;
    
    public String invokeProvider(String name) {
      return providerApi.getInfo(name);
    }
}
