package com.hc;

import com.hc.demo1.MyAnnotation;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class AnnotationDemoApplicationTests {

    @MyAnnotation
    public void fun(){
        System.out.println("fun");
    }

    @Test
    void contextLoads() {
        fun();  //不知道在普通环境下如何使用测试
    }

}
