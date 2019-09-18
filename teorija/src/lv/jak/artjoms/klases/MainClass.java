package lv.jak.artjoms.klases;


import java.awt.Color;

import lv.jak.artjoms.klases.Suns;


public class MainClass {

	public static void main(String[] args) {
		// !!! balstoties uz vienu klasi var izveidot vairakus objektus
		 Suns s1 = new Suns();
		 s1.vards = "abc";
		 s1.suga = "zas";
		 s1.krasa = Color.black;
		 s1.vecums = 5;
		 
		 System.out.println("1. Suņa dati - vārds:"+ s1.vards 
				 +",suga:"+s1.suga+
				 ",krasa:"+s1.krasa+
				 ",vecums:"+s1.vecums+
				 ",čipots:"+s1.cipots);
		 
		 
		 
	}

}
