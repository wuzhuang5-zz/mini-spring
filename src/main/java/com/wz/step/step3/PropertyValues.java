package com.wz.step.step3;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: bean属性注入
 * @Author: wz
 */
public class PropertyValues {
    private List<PropertyValue> propertyValueList = new ArrayList<>();

    public void addPropertyValue(PropertyValue propertyValue) {
        this.propertyValueList.add(propertyValue);
    }

    public List<PropertyValue> getPropertyValueList() {
        return this.propertyValueList;
    }
}
