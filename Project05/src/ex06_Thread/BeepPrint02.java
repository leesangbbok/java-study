package ex06_Thread;

import java.awt.Toolkit;

public class BeepPrint02 {

	public static void main(String[] args) {
		
		//첫 번째 방법
		//별도 클래스로 작업(Task) 분리
		//클래스에 저장된 소스를 별도의 thread 로 실행하라.
		
//		Runnable beepTask = new BeepTask();
//		Thread    thread     = new Thread(beepTask);
		
//		thread.start();
		
		//두 번째 방법 : 익명 클래스 
//		Thread thread = new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				Toolkit toolkit = Toolkit.getDefaultToolkit();
//				for (int i = 0; i < 5; i++) {
//					toolkit.beep();
//					try {
//						Thread.sleep(500);
//					} catch (InterruptedException e) {
//					}
//				}
//				
//			}
//		});
		
		//thread.start();
		
		// 3. 람다식
		Thread thread = new Thread(() -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for (int i = 0; i < 5; i++) {
				toolkit.beep();
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
				}
			}
			
		});
		thread.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}

}
