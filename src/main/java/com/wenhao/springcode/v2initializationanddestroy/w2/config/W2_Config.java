package com.wenhao.springcode.v2initializationanddestroy.w2.config;

import com.wenhao.springcode.v2initializationanddestroy.w2.domain.W2_MyBean;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

@Component
@Import(W2_MyBean.class)
public class W2_Config {


}
