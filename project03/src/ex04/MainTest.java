package ex04;

import java.util.Scanner;

class Person{
	//입력변수
	private int num;
	private String name;
	private String email;
	private String hiredate;
	private int deptId;
	
	//출력변수
	private int hireYears;
	private String deptName;
	private String position;
	
	
	public Person(int num, String name, String email, String hiredate, int deptId) {
		this.num = num;
		this.name = name;
		this.email = email;
		this.hiredate = hiredate;
		this.deptId = deptId;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getHiredate() {
		return hiredate;
	}


	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}


	public int getDeptId() {
		return deptId;
	}


	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}


	public int getHireYears() {
		return hireYears;
	}


	public void setHireYears(int hireYears) {
		this.hireYears = hireYears;
	}


	public String getDeptName() {
		return deptName;
	}


	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}


	public String getPosition() {
		return position;
	}


	public void setPosition(String position) {
		this.position = position;
	}
	
	
	
}

public class MainTest {
	
	/*
	 * 001,이순신,sunsin@korea.com,19930501,30
	 * 002,이이,twotwo@korea.com,19830701,40
	 * 003,세종,sajong@korea.com,19800101,10
	 * 직원가입
	 * 입력 : 사번 이름 이메일  입사일 부서번호
	 *
	 * 출력 : 사번 이름 이메일 근속연수 부서명
	 * 
	 * 조건-
	 * 부서번호 : 10:인사  20:총무 30:자재 40:연구개발 50:생산
	 * 근속연수 : 현재년도 - 입사일년도
	 * 근속연수 ~ 5년 : 대리
	 * 근속연수 ~ 10년 : 과장
	 * 근속연수 ~ 15년 : 부장
	 * 근속연수 ~ 20년 : 이사
	 * 
	 * 
	 * 부서별인원수 구하기
	 * 인사 : 2명
	 * 총무 : 2명
	 * 자재 : 2명
	 * 연구개발 : 2명
	 * 생산 : 2명
	 *  
	 *  
	 * */
	static final int ROWS = 3;
	public static Person[] persons;
	
	private static int [] sum; 
	
	public static void main(String[] args) {
		input();
		process();
		output();
	}

	private static void input() {
		persons = new Person[ROWS];
		System.out.println("사번 이름 이메일  입사일 부서번호 입력하세요");
		Scanner in = new Scanner(System.in);
		
		//input validation : 잘못된 입력거르다
		//@(at) , . 마침표가 정확자리에 있는지
		//
		//입사일은 8자리 숫자만 가능
		
		for (int i = 0; i < persons.length; i++) {
			String line = in.nextLine();
			String[] str = line.split(",");
			
			int num = Integer.parseInt(str[0]);
			String name = str[1];
			String email = str[2];
			String hiredate = str[3];
			int deptId = Integer.parseInt(str[4]);
			
			
			persons[i] = new Person(num, name, email, hiredate, deptId);
		}
		
	}

	private static void process() {
		
		for (int i = 0; i < persons.length; i++) {
			switch(persons[i].getDeptId()) {
			case 10:
				persons[i].setDeptName("인사");
			break;
			case 20:
				persons[i].setDeptName("총무");
			break;
			case 30:
				persons[i].setDeptName("자재");
			break;
			case 40:
				persons[i].setDeptName("연구개발");
			break;
			case 50:
				persons[i].setDeptName("생산");
			break;
			}
			
			//근속연수 구하기
			String inYear = persons[i].getHiredate().substring(0,4); //받아온 입사일 값을 연도까지만 짜름
			int inYears = 2020 - Integer.parseInt(inYear);
			
			persons[i].setHireYears(inYears);
			if(inYears >= 20) {
				persons[i].setPosition("이사");
			}else {
				if(inYears >= 15) {
					persons[i].setPosition("부장");
				}else {
					if(inYears >= 10) {
						persons[i].setPosition("과장");
					}else {
						if(inYears >= 5) {
							persons[i].setPosition("대리");
						}else {
							persons[i].setPosition("사원");
						}
					}
				}
			}
			
		}
		
	}

	private static void output() {
		//출력 : 사번 이름 이메일 근속연수 부서명
		System.out.println("사번 이름 이메일 근속연수 부서명 직급");
		for (int i = 0; i < persons.length; i++) {
			String fmt = "%3d %-3s %-8s %4d %3s %3s";
			String msg = String.format(fmt, 
					persons[i].getNum(), persons[i].getName(),persons[i].getEmail(), persons[i].getHireYears(), persons[i].getDeptName(), persons[i].getPosition() 
			);
			System.out.println(msg);
		}
		
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int sum4 = 0;
		int sum5 = 0;
		
		System.out.println();
		for (int i = 0; i < persons.length; i++) {
			switch(persons[i].getDeptName()) {
			case "인사":
				sum1++;
			break;
			case "총무":
				sum2++;
				
			break;
			case "자재":
				sum3++;
				
			break;
			case "연구개발":
				sum4++;
				
			break;
			case "생산":
				sum5++;
				
			break;
			}
			
		}
		
		System.out.print("인사: " + sum1 + "명 ");
		System.out.print("총무: " + sum2 + "명 ");
		System.out.print("자재 : " + sum3 + "명 ");
		System.out.print("연구개발 : " + sum4 + "명 ");
		System.out.print("생산 : " + sum5 + "명");
		
	}

}
