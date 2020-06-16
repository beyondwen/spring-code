package com.wenhao.springcode.v2initializationanddestroy.w2.test;

import com.wenhao.springcode.v2initializationanddestroy.w2.config.W2_Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class W2_Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(W2_Config.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }
}
