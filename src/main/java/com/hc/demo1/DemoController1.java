package com.hc.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 梁云亮
 * @Date 2020/5/29 14:48
 * @Description:
 */
@RestController
public class DemoController1 {
    /**
     * 使用了@WebToken，如果在切面类中没有经过校验验证，会直接抛出异常，不会进入Controller方法
     */
    @MyAnnotation
    @GetMapping(value = "/fun1")
    public void fun() {
        // 自己的业务实现
        System.out.println("fun1");
    }
}
