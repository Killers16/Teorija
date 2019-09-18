package lv.jak.artjoms.klases.mantosana;

public class MainClass {

	public static void main(String[] args) {
		
		KlaseB klaseB = new KlaseB();
		
		System.out.println(klaseB.b+klaseB.a);
		
	klaseB.a = -9;
	
	KlaseA klaseA = new KlaseA();
	klaseA.a = -9;
	
	KlaseA klaseA2 = new KlaseA();
	System.out.println(klaseA2.a);
	}

}
