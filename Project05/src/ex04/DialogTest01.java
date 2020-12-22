package ex04;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class DialogTest01 extends JFrame{
	
	public DialogTest01() {
		JButton btn1 = new JButton("메세지");
		JButton btn2 = new JButton("확인");
		JButton btn3 = new JButton("입력");
		JPanel    p      = new  JPanel();
		
		//익명클래스
		ActionListener handler = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("메세지")){
					JOptionPane.showMessageDialog(null, "화면에 출력한메세지", "제목", JOptionPane.ERROR_MESSAGE);
				}else {
					if(e.getActionCommand().equals("확인")) {
						
						int result = JOptionPane.showConfirmDialog(null, 
								"프로그램을 종료하시겠습니까?", "종료확인", JOptionPane.OK_CANCEL_OPTION
						);
						if(result == 0) {  // OK =0 , Cancel = 2
							System.exit(-1);
						}
					}else {
						if(e.getActionCommand().equals("입력")) {
							JOptionPane.showInputDialog(null,
									"뭐가문제니?", "문제들", JOptionPane.OK_CANCEL_OPTION
								);
						}
					}
				}
			}
		};
		
		btn1.addActionListener(handler);
		btn2.addActionListener(handler);
		btn3.addActionListener(handler);
		
		p.add(btn1);
		p.add(btn2);
		p.add(btn3);
		
		pack();  //크기를 하위 컴포넌트의 크기대로 설정 , size를 설정하지 않아도 된다.
		
		this.add(p);
		this.setTitle("다이얼로그 테스트");
		this.setLocation(100, 100);
		this.setSize(400, 300);
		this.setVisible(true);
		
		
		
	}
	
	public static void main(String[] args) {
		new DialogTest01();
	}

}
