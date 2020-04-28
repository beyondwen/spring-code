package com.wenhao.springcode.config;

import com.wenhao.springcode.bean.MyBean;
import com.wenhao.springcode.processors.MyProcessors;
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
