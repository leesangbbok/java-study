package ex06_간단한자료구조수업;

import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		
		scores.add(new Integer(87));
		scores.add(new Integer(47));
		scores.add(new Integer(57));
		scores.add(new Integer(77));
		scores.add(new Integer(17));
		
		Integer score = null;
		
		score = scores.first();
		System.out.println("가장 낮은 점수 : " + score);
		
		score = scores.last();
		System.out.println("가장 높은 점수 : " + score);
		
		score = scores.lower(new Integer(95));
		System.out.println("95점 보다 낮은 점수 : " + score);
		
		score = scores.higher(new Integer(17));
		System.out.println("17점 보다 높은 점수 : " + score);
		
		score = scores.floor(new Integer(95));
		System.out.println("95 점 이거나 바로 아래 점수 : " + score);
		 
		score = scores.ceiling(new Integer(95));
		System.out.println("95 점이거나 바로 위  점수 : " + score);
		
		while (!scores.isEmpty()) {
			score =scores.pollFirst(); //작은것부터 출력 반대로 pollLast() 로 하면 큰것부터 출력
			System.out.println(score + "남은 자료수 : " + scores.size());
		}
	}

}
