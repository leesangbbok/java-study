package ex02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
/*
 * Swing 에서 버튼을 누를때 마다 콘솔창에 출력하기
 * 
 * */
public class FlowLayoutTest extends JFrame{
	
	public FlowLayoutTest() {
		super("FlowLayoutTest");
		
		initComponent();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setVisible(true);
		
		
		
	}
	
	private void initComponent() {
		this.getContentPane().setLayout(new FlowLayout());
		
		/*List<JButton> btnList = new ArrayList<>();
		
		for (int i = 0; i < 30; i++) {
			btnList.add(new JButton("버튼" + (i + 1)));
			this.add(btnList.get(i));
			
			
			 final int index = i;
			// 익명함수에서는 바깥의변수를 직정사용할 수 없다.
			// final 이 붙어야 사용가능하다.
			// final - 한번만 값을 넣을 수 있는 상수
			btnList.get(i).addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String caption = btnList.get(index).getText();
					System.out.println(caption);
				}
			});
			*/
		
		
			// 위 코드와 다른 방법으로 구현함
			JButton[] btns = new JButton[30]; //버튼 갯수 초기화
			
			for (int i = 0; i < btns.length; i++) {
				btns[i] = new JButton("Button" + (i+1));
				this.add(btns[i]);
				
				btns[i].addActionListener((e)->{
					//e.getSource() : e를 발생시킨 소스 - component
					// -> 눌러진 버튼
					JButton btn = (JButton) e.getSource();
					String msg = btn.getText();
					System.out.println(msg);
				});
			}
		}
		
		//배치
		
		
	

	public static void main(String[] args) {
		new FlowLayoutTest();
	}

}
