package ex02;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridBagTest extends JFrame{
	
	public GridBagTest() {
		super("GridBagTest");
		
		initComponent();
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(500,500);
		this.setVisible(true);
	}
	
	private void initComponent() {
		GridBagLayout gbl = new GridBagLayout();
		this.setLayout(gbl);
		
		JButton[] btns = new JButton[5];
		
		for (int i = 0; i < btns.length; i++) {
			btns[i] = new JButton("버튼" + i);
		}
		
		GridBagConstraints[] gbc = new GridBagConstraints[btns.length];
		
	}

	public static void main(String[] args) {
		new GridBagTest();
	}

}
