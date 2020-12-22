package ex09;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {

	public static void main(String[] args) {
		
		InetAddress local = null;
		try {
			local = InetAddress.getLocalHost();
			System.out.println("내 컴퓨터의 ip 주소 : "+ local.getHostAddress());
			
			
			
			InetAddress[] iaAddr = InetAddress.getAllByName("www.naver.com"); //연결할 사이트 주소를 적는다.
			for (InetAddress remote : iaAddr) { //iaAddr담긴 값에 remote 에 다시 넣고
				System.out.println("네이버 IP주소: " + remote.getHostAddress());  //remote에 담긴 ip주소들을 출력
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
