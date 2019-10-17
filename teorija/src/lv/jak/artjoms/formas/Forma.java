package lv.jak.artjoms.formas;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;


import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;





//JFrame mantošana , lai nodrošinatu formas aplikaciju veidošanu
public class Forma extends JFrame {
//defīnēt visas plānotas formas komponentes
	JLabel enterNameL; //vienkarša (statiska)teksta  komponentes
	
	JList<String> listedNames;//Nodrošina sakstra lauku
	JTextField enterNameTF;//ievadLauks teksta
	JButton addBTN,ClearBTN;//spiedPogas
	JPanel panel;//komponente uz kuras tiek liktas pārējas komponentes
	
	//Nepieciešams , lai aizpilditu saraksta lauku
	DefaultListModel<String>model = new DefaultListModel<String>();
	
	//Apraksta formas parametrus ,izmatojot konstruktorfunkciju
	public Forma() {
		setBounds(900, 150, 500, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Pirma Forma");
		
		
		init();
		
		setContentPane(panel);
		
	}
	public void init() {
		panel = new JPanel(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		//Formas augšeja daļa 
		JPanel topPanel = new JPanel(new BorderLayout(10,10));
		
		
		enterNameL = new JLabel("Enter a name");
			
		enterNameTF = new JTextField();
		
		addBTN = new JButton("add");
		
		
		
		topPanel.add(enterNameL,BorderLayout.WEST);
		topPanel.add(enterNameTF,BorderLayout.CENTER);
		topPanel.add(addBTN,BorderLayout.EAST);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx= 0;
		c.gridy= 0;
		
		panel.add(topPanel,c);
		//-------------------------------------
		
		//Formas centrs
		
		listedNames= new JList<String>(model);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx= 0;
		c.gridy= 1;
		
		panel.add(new JScrollPane(listedNames),c);
		//--------------------------------------
		
		//Formas apakša
		JPanel bottomPanel = new JPanel(new BorderLayout());
		
		ClearBTN = new JButton("Clear");
		
		bottomPanel.add(ClearBTN, BorderLayout.EAST);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx= 0;
		c.gridy= 2;
		
		panel.add(bottomPanel,c);
		//--------------------------------------
		
		
		
		
		
		
		
	}
	
}
