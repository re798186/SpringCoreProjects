package in.reethu.service;

import in.reethu.dto.CustomerDTO;

public interface ICustomerMgmtService {
	public abstract String calculateSimpleInterest(CustomerDTO dto);
}
