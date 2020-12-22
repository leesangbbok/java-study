package ex02;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CardLayoutTest extends JFrame{
	
	CardLayout card;
	Container c;
	
	public CardLayoutTest() {
		this.setTitle("CardLayoutTest");
		
		initComponent();
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(500, 500);
		this.setVisible(true);
		
	}
	
	
	private void initComponent() {
		c  =  this.getContentPane();  //현재 조작하는 컨테이너
		card = new CardLayout(40, 30); //x, y : margin
		c.setLayout(card);
		
		JButton btn1 =  new JButton("버튼1");
		JButton btn2 =  new JButton("버튼버튼2");
		JButton btn3 =  new JButton("버튼버튼버튼3");
		
		//이벤트 추가 : 버튼이 클릭되면 수행할 동작을 추가
		btn1.addActionListener(new ButtonListener());
		btn2.addActionListener(new ButtonListener());
		btn3.addActionListener(new ButtonListener());
		
		
		//배치
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
	}
	
	class ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			card.next(c);
		}
		
	}

	public static void main(String[] args) {
		new CardLayoutTest();
	}

}
