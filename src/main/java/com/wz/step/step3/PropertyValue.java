package com.wz.step.step3;

/**
 * @Description: bean属性注入
 * @Author: wz
 */
public class PropertyValue {

    private String name;

    private Object value;

    public PropertyValue(String name, Object value) {
       this.name = name;
       this.value = value;
    }
    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}
