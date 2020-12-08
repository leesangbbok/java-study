package ex11;

public class Student {
	//Fields 
	private String name;
	private String tel;
	private int inYear;
	
	
	//Constructor
	public Student(String name, String tel, int inYear) {
		this.name = name;
		this.tel = tel;
		this.inYear = inYear;
	}

	//Getter & Setter
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public int getInYear() {
		return inYear;
	}


	public void setInYear(int inYear) {
		this.inYear = inYear;
	}
	//Method

	
	//Override
	@Override
	public String toString() {
		return "Student [name=" + name + ", tel=" + tel + ", inYear=" + inYear + "]";
	}
	
	
}

