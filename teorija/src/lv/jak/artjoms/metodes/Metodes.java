package lv.jak.artjoms.metodes;

public class Metodes {
 //1.Metodes ar atgriešanas tipu (int , void , Scanner , int[] , utt)
	//void - metode tikai izpilda darbības (beigas NAV return komanda)
	//jebkurs tips ,klase ,masīvs ,utt - metodes pēdēja rinda ir REturn komandrinda
	
	//piemers ar void
	
	public void izvaditTekstu() {
		System.out.println("Ši ir void metode!");
	}
	//piemērs at atgriežamo tipu - int
	public int atrieztVertibu() {
		System.out.println("Ši ir metode atgiešamo vertību");
		return 5;
	}
	//2.Metodes ar parametriem
	//Metodēm parastajās iekavas norādam, kādas datu tipa vertības ir nepieciešamas, lai metodi iedarbinatu(call)
	//parametram norada datu tipu un ta nosaukumu
	public void parametruMetode(int procenti ,double vertiba) {
		System.out.println(procenti + "% no "+ vertiba+" = "+(vertiba * procenti / 100));
	}
	
	
	
}
