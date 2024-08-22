package bl5;

public class uygulama {

	public static void main(String[] args) {
		baglıste bl=new baglıste();
		bl.basaekle(1);
		bl.basaekle(2);
		bl.sonekle(10);
		bl.arayaekle(0, 0);
		bl.arayaekle(2, 5);
		
		bl.bastansil();
		bl.sondansil();
		bl.aradansil(1);
		
		
		bl.yazdir();
		System.out.println("");
		bl.kacelemanvar();

	}

}
