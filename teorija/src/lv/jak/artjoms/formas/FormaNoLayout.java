package lv.jak.artjoms.formas;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
	
	public class FormaNoLayout extends JFrame {
		JLabel enterNameL;
		
		JList<String> listedNames;
		JTextField enterNameTF;
		JButton addBTN,ClearBTN;
		JPanel panel;
		
		
		DefaultListModel<String>model = new DefaultListModel<String>();
		
		
		public FormaNoLayout() {
			setBounds(900, 150, 500, 300);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setTitle("Pirma Forma - No Layout");
			setResizable(false);
			
			
			init();
			
			setContentPane(panel);
			
		}
		public void init() {
			panel = new JPanel(null);
		
			enterNameL = new JLabel("Enter a name");
			enterNameL.setBounds(10, 10, 80, 30);
			
			enterNameTF = new JTextField();
			enterNameTF.setBounds(100, 10, 280,30);
			
			addBTN = new JButton("add");
			addBTN.setBounds(390, 10, 80,30);
			
			listedNames = new JList<String>(model);
			listedNames.setBounds(10, 50, 480, 150);
			
			ClearBTN = new JButton("Clear");
			ClearBTN.setBounds(390, 210, 80, 30);
			
			panel.add(enterNameL);panel.add(enterNameTF);panel.add(addBTN);
			panel.add(listedNames);panel.add(ClearBTN);
			
	}
}