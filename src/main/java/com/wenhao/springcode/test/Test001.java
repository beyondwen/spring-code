package com.wenhao.springcode.test;

import com.wenhao.springcode.config.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test001 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        /*for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }*/
        //applicationContext.close();
    }
}
