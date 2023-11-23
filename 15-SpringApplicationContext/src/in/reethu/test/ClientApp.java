package in.reethu.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApp {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("in/reethu/cfg/applicationContext.xml");

		//Flipkart flipkart = factory.getBean("fpkt", Flipkart.class);
		//System.out.println(flipkart.shopping(new String[] { "fossil", "puma", "iphone" },
				//new float[] { 35000.5f, 56000.0f, 75000.35f }));

	}
}
