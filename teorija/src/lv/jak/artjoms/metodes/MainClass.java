package lv.jak.artjoms.metodes;

public class MainClass {
 public static void main(String [] args) {
	 
	 Metodes m = new Metodes();
	 //metožu isaukšana
	 m.izvaditTekstu();
	 
	 int x = m.atrieztVertibu();
	 System.out.println("Atgriezsta vertība"+ x);
	 
	 
	 m.parametruMetode(15, 256.5);
 }
}
