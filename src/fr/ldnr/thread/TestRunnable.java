package fr.ldnr.thread;

public class TestRunnable implements Runnable {

	@Override
	public void run() {
		for(int i = 0;i<10;i++) {
			System.out.println("!*!");
		}		
	}
	
	public static void main(String[] args) {
		Thread thread = new Thread(new TestRunnable());
		thread.start();
	}

}
