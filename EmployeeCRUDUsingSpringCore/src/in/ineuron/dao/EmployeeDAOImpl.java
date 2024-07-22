package in.ineuron.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import in.ineuron.bo.EmployeeBO;

public class EmployeeDAOImpl implements IEmployeeDAO {

	private DataSource dataSource;

	private static final String SAVE_QUERY = "insert into employee(ename,eage,eaddress) values(?,?,?)";
	private static final String SEARCH_QUERY = "Select * from employee where eid=?";
	private static final String UPDATE_QUERY = "update employee set ename=?,eage=?,eaddress=? where eid=?;";
	private static final String DELETE_QUERY = "delete from employee where eid=?;";

	
	EmployeeDAOImpl(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public boolean search(Integer eid) throws Exception {
		try (Connection con = dataSource.getConnection();
				PreparedStatement pstat = con.prepareStatement(SEARCH_QUERY);) {
			pstat.setInt(1, eid);
			ResultSet res = pstat.executeQuery();
			if (res.next() == false)
				return false;
			else
				return true;

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return false;
	}

	@Override
	public boolean update(EmployeeBO bo) throws Exception {
		
		try (Connection con = dataSource.getConnection(); PreparedStatement pstat = con.prepareStatement(UPDATE_QUERY);) {

			pstat.setString(1, bo.getEname());
			pstat.setInt(2, bo.getEage());
			pstat.setString(3, bo.getEaddress());
			pstat.setInt(4, bo.getEid());
			int res = pstat.executeUpdate();
			return res==1?true:false;

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

	@Override
	public int  delete(Integer eid) throws Exception {
		try (Connection con = dataSource.getConnection(); PreparedStatement pstat = con.prepareStatement(DELETE_QUERY);) {
 
			pstat.setInt(1, eid);
			return pstat.executeUpdate();
			

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return 0;
		
	}

	@Override
	public int save(EmployeeBO bo) throws Exception {
		try (Connection con = dataSource.getConnection(); PreparedStatement pstat = con.prepareStatement(SAVE_QUERY);) {

			pstat.setString(1, bo.getEname());
			pstat.setInt(2, bo.getEage());
			pstat.setString(3, bo.getEaddress());
			int res = pstat.executeUpdate();
			return res;

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return 0;
	}

	@Override
	public EmployeeBO get(Integer eid) throws Exception {
		try (Connection con = dataSource.getConnection();
				PreparedStatement pstat = con.prepareStatement(SEARCH_QUERY);) {
			pstat.setInt(1, eid);
			ResultSet res = pstat.executeQuery();
			if (res.next()) {
				EmployeeBO e = new EmployeeBO();
				e.setEid(res.getInt(1));
				e.setEname(res.getString(2));
				e.setEage(res.getInt(3));
				e.setEaddress(res.getString(4));
				return e;
			}

			else
				return new EmployeeBO();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return null;
	}

}
