package lv.jak.artjoms.datnes;

public class MainClass {

	public static void main(String[] args) {
		IerakstisanaFaila ierakstisana = new IerakstisanaFaila();
		ierakstisana.writeToFile("text.txt","");

		FailaNolasisana failaNolasisana = new FailaNolasisana();
		//String s = failaNolasisana.readFile("text");
		System.out.println();
		System.out.println("No MainClass");
		System.out.println(failaNolasisana.readFile("text.txt"));
		
	}

}
