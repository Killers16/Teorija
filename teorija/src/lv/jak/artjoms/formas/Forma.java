package lv.jak.artjoms.formas;

import java.awt.BorderLayout;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
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
		setBounds(1100, 150, 500, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Pirma Forma");
		
		
		
		setContentPane(panel);
		
	}
	public void init() {
		panel = new JPanel(new BorderLayout());
		
		JPanel topJPanel = new JPanel(null);
		
		enterNameL = new JLabel("Enter a name");
		enterNameL.setBounds(10, 10, 150, 30);
		
		enterNameTF = new JTextField();
		enterNameTF.setBounds(170, 10, 230, 30);

		
		addBTN = new JButton("add");
		addBTN.setBounds(410, 10, 70, 30);
		
		
		topJPanel.add(enterNameL);
		topJPanel.add(enterNameTF);
		
		
	}
	
}
