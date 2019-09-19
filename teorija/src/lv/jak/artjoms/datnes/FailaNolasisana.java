package lv.jak.artjoms.datnes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FailaNolasisana {
	public String readFile(String fileName) {
	File file = new File(fileName);
		String teksts = "";
	try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			String line = null;
			
			while ((line = br.readLine()) !=null) {
				System.out.println(line);
				teksts += line +"\n";
			}
		}
			catch (FileNotFoundException e) {
				System.out.print("Nav izveleta faila!");
				e.printStackTrace();
				
			}
			catch (IOException e) {
				
				System.out.print(" izveleto failu nav izdevies nolasit!");
			e.printStackTrace();
			}
		
	return teksts;	
	
	}
	
	
}
