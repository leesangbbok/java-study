package ex05_Login;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SwingCalc extends JFrame{
	
	JTextField txt1, txt2;
	JButton     btnAdd, btnSub, btnMul, btnDiv;
	JLabel        lbl;
	
	public SwingCalc() {
		super("계산기");
		
		initComponent();
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(400, 500);
		this.setVisible(true);
	}
	
	private void initComponent() {
		//화면레이아웃 설정
		getContentPane().setLayout(new FlowLayout());
		
		txt1 = new JTextField("0", 30);
		txt1.setToolTipText("첫 번째값 입력");
		txt1.setHorizontalAlignment(SwingConstants.LEADING);
		
		txt2 =new JTextField("0", 30);
		txt2.setToolTipText("두 번째값 입력");
		txt2.setHorizontalAlignment(SwingConstants.LEADING);
		
		btnAdd= new JButton(" ADD ");
		btnAdd.setToolTipText("더하기");
		btnAdd.setForeground(Color.BLACK);
		btnAdd.setBackground(Color.WHITE);
		
		btnSub= new JButton(" SUB ");
		btnSub.setForeground(Color.WHITE);
		btnSub.setBackground(Color.BLACK);
		
		btnMul= new JButton(" MUL ");
		btnMul.setForeground(Color.BLACK);
		btnMul.setBackground(Color.WHITE);
		
		btnDiv= new JButton(" DIV ");
		btnDiv.setForeground(Color.WHITE);
		btnDiv.setBackground(Color.BLACK);
		
		lbl = new JLabel("결과");
		
		getContentPane().add(txt1);
		getContentPane().add(txt2);
		
		getContentPane().add(btnAdd);
		getContentPane().add(btnSub);
		getContentPane().add(btnMul);
		getContentPane().add(btnDiv);
		
		getContentPane().add(lbl);
		
		//이벤트 연결
		btnAdd.addActionListener( new MyButtonClick());
		btnSub.addActionListener( new MyButtonClick());
		btnMul.addActionListener( new MyButtonClick());
		btnDiv.addActionListener( new MyButtonClick());
		
		
	}
	
	//내부 클래스 : inner class
	class MyButtonClick implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton) e.getSource(); //눌러진 버튼 정보
			int v = 0;
			
			try {
				int v1 = Integer.parseInt(txt1.getText());
				int v2 = Integer.parseInt(txt2.getText());
				
				switch(btn.getText()) {
				case "ADD" :  v = v1 + v2; break;
				case "SUB" :  v = v1 - v2; break;
				case "MUL" : v = v1 * v2; break;
				case "DIV" :   v = v1 / v2; break;
				}
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				e1.getMessage();
			}
			lbl.setText(String.valueOf(v));
		}
		
	}
	
	public static void main(String[] args) {
		new SwingCalc();
	}

}
