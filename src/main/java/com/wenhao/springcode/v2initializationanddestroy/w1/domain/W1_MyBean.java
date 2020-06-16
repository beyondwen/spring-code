package com.wenhao.springcode.v2initializationanddestroy.w1.domain;

import lombok.Data;

@Data
public class W1_MyBean {


    private void init() {
        System.out.println("初始化方法");
    }

    private void destroy() {
        System.out.println("销毁方法");
    }
}
