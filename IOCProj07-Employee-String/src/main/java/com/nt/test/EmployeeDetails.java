package com.nt.test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Customer;

public class EmployeeDetails {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);

        // Load the XML configuration file
        reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
        //get Spring bean Class object
        Customer oa=factory.getBean("cust",Customer.class);
        System.out.println(oa);

	}

}
