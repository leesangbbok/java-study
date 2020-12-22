package ex05_Login;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTableTest extends JFrame{
	String[] colunmNames;
	
	public JTableTest() {
		super ("");
		
		initComponent();
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(500,500);
		this.setVisible(true);
	}
	
	private void initComponent() {
		
		//제목줄에 글자
//		String[] colunmNames = {
//				"상품번호", "상품이름", "상품가격", "상품설명"
//		};
		
		//데이터줄
		Object[][] rowData = getDate();
		
		DefaultTableModel tm             = new DefaultTableModel(rowData, colunmNames);
		JTable                     jt              = new JTable(tm);
		JScrollPane            scrollPane = new JScrollPane(jt);
		this.add(scrollPane);
		
		//데이터추가
		Object[] insertRow= {5, "짱구", 2000, "해태"};
		tm.addRow(insertRow);
		this.add(scrollPane);
		
		
		// data 조작
		// 1. 행과열 수
		System.out.println("줄수 : " + jt.getRowCount());
		System.out.println("칸수 : " + jt.getColumnCount());
		
		// 2. 칼럼이름가져오기
		System.out.println("3 번째 칸의 제목 : "+ tm.getColumnName(2));
		System.out.println("3 번째 칸의 제목 : "+ jt.getColumnName(2));
		
		// 3. 데이터 줄 삭제
		tm.removeRow(0);  // 데이터 0번째 줄이 삭제!
		
		// 4. DATA 가져오기
		System.out.println("( 2,2 ) 위치의 데이터 : " + tm.getValueAt(2, 2));
		
		// 5. DATA 수정하기
		tm.setValueAt(10000, 2, 2);
		
		// 6. 선택한 row selection 하기
		jt.setRowSelectionInterval(0, 1);
	}

	private Object[][] getDate() {
//		Object [][] rowData = {
//				{1, "새우깡", 1000,"농심"},
//				{2, "초코파이", 3000, "오리온"},
//				{3, "오예스수박맛", 6000, "해태"}
//		};
		
		ArrayList dataList = new ArrayList();
		
		File                     file = new File("src\\ex05_Login\\jtableData.txt");
		FileReader          fr   = null;
		BufferedReader br   = null;
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			String line = "";
			
			//첫줄은 제목줄로 처리
			line                 = br.readLine(); 
			colunmNames = line.trim().split(",");
			
			//두번째은 데이터줄로 처리
			while((line = br.readLine()) != null) {
				String[] li = line.trim().split(",");
				
				ArrayList data = new ArrayList();  //1차원 배열
				data.add(Integer.parseInt(li[0]));
				data.add(li[1].trim());
				data.add(Integer.parseInt(li[2]));
				data.add(li[3].trim());
				
				dataList.add(data);
				
				
				
			}
			
		} catch (IOException e) {
				e.getMessage();
		}finally {
			try {
				if(br != null)br.close();
				if(fr != null)fr.close();
			} catch (IOException e) {
				
			}
		}
		
		int rows = dataList.size();
		int cols = 4;
		Object [][] rowData = new Object[rows][4];
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				ArrayList data = (ArrayList) dataList.get(i);
				rowData[i][j] = data.get(j);
			}
		}
		return rowData;
	}

	public static void main(String[] args) {
		new JTableTest();
	}

}
