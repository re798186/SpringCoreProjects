package in.reethu.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.reethu.bean.College;
import in.reethu.bean.ContactsInfo;
import in.reethu.bean.MarksInfo;

public class ClientApp {
	public static void main(String[] args) {

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("in/reethu/cfg/applicationContext.xml");

		// Array object is injected
		MarksInfo marksInfo = factory.getBean("marksInfo", MarksInfo.class);
		System.out.println(marksInfo);
		
		System.out.println();

		//List object is injected
		College clg = factory.getBean("college", College.class);
		System.out.println(clg);

		System.out.println();
		
		//Set object is injected
		ContactsInfo info = factory.getBean("cinfo", ContactsInfo.class);
		System.out.println(info);

	}
}
