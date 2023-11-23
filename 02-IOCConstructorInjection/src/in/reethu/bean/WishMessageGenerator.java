package in.reethu.bean;

import java.util.Date;

public class WishMessageGenerator {

	// Dependent class ---> Predefined
	private Date date;

	static {
		System.out.println("WishMessageGenerator.class file is loading...");
	}

	public WishMessageGenerator(Date date) {
		System.out.println("WishMessageGenerator object is instantiated...");
		this.date = date;
	}


	// BUISNESS logic to use Injected DATE in the Target class Object
	public String generateWishMessage(String name) {
		System.out.println("Date object created using setter inject with the value :: " + date);
		@SuppressWarnings("deprecation")
		int hour = date.getHours();
		if (hour <= 12)
			return "Hello :: " + name + " Good morning!!!";
		else if (hour <= 16)
			return "Hello :: " + name + " Good Afternoon!!!";
		else if (hour <= 20)
			return "Hello :: " + name + " Good Evening!!!";
		else
			return "Hello :: " + name + " Good Night!!!";
	}

}
