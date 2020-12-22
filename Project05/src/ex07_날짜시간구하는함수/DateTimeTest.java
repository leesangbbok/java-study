package ex07_날짜시간구하는함수;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.TimeZone;

public class DateTimeTest {
	
	// 자바의 날짜 시간을 조작
	public static void main(String[] args) throws ParseException {
		// 자바 버전 별로 함수가 다르다.
		// 1. new Date
		//import java .util.Date : 생성자가 있다 new Date() 가능
		//import java .sql.Date : 생성자가 없다 new Date() 불가능
		Date today = new Date();
		
		System.out.println(today);
		System.out.println(today.toString());
		System.out.println(today.toLocaleString());
		System.out.println(today.toGMTString());
		//GMT :: 그린위치 천문대 기준시
		//UTC  :: Universal Time 기준시
		
		
		System.out.println();
		
		//simpleDateFormat : java1.6 버전
		Date                       today2   = new Date();
		SimpleDateFormat dateFmt = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat timeFmt = new SimpleDateFormat("hh:mm:ss a");
		
		System.out.println("날짜 : " + dateFmt.format(today2));
		System.out.println("시간 : " + timeFmt.format(today2));
		
		System.out.println();
		
		// 3. 
		Date xmas = new Date(120, 11, 25);  //2020-12-25
		System.out.println(xmas.toLocaleString());
		
		long time = System.currentTimeMillis();
		System.out.println("time : " + time); // 1970.1.1 이후시간을 ms 로 환산
		
		System.out.println();
		
		SimpleDateFormat dayTime = new SimpleDateFormat("yyy-MM-dd hh:mm:ss E a");
		String str = dayTime.format(new Date(time));
		System.out.println(str);
		
		//경과시간
		long start = System.currentTimeMillis();
		double d = 1.0;
		for (int i = 0; i < 100000; i++) {
			d = d * 0.1;
		}
		long end = System.currentTimeMillis();
		System.out.println((end -start) + "밀리초 걸림");
		System.out.println("==========================");
		double lf = 0.0f;
		for (int i = 1; i <= 10000; i++) {
			lf = lf + 0.1f;
		}
		System.out.println(lf);
		System.out.println("==========================");
		
		// 클래스.getIntstance(); //싱글톤 패턴 : 한개만 new 될 수 있는 객체를 만들어 사용
		// 4.
		Calendar cal = Calendar.getInstance();
		System.out.println("연도 : " + cal.get(Calendar.YEAR));
		System.out.println("월 : " + (cal.get(Calendar.MONTH) +1) );
		System.out.println("일 : " + cal.get(Calendar.DATE));
		System.out.println("시 : " + cal.get(Calendar.HOUR_OF_DAY));
		System.out.println("분 : " + cal.get(Calendar.MINUTE));
		System.out.println("초 : " + cal.get(Calendar.SECOND));
		System.out.println("요일 : " + cal.get(Calendar.DAY_OF_WEEK));
		
		System.out.println();
		
		// 5. 날짜
		GregorianCalendar today3 = new GregorianCalendar();
		int year    = today3.get(today3.YEAR);
		int month = (today3.get(today3.MONTH) +1 );
		int date     = today3.get(today3.DATE);
		
		System.out.println(year + "년");
		System.out.println(month + "월");
		System.out.println(date + "일");
		
		System.out.println();
		
		//날짜 + n(int) => 날짜
		//날짜 - 날짜 -> 두 날짜 사이의 기간 : 날 수로 표현
		// 날짜 + 날짜 -> X 쓸모없는 계산
		
		// 현재 날짜에서 두달전 날짜 구하기
		Calendar cal4 = Calendar.getInstance();
		cal4.add(cal4.MONTH, -2);
		System.out.println(cal4.get(cal4.YEAR));
		System.out.println(cal4.get(cal4.MONTH)+1);
		System.out.println(cal4.get(cal4.DATE));
		
		//특정일 부터 n일 만큼 더한 날짜 구하기
		
		//내일 날짜 : today.getTime(); :: 현재  시간을 long형 문자로 돌려준다.
		Date today4 = new Date();
		Date tomorrow = new Date(today4.getTime() + (long)(1000 * 60 * 60 * 24));
		System.out.println(tomorrow);
		
		//두 날짜 사이의 차이를 일 수로 구하라
		Scanner in = new Scanner(System.in);
		String sdd = in.nextLine();
		String edd = in.nextLine();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date firstDate = format.parse(sdd);
		Date lastDate = format.parse(edd);
		long calDate = lastDate.getTime() -  firstDate.getTime();
		long calDateDays = calDate / (24 *60*60*1000);
		System.out.println(calDateDays);
		//해당월이 마지막 날짜를 구하기
		
		//해당월의 첫 날짜의 요일을 구하기
		
	}



}
