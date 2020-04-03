package com.wz.step.step3.factory;

import com.wz.step.step3.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: bean抽象工厂类
 * @Author: wz
 */
public abstract class AbstractBeanFactory implements BeanFactory{

    private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();

    @Override
    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    @Override
    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        Object bean = doCreateBean(beanDefinition);
        beanDefinition.setBean(bean);
        beanDefinitionMap.put(name, beanDefinition);
    }

    protected abstract Object doCreateBean(BeanDefinition beanDefinition);
}
