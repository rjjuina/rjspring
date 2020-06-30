package com.jjuina.rjspring.ioc;

import com.jjuina.rjspring.BeanDefinition;
import com.jjuina.rjspring.PropertyValue;
import com.jjuina.rjspring.PropertyValues;
import com.jjuina.rjspring.factory.AutowireCapableBeanFactory;
import com.jjuina.rjspring.factory.BeanFactory;
import com.jjuina.rjspring.io.ResourceLoader;
import com.jjuina.rjspring.xml.XmlBeanDefinitionReader;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class BeanFactoryTest {

    @Test
    public void test_getBean() throws Exception {
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
        xmlBeanDefinitionReader.loadBeanDefinitions("beanConfig.xml");

        BeanFactory beanFactory = new AutowireCapableBeanFactory();
        for (Map.Entry<String, BeanDefinition> entry : xmlBeanDefinitionReader.getRegistry().entrySet()) {
            beanFactory.registerBeanDefinition(entry.getKey(), entry.getValue());
        }

        HelloService helloService = (HelloService) beanFactory.getBean("helloService");
        assertEquals("Hello World", helloService.helleWorld());
        assertEquals("Hello World!", helloService.getText());
    }
}