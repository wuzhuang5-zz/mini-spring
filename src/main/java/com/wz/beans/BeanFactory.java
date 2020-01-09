package com.wz.beans;

/**
 * bean工厂
 */
public interface BeanFactory {
    /**
     * 获取bean
     * @return
     */
    Object getBean(String name) throws Exception;
}
