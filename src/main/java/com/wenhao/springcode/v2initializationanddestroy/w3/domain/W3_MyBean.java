package com.wenhao.springcode.v2initializationanddestroy.w3.domain;

import lombok.Data;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Data
public class W3_MyBean {


    @PreDestroy
    public void destroy() throws Exception {
        System.out.println("PreDestroy销毁方法");
    }

    @PostConstruct
    public void init() throws Exception {
        System.out.println("PostConstruct初始化方法");
    }
}
