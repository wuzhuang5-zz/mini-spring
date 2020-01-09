package com.wz.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * 包装一个对象所有的PropertyValue
 */
public class PropertyValues {

    private List<PropertyValue> propertyValueList = new ArrayList<>();

    public void addPropertyValue(PropertyValue propertyValue) {
        //todo 做一些校验
        this.propertyValueList.add(propertyValue);
    }
    public List<PropertyValue> getPropertyValueList() {
        return propertyValueList;
    }
}
