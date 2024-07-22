package in.ineuron.dao;

import in.ineuron.bo.EmployeeBO;

public interface IEmployeeDAO {
	public int save(EmployeeBO bo) throws Exception;

	public boolean search(Integer eid) throws Exception;
	public EmployeeBO get(Integer eid) throws Exception;

	public boolean update(EmployeeBO bo) throws Exception;

	public int  delete(Integer eid) throws Exception; 

}
