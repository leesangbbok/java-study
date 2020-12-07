package ex06;

class Sachic{
	private double v1;
	private double v2;
	
	
	public Sachic () {}
	
	public Sachic(double v1, double v2) {
		this.v1 = v1;
		this.v2 = v2;
	}
	
	//Getter & Setter
	public double getV1() {
		return v1;
	}

	public void setV1(double v1) {
		this.v1 = v1;
	}

	public double getV2() {
		return v2;
	}

	public void setV2(double v2) {
		this.v2 = v2;
	}
	

	public double add(double v1, double v2) {
		return v1 + v2;
	}
	
	public double add() {
		return this.v1 + this.v2;
	}
}
class Person{}
public class ClassTest04 {

	public static void main(String[] args) {
		double v1 = 3.5, v2 = 2.7;
		double v;
		
		Sachic s1 = new Sachic();
		//s1.v1 = 27;
		//s1.v2 = 32;
		s1.setV1(27);
		s1.setV2(32);
		v = s1.add();
		System.out.println(v);
		
		Sachic s2 = new Sachic();
		

		
		
	}

}
