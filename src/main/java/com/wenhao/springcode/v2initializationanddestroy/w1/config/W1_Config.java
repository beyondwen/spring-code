package com.wenhao.springcode.v2initializationanddestroy.w1.config;

import com.wenhao.springcode.v2initializationanddestroy.w1.domain.W1_MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class W1_Config {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public W1_MyBean w1_myBean() {
        return new W1_MyBean();
    }
}
