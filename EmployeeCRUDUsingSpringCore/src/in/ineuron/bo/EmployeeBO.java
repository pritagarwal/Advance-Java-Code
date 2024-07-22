package in.ineuron.bo;

import com.zaxxer.hikari.HikariDataSource;

public class EmployeeBO {

	private int eid;
	private String ename;
	private String eaddress;
	private int eage;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEaddress() {
		return eaddress;
	}
	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}
	public int getEage() {
		return eage;
	}
	public void setEage(int eage) {
		this.eage = eage;
	}
	@Override
	public String toString() {
		return "EmployeeBO [eid=" + eid + ", ename=" + ename + ", eaddress=" + eaddress + ", eage=" + eage + "]";
	}


	

	
}
