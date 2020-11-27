package ex01;

class Sungjuk{
	
	public int getTot(int kor, int eng, int mat){
		int tot;
		tot = kor + eng + mat;
		
		return tot;
	}
	
	//method overoding
	public double getAvg(int kor, int eng, int mat) {
		double avg;
		avg = (kor + eng  + mat) / 3.0;
		Math.round(avg);
		return avg;
	}
	
	public double getAvg(int tot) {
		double avg;
		avg = tot / 3.0;
		return Math.round(avg);                                     
	}
	
	
}


public class SungjukTest01 {

	public static void main(String[] args) {
		Sungjuk sj = new Sungjuk();
		
		//person01
		String name01 = "리사";
		int kor01 = 98;
		int eng01 = 67;
		int mat01 = 88;
		
		int total01;
		double avg01;
		
		total01 = sj.getTot(98, 99, 99);
		avg01 = sj.getAvg(total01);
		
		System.out.println(total01);
		System.out.println(avg01);
		
		System.out.println();
		
		//person02
		String name02 = "제니";
		int kor02 = 98;
		int eng02 = 67;
		int mat02 = 88;
		
		int total02;
		double avg02;
		
		total02 = sj.getTot(98, 99, 99);
		avg02 = sj.getAvg(total02);
		
		System.out.println(total02);
		System.out.println(avg02);
		
		System.out.println();
		
		//person03
		String name03 = "지수";
		int kor03 = 98;
		int eng03 = 67;
		int mat03 = 88;
		
		int total03;
		double avg03;
		
		total03 = sj.getTot(98, 99, 99);
		avg03 = sj.getAvg(total03);
		
		System.out.println(total03);
		System.out.println(avg03);
		
	}

}
