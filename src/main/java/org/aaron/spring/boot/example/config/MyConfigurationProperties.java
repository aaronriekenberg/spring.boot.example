package org.aaron.spring.boot.example.config;

import org.aaron.spring.boot.example.model.MyValue;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "my.configuration.properties")
public class MyConfigurationProperties {

    private static final Logger LOG = LoggerFactory.getLogger(MyConfigurationProperties.class);

    private String stuff;

    private String things;

    private Map<String, MyValue> mapAttributes = new LinkedHashMap<>();

    private List<MyValue> listAttributes = new ArrayList<>();

    @PostConstruct
    public void postConstruct() {
        LOG.info("MyConfigurationProperties = {}", this);
    }

    public String getStuff() {
        return stuff;
    }

    public void setStuff(String stuff) {
        this.stuff = stuff;
    }

    public String getThings() {
        return things;
    }

    public void setThings(String things) {
        this.things = things;
    }

    public Map<String, MyValue> getMapAttributes() {
        return mapAttributes;
    }

    public void setMapAttributes(Map<String, MyValue> mapAttributes) {
        this.mapAttributes = mapAttributes;
    }

    public List<MyValue> getListAttributes() {
        return listAttributes;
    }

    public void setListAttributes(List<MyValue> listAttributes) {
        this.listAttributes = listAttributes;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
