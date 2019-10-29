package lv.jak.artjoms.formas;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

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
		setBounds(900, 150, 500, 300);//iedodam izmeru formai
		setDefaultCloseOperation(EXIT_ON_CLOSE);//nosakam kas uzpiedisim krustu ,forma izsleksies un neveiks procesu
		setTitle("Pirma Forma");//Galvenais nosaukums formai
		setResizable(false);//lielotajs nevares uzllitk uz pilnu ekranu logu vai vares nosaka false vai true
		
		
		init();//izsauc metodi init
		
		setContentPane(panel);//izveido paneļi un izmerus formai 
		
	}
	public void init() {//izveidota metode ar neatgriežamo vertību
		panel = new JPanel(new GridBagLayout());//panelim  iedot parametrus 
		GridBagConstraints c = new GridBagConstraints(); //izveido metodi ar nosaukumu c
		
		//Formas augšeja daļa 
		JPanel topPanel = new JPanel(new BorderLayout(10,10));//izveido metodi ar nosaukumu topPanel un piešķir parametru
		
		
		enterNameL = new JLabel("Enter a name");//enterNameL  piešķir nosacijumu JLabelam
			
		enterNameTF = new JTextField();//izveido metodi ar nosaukumu enterNameTF 
		
		addBTN = new JButton("add");//enterNameL  piešķir nosacijumu piešķir nosacijumu JButton
		
		
		
		topPanel.add(enterNameL,BorderLayout.WEST);
		topPanel.add(enterNameTF,BorderLayout.CENTER);
		topPanel.add(addBTN,BorderLayout.EAST);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.insets = new Insets(-50, -230, 0, -230);
		c.gridx= 0;
		c.gridy= 0;
		
		panel.add(topPanel,c);
		//-------------------------------------
		
		//Formas centrs
		
		listedNames= new JList<String>(model);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.insets = new Insets(0, -230, 0, -230);
		c.gridx= 0;
		c.gridy= 1;
		
		panel.add(new JScrollPane(listedNames),c);
		//--------------------------------------
		
		//Formas apakša
		JPanel bottomPanel = new JPanel(new BorderLayout());
		
		ClearBTN = new JButton("Clear");
		
		bottomPanel.add(ClearBTN, BorderLayout.EAST);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.insets = new Insets(0, -230, -80, -230);
		c.gridx= 0;
		c.gridy= 2;
		
		panel.add(bottomPanel,c);
		//--------------------------------------
		
		
		
		
		
		
		
	}
	
}
