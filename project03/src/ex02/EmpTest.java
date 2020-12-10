package ex02;

import java.io.ObjectInputStream.GetField;
import java.lang.invoke.SwitchPoint;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Emp {
	//멤버변수
	private String empId; 
	private String empName;
	private String hiredate;
	private double sal;
	private String deptId;
	
	private double bonus;
	private double pay;
	private String deptName;
	
	
	
	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	//Constructor
	public Emp() {}

	public Emp(String empId, String empName, String hiredate, double sal, String deptId) {
		this.empId = empId;
		this.empName = empName;
		this.hiredate = hiredate;
		this.sal = sal;
		this.deptId = deptId;
	}

	
	//method
	public String display() {
		// 결과값을 여기에서 출력
		String fmt = "%3s %-5s %8s %6.2f %6.2f %6.2f %4s";
		String msg = String.format(fmt, 
				empId, empName, hiredate, sal, bonus, pay, deptName
		 );
		
		return msg;
	}

	public void calc() {
		//보너스 금액 과 실수령액 구하기
		int inYear =  Integer.parseInt(this.hiredate.substring(0,4)); 
		int years = 2020 - inYear;
		this.bonus = years * this.sal * 0.05;
		this.pay = this.sal + this.bonus;
		
		//부서명 지정하기
		switch (this.deptId) {
			case "10" :
				this.deptName ="인사";
			break;
			case "20" :
				this.deptName ="자재";
			break;
			case "30" :
				this.deptName ="총무";
			break;
			case "40" :
				this.deptName ="연구개발";
			break;
			case "50" :
				this.deptName ="서비스";
			break;
		}
		
		
		
	}


}

public class EmpTest {
	// 입력 1줄 -> 출력 1줄
	// 입력 data : 사번, 이름, 입사일, 월급, 부서번호
	// 수령액 : 월급 + 보너스;
	// 보너스 : 연차에 따라 월급의 0.5% 로 곱해서 계산한다.
	// 부서번호 : 10 : 인사, 20: 자재, 30 : 총무, 40 : 연구개발, 50 : 서비스, 60 : 생산
	// 입사일순으로 직원정보를 출력
	// 출력 결과 : 사번, 이름 , 입사일, 월급, 보너스, 수령액, 부서명
	
	// 입력 data
	// 사번,          이름,          입사일,        월급,         부서번호
	// empId, empName, hiredate,      sal,          deptid
	// 100,A,20010101,300.0,10
	// 200,B,20070201,270.0,10
	// 300,C,20070101,250.0,20
	// 400,D,20190301,220.0,30
	// 500,E,20120101,200.0,40
	// 600,F,20170101,170.0,10
	
	// 사번,           이름 ,                 입사일,          월급,          보너스,          수령액,            부서명
	//empId,     empName        hiredate,        sal          bonus             pay          deptName
	
	static final int ROWS = 6;
	static Emp [] emps;	
	
	
	public static void main(String[] args) {
		input();
		process();
		output();
		
	}
	
	private static void input() {
		emps = new Emp[ROWS];		// class 인스턴스 6개를 담을 수 있는 배열 생성
		System.out.println("사번, 이름, 입사일, 월급, 부서번호 입력 바랍니다.");
		Scanner in = new Scanner(System.in);
		
		for (int i = 0; i < ROWS; i++) {
			String line = in.nextLine();
			String [] str = line.split(",");
			
			/*
			 * 클래스배열에 new 를 6번 한다.
			 * 600,F,20170101,170.0,10
			 * */
			emps[i] = new Emp(str[0], str[1], str[2], Double.parseDouble(str[3]), str[4]);
			
			
		}
		
	}

	private static void process() {
		for (int i = 0; i < ROWS; i++) {
			emps[i].calc();
		}
		
		//Arrays.sort함수 로 정렬하기
		Arrays.sort(emps, new Comparator<Emp>() {
			@Override
			public int compare(Emp o1, Emp o2) {
				return o1.getHiredate().compareTo(o2.getHiredate());
			}
		});
		
		//2중 for문으로 정렬하기
		//empSort();
		
	}

	private static void empSort() {
		for (int i = 0; i < ROWS - 1; i++) {
			for (int j = 0; j < ROWS - 1 - i; j++) {
				if(emps[j].getHiredate().compareTo(emps[j+1].getHiredate()) > 0) {
					Emp tHiredate;
					tHiredate = emps[j];
					emps[j] = emps[j+1];
					emps[j+1] = tHiredate;
				}
			}
		}
		
	}

	private static void output() {
		head();
		title();
		
		for (int i = 0; i < emps.length; i++) {
			System.out.println(emps[i].display() );
		}
	
	}

	private static void title() {
		System.out.println("========================");
		System.out.println("              직원 월급 목록               ");
		System.out.println("========================");
	}

	private static void head() {
		System.out.println("사번, 이름 , 입사일, 월급, 보너스, 수령액, 부서명");
		
		
	}

}
