package com.wz.beans;

/**
 * 用于bean属性的注入
 */
public class PropertyValue {

    private String name;

    private Object value;

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

}
