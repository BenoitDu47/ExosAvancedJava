package fr.ldnr.thread;

import java.util.Arrays;
import java.util.List;

public class TestRunnable implements Runnable {

	private String[] tabThread;

	public TestRunnable(String[] tabThread) {
		this.tabThread = tabThread;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(this.toString());
		}

	}

	public static void main(String[] args) {
//		Thread t = new Thread(new TestRunnable("!*!"));
//		Thread t2 = new Thread(new TestRunnable("****"));
//		Thread t3 = new Thread(new TestRunnable("#***#"));
//		Thread t4 = new Thread(new TestRunnable("$****$"));
//		Thread t5 = new Thread(new TestRunnable("&*****&"));
//		Thread t6 = new Thread(new TestRunnable("'******'"));
//		Thread t7 = new Thread(new TestRunnable("(*******("));
//		Thread t8 = new Thread(new TestRunnable(")********)"));
//		Thread t9 = new Thread(new TestRunnable("***********"));	
		
		String [] toto = {
				"      *",
				"     ***",
				"    *****",
				"   *******",
				"  *********",
				" ***********",
				"*************"
				};	
		
		Thread t = new Thread(new TestRunnable(toto));
		
		t.start();

		
	}

	public String[] getTabThread() {
		return tabThread;
	}

	public void setTabThread(String[] tabThread) {
		this.tabThread = tabThread;
	}

}
