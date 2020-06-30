package com.jjuina.rjspring.factory;

import com.jjuina.rjspring.BeanDefinition;

public interface BeanFactory {
    void registerBeanDefinition(String name, BeanDefinition beanDefinition) throws Exception;

    Object getBean(String name) throws Exception;
}
