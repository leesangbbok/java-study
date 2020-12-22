package ex09;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {
	//서버
	public static void main(String[] args) {
		ServerSocket svSocket = null;
		
		try {
			svSocket = new ServerSocket();
			svSocket.bind(new InetSocketAddress("127.0.0.1", 5001)); 	//연결할려면 필요한 2가지 ip주소와 포트번호
			
			while(true) {
				System.out.println(" [연결 기다림] ");
				Socket socket = svSocket.accept();
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println(" [연결수락함] " + isa.getHostName());
				
				//data 수신
				InputStream is = socket.getInputStream();
				byte[]    bytes = new byte[100];
				
				int readByteCount = is.read(bytes); //실행된 후에  bytes 배열에 자동 저장
				
				String msg = new String(bytes, 0 , readByteCount, "UTF-8");
				System.out.println(msg);
				
				//date송신
				OutputStream os = socket.getOutputStream();
				msg = "헬로 English";
				bytes = msg.getBytes("UTF-8");
				os.write(bytes);
				os.flush();
				System.out.println("서버에서 데이터 보내기 성공");
				
				is.close();
				os.close();
				socket.close();
			}//while문 end 
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		if(!svSocket.isClosed()) {
			try {
				svSocket.close();
			} catch (IOException e1) {}
		}
		
	}

}
