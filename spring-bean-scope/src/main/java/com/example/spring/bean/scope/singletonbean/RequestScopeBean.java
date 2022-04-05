package com.example.spring.bean.scope.singletonbean;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Slf4j
@Component
@RequestScope
//@Scope(value = "request",proxyMode = ScopedProxyMode.TARGET_CLASS)
public class RequestScopeBean {
    private String name;
    private String address;

    public void setStudentDetails(String name, String address) {
        this.name = name;
        this.address = address;
        try {
            Thread.sleep(30 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void register() {
        log.info("Student {} with address {} is registered",name, address);
    }
}
