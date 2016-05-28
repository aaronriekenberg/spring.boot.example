package org.aaron.spring.boot.example.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;
import java.util.Map;

@JsonPropertyOrder({"id", "data", "mapAttributes", "listAttributes"})
public class MyServiceResponse {

    private String id;

    private String data;

    private Map<String, MyValue> mapAttributes;

    private List<MyValue> listAttributes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
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
