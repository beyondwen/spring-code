package com.wenhao.springcode.v2initializationanddestroy.w3.test;

import com.wenhao.springcode.v2initializationanddestroy.w3.config.W3_Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class W3_Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(W3_Config.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }
}
