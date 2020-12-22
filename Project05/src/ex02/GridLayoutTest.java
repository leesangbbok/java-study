package ex02;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutTest extends JFrame{
	
	public GridLayoutTest() {
		super("GridLayoutTest");
		
		initComponent();
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(500, 500);
		this.setVisible(true);
	}
	
	private void initComponent() {
		
		GridLayout gl = new GridLayout(3,2); 
		this.setLayout(gl);
		
		JButton[] btns = new JButton[5];
		
		for (int i = 0; i < btns.length; i++) {
			btns[i] = new JButton("버튼");
			this.add(btns[i]);
		}
		
	}

	public static void main(String[] args) {
		new GridLayoutTest();
		
	}

}
