package com.wz.step.step3.factory;

import com.wz.step.step3.BeanDefinition;
import com.wz.step.step3.PropertyValue;

import java.lang.reflect.Field;

/**
 * @Description: bean工厂实现类
 * @Author: wz
 */
public class AutowireBeanFactory extends AbstractBeanFactory{
    @Override
    protected Object doCreateBean(BeanDefinition beanDefinition) {
        try {
            Object bean = createBeanInstance(beanDefinition);
            addPropertyValue(bean, beanDefinition);
            return bean;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    private Object createBeanInstance(BeanDefinition beanDefinition) throws Exception{
        return beanDefinition.getBeanClass().newInstance();
    }

    private void addPropertyValue(Object bean, BeanDefinition beanDefinition) throws Exception{
        for (PropertyValue propertyValue : beanDefinition.getPropertyValues().getPropertyValueList()) {
            Field field = bean.getClass().getField(propertyValue.getName());
            field.setAccessible(true);
            field.set(bean, propertyValue.getValue());
        }
    }
}
