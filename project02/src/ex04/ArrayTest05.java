package ex04;

public class ArrayTest05 {

	public static void getDisp(String[][][] idols) {
		for (int i = 0; i < idols.length; i++) {
			for (int j = 0; j < idols[i].length; j++) {
				for (int j2 = 0; j2 < idols[i][j].length; j2++) {
					System.out.print(idols[i][j][j2] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		//3 차원 배열
		//idols [i][j][k]
		// i : 0 (남자그룹), 1 (여자그룹)
		// j  : row -> 그룹이름
		// k : column-> 사람이름
		String [][][] idols = new String[][][] {
			{
				{"정혁", "동주", "비니", "원"},
				{"정력", "남주", "씨니", "투"},
				{"정구", "북주", "디니", "쓰리"}
			}, //0 : 남자 그룹
			{
				{"윤아", "수영","티파니", "효연"},
				{"박초롱", "윤보미", "정은지", "손나은"},
				{"사나", "모모", "정연", "지효"}
			} // 1 : 여자 그룹
		};
		
		//System.out.println(idols[1][2][0]);
		
		getDisp(idols);
	}

}
