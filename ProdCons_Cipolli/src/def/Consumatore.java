package def;

public class Consumatore implements Runnable{
	private double tot=0, odd=0, x;
	private Buffer b;
	public Consumatore(Buffer b) {
		this.b=b;
	}
	
	public void run() {
		while(0<1) {
			x=b.rem();
			//si prendi qui dal buffer
			if(x%2==1) {
				odd++;
			}
			tot++;
			System.out.println("Nuovo numero:"+ x +"\nStatistica numeri dispari:"+tot/odd);
		}
	}
}
