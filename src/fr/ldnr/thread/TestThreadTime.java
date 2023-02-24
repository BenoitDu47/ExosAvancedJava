package fr.ldnr.thread;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestThreadTime {

	public static void main(String[] args) throws IOException, InterruptedException {

	
		DateFormat df = new SimpleDateFormat("HH:mm:ss");
		Thread thread = new Thread(new MonRunnable(1000));

		System.out.println(df.format(new Date()));
		//new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		thread.start();
	}

	private static class MonRunnable implements Runnable {

		private long delai;

		public MonRunnable(long delai) {
			this.delai = delai;
		}

		@Override
		public void run() {
			while (true) {
				try {
					Thread.sleep(delai);
					System.out.println("-");
				} catch (Exception e) {

					e.printStackTrace();
				}
			}
		}
	}

}