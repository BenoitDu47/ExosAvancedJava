package fr.ldnr.thread;

import java.util.Arrays;
import java.util.List;

public class TestThread extends Thread {

	public TestThread(String name) {
		super(name);

	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.print(this.getName());
		}
		System.out.println("");
	}

	public static void main(String[] arsg) {
		TestThread t = new TestThread("1-");
		TestThread t2 = new TestThread("2--");
		TestThread t3 = new TestThread("3---");
		TestThread t4 = new TestThread("4----");
		TestThread t5 = new TestThread("5-----");

		TestThread [] toto = {t,t2,t3,t4,t5};
		
//      Exercice 2.1
//		t.start();
//		t2.start();
//		t3.start();
//		t4.start();
//		t5.start();
		

		for(TestThread i : toto) {
			i.start();
		}
		
	}
}
