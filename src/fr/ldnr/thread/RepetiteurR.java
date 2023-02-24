package fr.ldnr.thread;


public class RepetiteurR implements Runnable {
	String chaine;

	RepetiteurR(String chaine) {
		this.chaine = chaine;
	}

	public void run() {
		System.out.println(chaine);
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		System.out.println(chaine);
	}
}

class EcrivainR {
	public static void main(String[] argv) {
		new Thread(new RepetiteurR("soleil")).start();
		new Thread(new RepetiteurR("neige")).start();
		new Thread(new RepetiteurR("ski")).start();
		System.out.println("A la montagne");
	}
}