package in.ineuron.service;

import in.ineuron.dto.EmployeeDTO;
import in.ineuron.vo.EmployeeVO;

public interface IEmployeeService {

	public boolean saveEmployee(EmployeeDTO e) throws Exception;
	
	public boolean findEmployee(Integer eid) throws Exception;

	public EmployeeVO viewEmployee(Integer eid) throws Exception;

	public boolean UpdateEmployee(EmployeeDTO e) throws Exception;

	public boolean deleteEmployee(Integer eid) throws Exception;
}
