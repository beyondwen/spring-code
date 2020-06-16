package com.wenhao.springcode.v1.config;

import com.wenhao.springcode.v1.bean.MyBean;
import com.wenhao.springcode.v1.processors.MyProcessors;
import lombok.Data;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

@Component
@Data
@Import({MyBean.class, MyProcessors.class})
public class MyConfig {

    private Integer age = 10;

    private String name = "lisi";
}
