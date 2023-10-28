package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.MainController;
import com.nt.vo.EmployeeVO;

public class RealtimeDITest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader= new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get spring bean class object ref
		MainController controller= factory.getBean("controller",MainController.class);
		Scanner se=new Scanner(System.in);
		System.out.println("Enter the name");
		String  ename= se.next();
		System.out.println("Enter the desg");
		String desg= se.next();
		System.out.println("Enter the bassicSalary");
		String basicSalary=se.next();
		EmployeeVO vo=new EmployeeVO();
		vo.setEname(ename);
		vo.setDesg(desg);
		vo.setBasicSalary(basicSalary);
		// invok method
		try {
			String result= controller.processEmployee(vo);
			System.out.println(result);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
