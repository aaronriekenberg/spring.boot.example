package org.aaron.spring.boot.example.service;

import org.aaron.spring.boot.example.model.MyServiceResponse;

public interface MyService {

    public MyServiceResponse getServiceResponse(String id);
}
