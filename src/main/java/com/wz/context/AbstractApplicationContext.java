package com.wz.context;

import com.wz.beans.AbstractBeanFactory;
/**
 * @Author: wz
 */
public abstract class AbstractApplicationContext implements ApplicationContext {

    AbstractBeanFactory  abstractBeanFactory;


    @Override
    public Object getBean(String name) throws Exception{
        return abstractBeanFactory.getBean(name);
    }
}
