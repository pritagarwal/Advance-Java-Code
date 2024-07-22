package in.ineuron.controller;

import in.ineuron.dto.EmployeeDTO;
import in.ineuron.service.IEmployeeService;
import in.ineuron.vo.EmployeeVO;

public class MainController {
	private IEmployeeService service;

	public MainController(IEmployeeService service) {
		this.service = service;
	}
	
	public boolean addEmployee(EmployeeVO e) throws Exception
	{
		EmployeeDTO emp = new EmployeeDTO();
		emp.setEname(e.getEname());
		emp.setEaddress(e.getEaddress());
		emp.setEage(Integer.parseInt(e.getEage()));
		boolean res = service.saveEmployee(emp);
		if(res)
		return true;
		return false;
	}
	
	public EmployeeVO getEmployeeDetails(Integer eid) throws Exception
	{
		
		EmployeeVO e  = service.viewEmployee(eid);
		return  e;
	}
	
	public boolean findEmployee(Integer eid) throws Exception
	{
		return service.findEmployee(eid);
		
	}
	public boolean updateEmployee(EmployeeVO e) throws Exception
	{
		EmployeeDTO emp = new EmployeeDTO();
		emp.setEid(Integer.parseInt(e.getEid()));
		emp.setEname(e.getEname());
		emp.setEaddress(e.getEaddress());
		emp.setEage(Integer.parseInt(e.getEage()));
		return service.UpdateEmployee(emp);
	}
	public boolean  deleteEmployee(Integer eid) throws Exception
	{
		return service.deleteEmployee(eid);
		
	}
	
	
}
