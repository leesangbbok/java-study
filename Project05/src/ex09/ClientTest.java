package ex09;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientTest {

	public static void main(String[] args) {
		Socket socket = null;
		
		try {
			socket = new Socket();
			System.out.println(" [서버에 연결 요청!] ");
			socket.connect(new InetSocketAddress("localhost", 5001));
			System.out.println(" [서버에 연결 성공!] ");
			
			//data 전송
			//인터넷은 내부적으로 byte 송수신 한다 -> OutputStream
			byte[] bytes = null;
			
			OutputStream os = socket.getOutputStream();
			String msg = "Hello Server Hi";
			bytes = msg.getBytes("UTF-8");
			
			os.write(bytes);
			os.flush(); // 전송후 닫기
			System.out.println("데이터보내기 성공");
			
			InputStream is =socket.getInputStream();
			bytes = new byte[100];
			int readByteCount = is.read(bytes);
			
			msg = new String(bytes, 0, readByteCount, "UTF-8");
			System.out.println("서버에서 받은 메세지 : " + msg); 
			
			
			os.close();
			is.close();
			socket.close();
			
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		if(!socket.isClosed()) {
			try {
				socket.close();
			} catch (IOException e1) {
				System.out.println(e1.getMessage());
			}
		}
	}

}
