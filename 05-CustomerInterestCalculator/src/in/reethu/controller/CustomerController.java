package in.reethu.controller;

import in.reethu.dto.CustomerDTO;
import in.reethu.service.ICustomerMgmtService;
import in.reethu.vo.CustomerVo;

public class CustomerController {
	ICustomerMgmtService service;

	static {
		System.out.println("Controller.class file is loading...");
	}

	public CustomerController(ICustomerMgmtService service) {
		System.out.println("MainController:: one param constructor...");
		this.service = service;
	}

	public String processResult(CustomerVo vo) {
		CustomerDTO dto = new CustomerDTO();
		
		dto.setCustomerName(vo.getCustomerName());
		dto.setCustomerAddress(vo.getCustomerAddress());
		dto.setPamt(Float.parseFloat(vo.getPamt()));
		dto.setRate(Float.parseFloat(vo.getRate()));
		dto.setTime(Float.parseFloat(vo.getTime()));
		
		String result = service.calculateSimpleInterest(dto);

		return result;
	}
}
