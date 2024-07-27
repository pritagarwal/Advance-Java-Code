package in.ineuron.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository(value = "dao")
public class DAOImpl {
	
	@Autowired
	private JdbcTemplate template;
	
	private String SQL = "select ename from employee where eid=?;";
	public void fetchEmpNameById(Integer id)
	{
		String name = template.queryForObject(SQL,String.class,id);
		System.out.println(name);
	}


}
