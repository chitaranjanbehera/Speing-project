package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.A;
public class CyclicDITest {

    public static void main(String[] args) {
        // Create IOC container
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);

        // Load the XML configuration file
        reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
        //get Spring bean Class object
        A oa=factory.getBean("a1",A.class);
        System.out.println(oa);
        // Now, you can work with the Spring container and access your beans
    }
}
