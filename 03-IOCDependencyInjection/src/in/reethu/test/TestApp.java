package in.reethu.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.reethu.bean.Person;

public class TestApp {
	public static void main(String[] args) {

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);

		reader.loadBeanDefinitions("in/reethu/cfg/applicationContext.xml");

		Person person1 = factory.getBean("person1", Person.class);
		System.out.println(person1);

		System.out.println();

		Person person2 = factory.getBean("person2", Person.class);
		System.out.println(person2);

	}}
