package com.example.spring.bean.scope.service;

import com.example.spring.bean.scope.singletonbean.RequestScopeBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class StudentService {
    @Autowired
    private RequestScopeBean requestScopeBean;

    public void registerStudent(String name, String address){
        requestScopeBean.setStudentDetails(name, address);
        requestScopeBean.register();
    }
}
