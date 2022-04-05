package com.example.spring.bean.scope;

import com.example.spring.bean.scope.singletonbean.SingletonBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@Slf4j
@SpringBootApplication
public class SpringBeanScopeApplication {

    public static void main(String[] args) {
         SpringApplication.run(SpringBeanScopeApplication.class, args);
//        SingletonBean singletonBean1 = context.getBean(SingletonBean.class);
//        log.info("Bean1: {}",singletonBean1);
//        singletonBean1.setA(5);
//        singletonBean1.setB(2);
//
//        SingletonBean singletonBean2 = context.getBean(SingletonBean.class);
//        log.info("Bean2: {}",singletonBean2);
//        log.info("A:"+singletonBean2.getA());//Output:A:2  B:2-singleton
//        log.info("B:"+singletonBean2.getB());//A:0  B:0-prototype
//    }

    }
}
