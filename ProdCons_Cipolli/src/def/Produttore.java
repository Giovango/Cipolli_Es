package def;
import java.util.Random;

public class Produttore implements Runnable{
	private int time, num;
	private Buffer b;
	public Produttore(Buffer b,int x) {
		time=x;
		this.b=b;
	}
	public void run() {
		Random random = new Random();
		while(0<1) {
			try {
	            Thread.sleep(time);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
			num=random.nextInt(1023);
			//si da il valore al buffer
			b.add(num);
		}
	}
}
