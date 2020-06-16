package com.wenhao.springcode.v2initializationanddestroy.w1.test;

import com.wenhao.springcode.v2initializationanddestroy.w1.config.W1_Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class W1_Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(W1_Config.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }
}
