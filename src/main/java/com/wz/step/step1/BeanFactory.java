package com.wz.step.step1;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Description: bean工厂
 * @Author: wz
 */
public class BeanFactory {
    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }
}
