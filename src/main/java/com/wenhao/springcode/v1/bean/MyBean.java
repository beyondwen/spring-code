package com.wenhao.springcode.v1.bean;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class MyBean implements BeanNameAware, InitializingBean, DisposableBean {

    public MyBean() {
        System.out.println("无参构造函数执行");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("设置BeanName>>>>>>>" + name);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("初始化方法执行");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("销毁方法执行");
    }
}
