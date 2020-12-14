package collection04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashMap {
	
	// HashMap<Key, Value>
	//HashMap<String, Object>
	//Key   : "번호", "이름"    "전화번호" - key는 중복 불가능
	//Value :   1    "김유신"   "010-1234-5678"  - value는 중복쌉간응
	//value = map.get("번호");
	//map.put("번호", 2);   * map.set() X , map.push();
	//map.get()
	//map.remove("번호");
	//map.size();
	//map.clear();
	
	
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("쯔위", 100);
		map.put("사나", 90);
		map.put("정연", 70);
		map.put("지효", 80);
		
		System.out.println("자료수: " + map.size());
		System.out.println(map.get("사나"));
		
		map.put("지효", 90);
		System.out.println("자료수: " + map.size());
		System.out.println(map.get("지효"));
		
		//출력 방법1
		//1. 객체를 하나씩 처리 : keySet
		System.out.println("=====================");
		Set<String> keySey = map.keySet();
		for (Iterator iterator = keySey.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			Integer value = map.get(string);
			System.out.print(string + ":" + value+ " ");
			
		}
		System.out.println();
		map.remove("쯔위");
		System.out.println(map.size());
		
		
		//출력방법2
		//2. 객체를 하나씩 처리 : MapEntry
		System.out.println("======================");
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIter = entrySet.iterator();
		
		while(entryIter.hasNext()) {
			Map.Entry<String, Integer> entry = entryIter.next();
			String                       key = entry.getKey();
			Integer                    value = entry.getValue();
			System.out.println(key + ":" + value);
		}
		
		map.clear();
		if(map.isEmpty()) {
			System.out.println("자료없음");
		}
	}

}
