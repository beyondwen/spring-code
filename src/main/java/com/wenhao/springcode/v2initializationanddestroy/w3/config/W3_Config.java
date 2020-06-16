package com.wenhao.springcode.v2initializationanddestroy.w3.config;

import com.wenhao.springcode.v2initializationanddestroy.w3.domain.W3_MyBean;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

@Component
@Import(W3_MyBean.class)
public class W3_Config {


}
