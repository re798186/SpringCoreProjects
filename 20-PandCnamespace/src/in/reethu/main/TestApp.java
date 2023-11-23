package in.reethu.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.reethu.comp.Employee;

public class TestApp {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext(
				"in/reethu/cfg/applicationContext.xml");

		Employee employee = factory.getBean("emp", Employee.class);
		System.out.println(employee);

		factory.close();
	}
}
