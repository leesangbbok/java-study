package ex03;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingEvent05 extends JFrame{
	
	JButton btn1, btn2, btn3;
	JLabel lbl1;
	
	public SwingEvent05() {
		super("SwingEvent05");
		
		initComponent();
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(300,300);
		this.setVisible(true);
	}
	private void initComponent() {
		this.setLayout(new FlowLayout());
		
		btn1 = new JButton("단추1");
		btn2 = new JButton("단추2");
		btn3 = new JButton("단추3");
		lbl1    = new JLabel("이곳에 출력");
		
		lbl1.setLocation(30, 30);
		
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.add(lbl1);
		
		Container c = getContentPane();
		c.addMouseListener(new MyMouseAdapter());
		
		
		
	}
	public static void main(String[] args) {
		new SwingEvent05();
	}
	
	class MyMouseAdapter extends MouseAdapter{

		@Override
		public void mousePressed(MouseEvent e) {
			super.mousePressed(e);
			
			int x = e.getX();
			int y = e.getY();
			
			System.out.println("글릭 위치는 x = " + x + ", y = " + y);
			lbl1.setLocation(x, y);
			
		}
		
	}

}
