package collection05;

import java.util.HashMap;
import java.util.Map;

class Student{
	int num;
	String name;
	
	
	public Student(int num, String name) {
		this.num = num;
		this.name = name;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + num;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (num != other.num)
			return false;
		return true;
	}
	
	
	 
}

public class TestHashMap02 {

	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<>();
		
		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(2, "홍길동"), 90);
		map.put(new Student(1, "홍길동"), 95); //같은사람
		
		System.out.println(map.size());
		
		
	}

}
