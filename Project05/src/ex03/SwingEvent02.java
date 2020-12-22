package ex03;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

// 스윙이벤트 처리방법 02
// 내부클래스 사용 : JFrame 의 다른요소(전역변수 btn1, lbl1 )를 접근하기가  쉽다.
// 안드로이드앱을 만들때 스윙의 기법을 똑같이 따라하는거라 스윙을....배우면 좋다.앱...음..

public class SwingEvent02 extends JFrame{
	
	JButton btn1, btn2, btn3;
	JLabel lbl1;
	
	public SwingEvent02() {
		super("SwingEvent02");
		
		initComponent();
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(300,300);
		this.setVisible(true);
	}
	
	private void initComponent() {
		this.setLayout(new FlowLayout());
		
		btn1   = new JButton("버튼1");
		btn2  = new JButton("버튼2");
		btn3  = new JButton("버튼3");
		lbl1    = new JLabel("이곳에 출력됩니다");
		
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.add( lbl1  );
		
		btn1.addActionListener(new EventB());
		btn2.addActionListener(new EventB());
		btn3.addActionListener(new EventB());
		
	}

	public static void main(String[] args) {
		new SwingEvent02();

	}
	
	//내부클래스를 사용 :innerClass
	class EventB implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("버튼이 클릭되었습니다.");
			JButton btn = (JButton) e.getSource();
			String text = btn.getText();
			String msg = text + "버튼이 클릭되었습니다.";
			
			System.out.println(msg);
			lbl1.setText(msg);
		}
		
	}

}
