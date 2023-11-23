package in.reethu.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.reethu.bean.A;
import in.reethu.bean.B;

public class TestApp {
	public static void main(String[] args) {

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);

		reader.loadBeanDefinitions("in/reethu/cfg/applicationContext.xml");

		A a = factory.getBean("a", A.class);
		System.out.println(a);

		System.out.println();

		B b = factory.getBean("b", B.class);
		System.out.println(b);

	}}
