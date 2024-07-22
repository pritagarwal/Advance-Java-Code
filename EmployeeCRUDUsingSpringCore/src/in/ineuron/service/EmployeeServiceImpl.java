package in.ineuron.service;

import in.ineuron.bo.EmployeeBO;
import in.ineuron.dao.IEmployeeDAO;
import in.ineuron.dto.EmployeeDTO;
import in.ineuron.vo.EmployeeVO;

public class EmployeeServiceImpl implements IEmployeeService {

	private IEmployeeDAO dao;

	public EmployeeServiceImpl(IEmployeeDAO dao) {
		this.dao = dao;
	}


	@Override
	public boolean saveEmployee(EmployeeDTO e) throws Exception {
		
		EmployeeBO emp = new EmployeeBO();
		emp.setEname(e.getEname());
		emp.setEaddress(e.getEaddress());
		emp.setEage(e.getEage());
		int res = dao.save(emp);
		if(res == 1)
		return true;
		return false;
	}

	@Override
	public EmployeeVO viewEmployee(Integer eid) throws Exception {
		
		if(dao.search(eid))
		{
			EmployeeBO e = dao.get(eid);
			EmployeeVO emp = new EmployeeVO();
			emp.setEid(Integer.toString(e.getEid()));
			emp.setEname(e.getEname());
			emp.setEage(Integer.toString(e.getEage()));
			emp.setEaddress(e.getEaddress());
			return emp;
		}
		else
		{
			EmployeeVO e = new EmployeeVO();
			return e;
		}
		
	}

	@Override
	public boolean UpdateEmployee(EmployeeDTO e) throws Exception {
		
		EmployeeBO emp = new EmployeeBO();
		emp.setEid(e.getEid());
		emp.setEname(e.getEname());
		emp.setEaddress(e.getEaddress());
		emp.setEage(e.getEage());
		return dao.update(emp);
	}

	@Override
	public boolean  deleteEmployee(Integer eid) throws Exception {
		return (dao.delete(eid)==1)?true:false;
		
	}


	@Override
	public boolean findEmployee(Integer eid) throws Exception {
		boolean res = dao.search(eid);
		if(res)
			return true;
		return false;
	}

}
