package model;

public class Student {
	private int id;
	private String usn;
	private String pwd;
	private String tel;
	public Student() {
		super();
	}
	public Student(int id, String usn, String pwd, String tel) {
		super();
		this.id = id;
		this.usn = usn;
		this.pwd = pwd;
		this.tel = tel;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsn() {
		return usn;
	}
	public void setUsn(String usn) {
		this.usn = usn;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}


}
