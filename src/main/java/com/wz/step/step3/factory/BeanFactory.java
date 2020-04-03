package com.wz.step.step3.factory;

import com.wz.step.step2.BeanDefinition;

/**
 * @Description: bean工厂
 * @Author: wz
 */
public interface BeanFactory {
    Object getBean(String name);

    void registerBeanDefinition(String name, BeanDefinition beanDefinition);
}
