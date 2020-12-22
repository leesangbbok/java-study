package ex03;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingEvent03 extends JFrame implements ActionListener{
	
	JButton btn1, btn2, btn3;
	JLabel lbl1;
	
	public SwingEvent03() {
		this.setTitle("SwingEvent03");
		
		initComponent();
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(300,300);
		this.setVisible(true);
	}
	
	private void initComponent() {
		this.setLayout(new FlowLayout());
		
		btn1 = new JButton("버튼1");
		btn2 = new JButton("버튼2");
		btn3 = new JButton("버튼3");
		lbl1 =   new JLabel("이곳에 출력됩니다.");
		
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.add(lbl1);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
	}
	
	//main method
	public static void main(String[] args) {
		new SwingEvent03();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();
		String msg = btn.getText() + "버튼을 클릭했습니다.";
		System.out.println(msg);
		lbl1.setText(msg);
	}

}
