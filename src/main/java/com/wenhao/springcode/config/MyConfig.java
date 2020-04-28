package com.wenhao.springcode.config;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class MyConfig {

    private Integer age = 10;

    private String name = "lisi";
}
