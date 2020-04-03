package com.wz.step.step1;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Description: bean工厂
 * @Author: wz
 */
public class BeanFactory {
    /**
     * bean容器
     */
    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    /**
     * 获取bean
     * @param name
     * @return
     */
    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    /**
     * 注册bean
     * @param name
     * @param beanDefinition
     */
    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }
}
