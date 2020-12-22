package ex06_Thread;

import java.awt.Toolkit;



public class BeepPrint01 {
	
	//멀티스레드는 아님
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
		}
	}

}
