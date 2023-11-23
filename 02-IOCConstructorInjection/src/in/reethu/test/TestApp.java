package in.reethu.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import in.reethu.bean.WishMessageGenerator;

@SuppressWarnings("deprecation")
public class TestApp {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		// using the FileSystemResource to locate the configuration file
		FileSystemResource resource = new FileSystemResource("./src/applicationContext.xml");

		// Creating an IOC container
		XmlBeanFactory factory = new XmlBeanFactory(resource);
		WishMessageGenerator generator = factory.getBean("wmg", WishMessageGenerator.class);


		System.out.println();

		// using the target object performing the operation and printing the result
		String result = generator.generateWishMessage("reethu");
		System.out.println(result);

	}
}
