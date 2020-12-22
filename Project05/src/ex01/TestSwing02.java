package ex01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestSwing02 extends JFrame{
	
	JButton[] btns;
	JLabel lable1;
	
	public TestSwing02 () {
		//super("스윙 두 번째 예제");
		this.setTitle("스윙 두 번째 예제");
		
		initComponent();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setVisible(true);
	}
	
	private void initComponent() {
		String[] names = {"홍길동", "김길동", "이길동", "하길동", "B5"};
		
		//배치방식
		this.setLayout(new FlowLayout());
		
		//추가
		
		lable1 = new JLabel("친구이름");
		
		btns = new JButton[names.length];
		for (int i = 0; i < names.length; i++) {
			btns[i] = new JButton(names[i]);
		}
		
		//배치
		this.add(lable1);
		for (int i = 0; i < names.length; i++) {
			this.add(btns[i]);
		}
	}

	public static void main(String[] args) {
		new TestSwing02();
	}

}
