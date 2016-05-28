package org.aaron.spring.boot.example.service.impl;

import org.aaron.spring.boot.example.config.MyConfigurationProperties;
import org.aaron.spring.boot.example.model.MyServiceResponse;
import org.aaron.spring.boot.example.service.MyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("server,recording_server")
public class MyServiceImpl implements MyService {

    private static final Logger LOG = LoggerFactory.getLogger(MyServiceImpl.class);

    @Autowired
    MyConfigurationProperties myConfigurationProperties;

    @Value("${my.service.data:default}")
    String data;

    @Override
    public MyServiceResponse getServiceResponse(String id) {
        final MyServiceResponse serviceResponse = new MyServiceResponse();
        serviceResponse.setId(id);
        serviceResponse.setData(data);
        serviceResponse.setListAttributes(myConfigurationProperties.getListAttributes());
        serviceResponse.setMapAttributes(myConfigurationProperties.getMapAttributes());
        return serviceResponse;
    }

}
