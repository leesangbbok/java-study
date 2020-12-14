package ex05;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

//class Person{
//	//입력용변수
//	private int inDeptId;
//	private String empName;
//	private int  sal;
//	
//	//출력용변수
//	private int outDeptId;
//	private String deptName;
//	private int sumSal;
//	private int minSal;
//	private int maxSal;
//	private String minSalName;
//	private String maxSalName;
//	
//	public int getOutDeptId() {
//		return outDeptId;
//	}
//	public void setOutDeptId(int outDeptId) {
//		this.outDeptId = outDeptId;
//	}
//	public int getInDeptId() {
//		return inDeptId;
//	}
//	public void setInDeptId(int inDeptId) {
//		this.inDeptId = inDeptId;
//	}
//	public String getEmpName() {
//		return empName;
//	}
//	public void setEmpName(String empName) {
//		this.empName = empName;
//	}
//	public int getSal() {
//		return sal;
//	}
//	public void setSal(int sal) {
//		this.sal = sal;
//	}
//	
//	public String getDeptName() {
//		return deptName;
//	}
//	public void setDeptName(String deptName) {
//		this.deptName = deptName;
//	}
//	public int getSumSal() {
//		return sumSal;
//	}
//	public void setSumSal(int sumSal) {
//		this.sumSal = sumSal;
//	}
//	public int getMinSal() {
//		return minSal;
//	}
//	public void setMinSal(int minSal) {
//		this.minSal = minSal;
//	}
//	public int getMaxSal() {
//		return maxSal;
//	}
//	public void setMaxSal(int maxSal) {
//		this.maxSal = maxSal;
//	}
//	public String getMinSalName() {
//		return minSalName;
//	}
//	public void setMinSalName(String minSalName) {
//		this.minSalName = minSalName;
//	}
//	public String getMaxSalName() {
//		return maxSalName;
//	}
//	public void setMaxSalName(String maxSalName) {
//		this.maxSalName = maxSalName;
//	}
//	
//	//생성자
//	public Person(int inDeptId, String empName, int sal) {
//		super();
//		this.inDeptId = inDeptId;
//		this.empName = empName;
//		this.sal = sal;
//	}
//	
//	
//	
//}

public class Munje02 {
	
	private static final int ROWS = 7;  //입력자료수 만큼
	private static final int DEPTROWS = 5; //부서수 만큼 : 출력줄
	//private static Person[] persons;
	
	private static String [] inDeptId;
	private static String [] empName;
	private static int    [] sal;

	private static String [] outDeptId;
	private static String [] deptName;
	private static int    [] sumSal;
	private static int    [] minSal;
	private static int    [] maxSal;
	private static String [] minSalName;
	private static String [] maxSalName;
	
	
	public static void main(String[] args) {
		input();
		process();
		output();
	}

	private static void input() {
		init_data();
		System.out.println("부서번호, 이름 , 월급 입력하세요");
		
		Scanner in = new Scanner(System.in);
		
		for (int i = 0; i < ROWS; i++) {
			String line = in.nextLine();
			String[] str = line.split(",");
			
			inDeptId[i] = str[0];
			empName[i] = str[1];
			sal[i] = Integer.parseInt(str[2]);
			
		}
	}

	private static void init_data() {
		inDeptId = new String[ROWS];
		empName  = new String[ROWS];
		sal      = new int[ROWS];
		
		
		//출력할 부서갯수만큼
		outDeptId  = new String[DEPTROWS];
		deptName   = new String[DEPTROWS];
		sumSal     = new int[DEPTROWS];
		minSal     = new int[DEPTROWS];
		maxSal     = new int[DEPTROWS];
		minSalName = new String[DEPTROWS];
		maxSalName = new String[DEPTROWS];
		
		for (int i = 0; i < DEPTROWS; i++) {
			sumSal[i]= 0;
			minSal[i] = 0;
			maxSal[i] = 0;
		}
	}

	private static void process() {
		
		String[] deptId = {"10", "20", "30", "40", "50"};
		String[] dName = {"인사", "자재", "총무", "연구개발", "서비스"};
		
		
		
		for (int i = 0; i < 5; i++) {
			outDeptId[i] = deptId[i];
			deptName[i] = dName[i];
		}
		
		for (int i = 0; i < ROWS; i++) {
			int idx = -1;
			switch(inDeptId[i]) {
			case "10" :
				idx =0;
			break;
			case "20" :
				idx =1;
			break;
			case "30" :
				idx =2;
			break;
			case "40" :
				idx =3;
			break;
			case "50" :
				idx =4;
			break;
			}
			
			//최저월급, 최고월급, 최저월급자, 최고월급자, 월급합
			//맨처음
			//최저월급
			//최고월급
			if (sumSal[idx] == 0) {
				minSal[idx]     = sal[i];
				maxSal[idx]     = sal[i];
				minSalName[idx] = empName[i];
				maxSalName[idx] = empName[i];
			}else {
				if(sal[i] < minSal[idx]) {
					//최저월급
					minSal[idx]     = sal[i];
					minSalName[idx] = empName[i];
				}else {
					if(sal[i] > maxSal[idx]) {
						//최고월급
						maxSal[idx]     = sal[i];
						maxSalName[idx] = empName[i];
					}
				}
			}
			
			sumSal[idx] += sal[i];
		}
		
	}

	private static void output() {
		System.out.println("부서번호  부서명 월급합 최저월급 최고월급 최저월급자 최고월급자");
		for (int i = 0; i < 5; i++) {
			String fmt = "%s %s %d %d %d %s %s";
			String msg = String.format(fmt,
				outDeptId[i], deptName[i],sumSal[i],minSal[i], maxSal[i], minSalName[i], maxSalName[i]
			);
			System.out.println(msg);
		}
		
		
	}

}
