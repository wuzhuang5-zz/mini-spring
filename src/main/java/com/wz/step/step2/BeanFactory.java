package com.wz.step.step2;

/**
 * @Description: bean工厂
 * @Author: wz
 */
public interface BeanFactory {
    /**
     * 获取bean
     * @param name
     * @return
     */
    Object getBean(String name);

    /**
     * 注册bean
     * @param name
     * @param beanDefinition
     */
    void registerBeanDefinition(String name, BeanDefinition beanDefinition);
}
