package in.reethu.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.reethu.bean.Car;

public class ClientApp {
	public static void main(String[] args) {

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);

		reader.loadBeanDefinitions("in/reethu/cfg/applicationContext.xml");

		Car car1 = factory.getBean("car1", Car.class);
		System.out.println(car1);

		System.out.println();

		Car car2 = factory.getBean("car2", Car.class);
		System.out.println(car2);
		
		System.out.println();
		
		//Car car3 = factory.getBean("baseCar", Car.class);
		//System.out.println(car3);


	}
}
