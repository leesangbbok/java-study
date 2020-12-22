package ex01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestSwing01 extends JFrame{
	
	//Frame   : AWT    - OS 부품을 호출
	//JFrame : Swing  - window, Linux 공통으로 사용하기 위한 라이브러리
	
	//필요한 부품사용
	JButton btn1, btn2, btn3, btn4, btn5; //버튼
	
	public TestSwing01() {
		super("스윙 테스트"); //부모클래스의 생성자를 호출 - Title 제목이 들어감
		
		//Component 배치 방식
		this.setLayout(new FlowLayout());
		//Component 배치
		btn1 = new JButton("버튼1");
		btn2 = new JButton("버튼2");
		btn3 = new JButton("버튼3");
		btn4 = new JButton("버튼4");
		btn5 = new JButton("버튼5");
		
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.add(btn4);
		this.add(btn5);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 400);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new TestSwing01(); //생성자 호출
		
	}
	
}
