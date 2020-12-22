package ex03;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


//window blider : 
class EventA implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton clickBtn = (JButton) e.getSource();
		
		System.out.println("버튼이 클릭되었습니다");
		SwingEvent01.lbl1.setText("버튼이 클릭되었습니다");
	}
	
}

public class SwingEvent01 extends JFrame{

	JButton btn1, btn2, btn3;
	static JLabel lbl1;
	
	public SwingEvent01() {
		super("SwingEvent01");
		
		initComponent();
		
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(300,300);
		this.setVisible(true);
	}
	private void initComponent() {
		this.setLayout( new FlowLayout() );
		btn1 = new JButton("버튼1");
		btn2 = new JButton("버튼2");
		btn3 = new JButton("버튼3");
		lbl1 = new JLabel("여기에 출력");
		
		btn1.addActionListener(new EventA());
		
		
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.add(lbl1);
	}
	public static void main(String[] args) {
		new SwingEvent01();
	}

}

