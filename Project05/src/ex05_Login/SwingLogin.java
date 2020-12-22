package ex05_Login;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SwingLogin extends JFrame{

	public SwingLogin() {
		this.setTitle("첫 번째 프레임 - Login");
		
		initComponent();
		
		
		//pack();
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(500, 160);
		this.setVisible(true);
	}
	
	private void initComponent() {
		this.setLayout(new GridLayout(3, 2));
		
		//컴포넌드 생성, 추가
		
		//ID
		JLabel lblUserId = new JLabel("아이디");
		this.add( lblUserId );
		JTextField txtUserId = new JTextField(10);
		this.add(txtUserId);
		
		//PW
		JLabel lblPassword = new JLabel("비밀번호");
		this.add(lblPassword);
		JPasswordField txtPassword = new JPasswordField();
		this.add(txtPassword);
		
		JButton btnOk = new JButton("로그인");
		this.add(btnOk);
		
		JButton btnCancel = new JButton("취소");
		this.add(btnCancel);
		
//		String validUid = userId;
//		String validPwd = userPw;
		
		
		
		
		
		//이벤트 연결
		//ok버튼 눌렀을 때 
		btnOk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("로그인버튼을 클릭하였습니다.");
				
				//deprecated : 지금버전에서 사용금지.
				//obsolete : 다음버전부터 사용하지 않을 예정.
				
				String uid = txtUserId.getText().toLowerCase();
				@SuppressWarnings("deprecation")
				String pwd = txtPassword.getText();
				
				
				System.out.println("아이디 : " + uid);
				System.out.println("암호 : " + pwd);
				
				String loginResult="";
				try {
					loginResult = checkLogin(uid, pwd);
					System.out.println(loginResult);
				} catch (IOException e1) {
					e1.getMessage();
				}
				String msg ="";
				String title ="";
				if(loginResult.equals("로그인 되지 않음")) {
					msg = loginResult;
					title = "로그인실패";
					JOptionPane.showMessageDialog(null, 
							msg , title, JOptionPane.OK_OPTION
							);
				}else {
					JOptionPane.showMessageDialog(null, 
							loginResult + "님 환영합니다", "환영합니다", JOptionPane.OK_OPTION
							);
				}
				
				
			}
		});
		
		//cancel 버튼 눌렀을때
		btnCancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String title = "로그인 취소";
				String msg = "취소버튼을 클릭 하였습니다.";
				JOptionPane.showMessageDialog(null, 
						msg, title, JOptionPane.ERROR_MESSAGE
				);
			}
		});
		
	}
	
	
	protected String checkLogin(String uid, String pwd) throws IOException {
		String loginResult = "로그인 되지 않음";
		File fname = new File("src/ex05_Login/member.txt");
		FileReader fr = new FileReader(fname);
		BufferedReader br = new BufferedReader(fr);
		
		String line ="";
		while((line = br.readLine()) != null) {
			String[] li = line.trim().split(",");
			String userId = li[0].trim().toLowerCase();
			String userPw = li[1].trim();
			String userNm = li[2].trim();
			
			if(userId.equals(uid) && userPw.equals(pwd)) {
				System.out.println("로그인 성공");
				loginResult = userNm;
				break;
			}
		}
		
		br.close();
		fr.close();
		return loginResult;
	}

	public static void main(String[] args) throws IOException {
		new SwingLogin();
		
	}



	


}
