package com.example.dubboclient.action;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author jacksparrow414
 * @date 2020/10/11
 */
@SpringBootTest
public final class InvokeProviderActionTest {
    
    @Autowired
    private InvokeProviderAction invokeProviderAction;
    
    @Test
    void assertInvokeProvider() {
        String actual = invokeProviderAction.invokeProvider("dubbo provider one");
        Assert.assertEquals("Hi, dubbo provider one, I got you", actual);
    }
}