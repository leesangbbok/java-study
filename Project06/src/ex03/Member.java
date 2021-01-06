package ex03;

import java.sql.Date;

import oracle.sql.DATE;

public class Member {
	private int 		 memid;
	private String mname;
	private String email;
	private String tel;
	private String birth;
	private int 		mpoint;
	private String  regdate;
	
	//Constructor
	
	public Member(int memid, String mname, String email, String tel, String birth, int mpoint, String regdate) {
		this.memid = memid;
		this.mname = mname;
		this.email = email;
		this.tel = tel;
		this.birth = birth;
		this.mpoint = mpoint;
		this.regdate = regdate;
	}
	
	//Default 
	public Member() {}

	//get&set
	public int getMemid() {
		return memid;
	}
	public void setMemid(int memid) {
		this.memid = memid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public int getMpoint() {
		return mpoint;
	}
	public void setMpoint(int mpoint) {
		this.mpoint = mpoint;
	}
	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "Member [memid=" + memid + ", mname=" + mname + ", email=" + email + ", tel=" + tel + ", birth=" + birth
				+ ", mpoint=" + mpoint + ", regdate=" + regdate + "]";
	}
	
	
	
}
