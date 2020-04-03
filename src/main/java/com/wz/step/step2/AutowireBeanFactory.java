package com.wz.step.step2;

/**
 * @Description: 工厂实现类
 * @Author: wz
 */
public class AutowireBeanFactory extends AbstractBeanFactory{

    @Override
    protected Object doCreateBean(BeanDefinition beanDefinition) {
        try {
           return beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
