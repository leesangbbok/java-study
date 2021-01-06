package ex03;

import java.util.ArrayList;

//MVC : MODEL, VIEW CONTROLLER 
//프로그램을 MODEL, VIEW , CONTROLLER 나눠서 
//구현하는 CLASS 구현법
public class TestMain {

	public static void main(String[] args) {
		DBHandler db = new DBHandler();
		
		int mid = 1;
		Member m1 = db.getMember(mid);
		
		
		if(m1 == null) {
			System.out.println("조회한 자료가 없습니다.");
		}else {
			//System.out.println(m1.toString());
		}
		
		System.out.println("데이터 추가");
		db.addMember( "강감감", "gamgam@meme.com", "087", "2000-08-19");
		Member m2 = db.getMember(10);
		System.out.println(m2);
		
		//내일
		System.out.println("전체목록");
		ArrayList<Member>  mList = db.getMemberList();
		for (int i = 0; i < mList.size(); i++) {
			System.out.println(mList.get(i));
		}
		
		
		db.close();
	}

}
