package com.nt.factory;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

import com.nt.comp.BlueDart;
import com.nt.comp.Courier;
import com.nt.comp.Dtdc;
import com.nt.comp.Flipkart;

public class FlipkartFactory {
	private static Properties props;
	static {
		try {
			//load properties
			FileInputStream fis= new FileInputStream("src/main/java/com/nt/commons/info.properties");
			//load properties file content to java.util.properties class object
			props=new  Properties();
			props.load(fis);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
//static  factory method supporting factory pattern
	public static Flipkart createFlipkart() throws Exception
	{
		//create target class object
		Flipkart fpkt=new Flipkart();
		//LOad dependent class
		Class c=Class.forName(props.getProperty("dependent.comp"));
		//create object using reflection object
		Constructor cons[]=c.getDeclaredConstructors();
		//create object
		Courier courier=(Courier)cons[0].newInstance();
		//set dependent class object to target class object
		fpkt.SetCourier(courier);
		
		return fpkt;
		
	}
}
