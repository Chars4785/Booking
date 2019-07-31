package kr.or.connect.mvcexam.dto;

public class User {
	
	private String id;
	private String pwd;
	// 대신 이름이 같아야 한다.
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", pwd=" + pwd + "]";
	}
	
}
