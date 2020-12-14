package collection03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Member{
	private String name;
	private int    age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Member : name=" + name + ", age=" + age ;
	}
	
	
	
	//중요 :: hashSet 의 두 객체 를 비교할떄 필요한 함수
	//HashSet 중보판단 : HashCode() equals() 결과를 동시에 비교
	//비교 할것들만 적어서 비교 하면 됌
	//아이디 중복확인 할 때? 쓰면 될것같다.
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
	
	//객체의 instansce 비교 : 이름 , 나이
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member mem = (Member)obj;
			return (mem.name.equals(this.name))
					&& (mem.age == this.age);
		}
		
		return false;
	}
	
	
	
}

public class TestHashSetObject {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();
		
		set.add(new Member("홍길동", 27));
		set.add(new Member("홍길동", 27));
		set.add(new Member("홍길순", 27));
		
		System.out.println("자료수: " + set.size());
		
		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			Member member = (Member) iterator.next();
			System.out.println(member);
			
		}
		
		// 특별한 코딩이 추가되어 hashSet 의 중복기능이 활성화 된다.
		// Member class 안에 hashCode(), equals() 재정의하여
		// 두 객체가 같은 상황을 만들어야 한다.
		// equals 안에 이름과 나이를 동시에 비교하도록 재정의
		
	}

}
