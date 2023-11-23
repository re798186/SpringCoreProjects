package in.reethu.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.reethu.bean.PersonInfo;

public class ClientApp {
	public static void main(String[] args) {

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);

		reader.loadBeanDefinitions("in/reethu/cfg/applicationContext.xml");
		
		
		PersonInfo personInfo1 = factory.getBean("per1", PersonInfo.class);
		System.out.println(personInfo1);
		
		System.out.println();
		
		PersonInfo personInfo2= factory.getBean("per2", PersonInfo.class);
		System.out.println(personInfo2);

	}
}
