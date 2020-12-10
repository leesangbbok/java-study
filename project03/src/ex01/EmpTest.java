package ex01;

import java.util.Scanner;

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
	
	//fields
	//인원수
	static final int ROWS = 6;
	
	//입력용 변수
	static String [] empId ;
	static String [] empName;
	static String [] hiredate;
	static double[] sal ;
	static String [] deptId;
	
	
	
	// 출력용 변수
	static  double [] bonus ;
	static double [] pay ;
	static String [] deptName;
	
	//전체직원의 통계용 변수
	static double totPay ;
	static double totSal ;
	static double totBonus ;
	
	
	
	//MAIN 함수
	public static void main(String[] args) {
		input();
		process();
		output();
		
		//입사날짜로 정렬시키기
		//hiredateSort();
		
		//석차부여 모든데이터 비교한 후 석차 부여 
		//석차 : 월급순
		//empRank();
	}



	private static void input() {
		System.out.println("input()=========");
		init_data();
		
		//입력받기
		Scanner in = new Scanner(System.in);
		System.out.println("사번,  이름,  입사일,  월급,   부서번호 를 입력해주세요");
		for (int i = 0; i < ROWS; i++) {
			String line = in.nextLine();
			String [] str = line.split(",");
			empId[i] = str[0];
			empName[i] = str[1];
			hiredate[i] = str[2];
			sal[i] = Double.parseDouble(str[3]);
			deptId[i] = str[4];
			
			
		}
		
		
		in.close();
	}

	private static void init_data() {
		//입력용 변수
		empId = new String[ROWS]; 
		empName = new String[ROWS];
		hiredate = new String[ROWS];
		sal = new double[ROWS];
		deptId = new String[ROWS];
		
		//출력용 변수
		bonus = new double[ROWS];
		pay = new double[ROWS];
		deptName = new String [ROWS];
		
		//통계용 변수
		totPay = 0;
		totSal = 0;
		totBonus = 0;
		
	}

	private static void process() {
		System.out.println("process()=========");
		// 수령액 : 월급 + 보너스 O
		// 보너스 : 연차에 따라 월급의 0.5% 로 곱해서 계산한다. O
		// 부서번호 : 10 : 인사, 20: 자재, 30 : 총무, 40 : 연구개발, 50 : 서비스, 60 : 생산
		// 입사일순으로 직원정보를 출력
		// 출력 결과 : 사번, 이름 , 입사일, 월급, 보너스, 수령액, 부서명
		
		for (int i = 0; i < ROWS; i++) {
			int inYear =  Integer.parseInt(hiredate[i].substring(0,4)); 
			int years = 2020 - inYear;
			bonus[i] = years * sal[i] * 0.05;
			pay[i] = sal[i] + bonus[i];
			totPay += pay[i];
			totSal += sal[i];
			totBonus += bonus[i];
			
			switch(deptId[i]) {
				case  "10" :
					deptName[i] = "인사";
				break;
				case  "20" :
					deptName[i] = "자재";
				break;
				case  "30" :
					deptName[i] = "총무";
				break;
				case  "40" :
					deptName[i] = "연구개발";
				break;
				case  "50" :
					deptName[i] = "서비스";
				break;
			}
		}
		
	}

	private static void output() {
		System.out.println("output()=========");
		head();
		title();
		
		for (int i = 0; i < ROWS; i++) {
			String fmt = "%-3s %-10s %-8s %6.2f %6.2f %6.2f %-4s";
			String msg = String.format(fmt, 
					empId[i], 
					empName[i],
					hiredate[i],
					sal[i],
					bonus[i],
					pay[i],
					deptName[i]
					
					
			);
			System.out.println(msg);
			
		}
		System.out.println("총 수령 금액 : "+totPay);
		System.out.println("총 월급 금액 : "+totSal);
		System.out.println("총 보너스 금액 : "+totBonus);
	}
	
	public static void head() {
		System.out.println("===============");
		System.out.println("          월급목록         ");
		System.out.println("===============");
	}
	
	public static void title() {
		System.out.println(" 출력 결과 : 사번, 이름 , 입사일, 월급, 보너스, 수령액, 부서명 "); 
	}
}
