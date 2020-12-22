package ex03;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingEvent04 extends JFrame{
	
	JButton[] btns;
	JLabel lbl1;
	
	
	public SwingEvent04() {
		super("SwingEvent04");
		
		initComponent();
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(300,300);
		this.setVisible(true);
	}
	
	private void initComponent() {
		
		this.setLayout(new FlowLayout());
		btns = new JButton[3];
		
		for (int i = 0; i < btns.length; i++) {
			btns[i] = new JButton("버튼"+ (i+1));
			this.add(btns[i]);
		}
		
		lbl1 = new JLabel("여기에 출력");
		this.add(lbl1);
		
		for (int i = 0; i < btns.length; i++) {
			//익명클래스 방식은 java 1.7 이하 사용
			/*
			btns[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					JButton btn = (JButton) e.getSource(); //클릭한 버튼을 찾는다.
					String text = btn.getText();
					lbl1.setText(text);
					
				}
			});*/
			// 람다식 사용법 java 1.8 이상 사용가능
			btns[i].addActionListener(( e )->{
				System.out.println(e);
				JButton btn = (JButton) e.getSource();
				String text = btn.getText() + "클릭함";
				System.out.println(text);
				lbl1.setText(text);
			});
		}
		
	}

	public static void main(String[] args) {
		new SwingEvent04();
	}

}
