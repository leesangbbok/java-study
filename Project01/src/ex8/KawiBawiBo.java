package ex8;

import java.util.Random;
import java.util.Scanner;

public class KawiBawiBo {
	//0 : 가위 , 1 : 바위 , 2 : 보
	public static void main(String[] args) {
		int cpu = 0;
		int user;
		int coin;
		String result = "";
		String cpuChoce  = "";
		String userChoce = "";
		Scanner sc = new Scanner(System.in);
		
		//cpu 선택
		Random rnd = new Random();
		cpu = rnd.nextInt(3); // 0 ~ 2 
		
		
		System.out.println("============가위바위보 게임 시작============");
		
		System.out.println();
		System.out.println("당신은 무엇을 내시겠습니까? [0] 가위, [1] 바위, [2] 보");
		
		//user 선택
		String userStr = sc.nextLine();
		user = Integer.valueOf(userStr);
		sc.close();
		
		System.out.println();
		
		if(user == 0) userChoce = "가위";
		if(user == 1) userChoce = "바위";
		if(user == 2) userChoce = "보";
		System.out.println("user 의 선택은 : " + userChoce);
		
		if(cpu == 0) cpuChoce = "가위";
		if(cpu == 1) cpuChoce = "바위";
		if(cpu == 2) cpuChoce = "보";
		System.out.println("cpu 의 선택은   : " + cpuChoce);
		
		if(cpu == 0) {
			if(user == 0) {
				result = "비겼다";
			}else {
				if(user == 1) {
					result = "이겼다";
				}else {
					if(user == 2) {
						result = "졌다";
					}else if(user >= 3) {
						System.out.println("시스템 오류 입니다");
					}
				}
			}
		}else if(cpu == 1) {
			if(user == 0) {
				result = "졌다";
			}else {
				if(user == 1) {
					result = "비겼다";
				}else {
					if(user == 2) {
						result = "이겼다";
					}else if(user >= 3) {
						System.out.println("시스템 오류 입니다");
					}
				}
			}
		}else if(cpu == 2) {
			if(user == 0) {
				result = "이겼다";
			}else {
				if(user == 1) {
					result = "졌다";
				}else {
					if(user == 2) {
						result = "비겼다";
					}else if(user >= 3) {
						System.out.println("시스템 오류 입니다");
					}
				}
			}
		}
	
		System.out.println();
		System.out.println(result);
		
	}

}
