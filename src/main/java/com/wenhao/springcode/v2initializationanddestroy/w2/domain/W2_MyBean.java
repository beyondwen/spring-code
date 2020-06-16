package com.wenhao.springcode.v2initializationanddestroy.w2.domain;

import lombok.Data;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

@Data
public class W2_MyBean implements InitializingBean, DisposableBean {


    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean销毁方法");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean初始化方法");
    }
}
