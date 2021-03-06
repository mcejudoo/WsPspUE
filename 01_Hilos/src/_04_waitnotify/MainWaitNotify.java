package _04_waitnotify;

public class MainWaitNotify {

	public static void main(String[] args) {
		Buffer buffer = new Buffer();
		Productor p1 = new Productor(buffer, "P1");
		Productor p2 = new Productor(buffer, "P2");
		Productor p3 = new Productor(buffer, "P3");
		
		Consumidor c1 = new Consumidor(buffer, "C1");
		Consumidor c2 = new Consumidor(buffer, "C2");
		Consumidor c3 = new Consumidor(buffer, "C3");
		
		new Thread(p1).start();
		new Thread(p2).start();
		new Thread(p3).start();
		new Thread(c1).start();
		new Thread(c2).start();
		new Thread(c3).start();
		
	}

}
