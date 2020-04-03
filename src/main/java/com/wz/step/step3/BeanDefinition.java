package com.wz.step.step3;

/**
 * @Description: bean元数据
 * @Author: wz
 */
public class BeanDefinition {

    private Object bean;

    private Class beanClass;

    private PropertyValues propertyValues;


    public Object getBean() {
        return bean;
    }

    public void setBean(Object bean) {
        this.bean = bean;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

    public PropertyValues getPropertyValues() {
        return propertyValues;
    }

    public void setPropertyValues(PropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }


}
