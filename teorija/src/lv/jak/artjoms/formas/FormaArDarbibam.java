package lv.jak.artjoms.formas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import lv.jak.artjoms.datnes.IerakstisanaFaila;



public class FormaArDarbibam extends JFrame implements ActionListener{
	private static final long serialVersionUID = -2237187731170232497L;
	
	JPanel panel;
	JLabel fNameL, lNameL, eMailL, availableL, selectedL, topicL;
	JTextField fNameTF, lNameTF, eMailTF, topicTF;
	JList<String> availableList, selectedList;
	JButton allToSelectedBTN, toSelectedBTN, allToAvailableBTN, toAvailableBTN, addBTN, removeBTN, clearBTN, okBTN, cancelBTN;
	
	DefaultListModel<String> availableModel = new DefaultListModel<String>();
	DefaultListModel<String> selectedModel = new DefaultListModel<String>();
	
	public FormaArDarbibam() {
		setBounds(100, 150, 360, 640);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Forma ar darbībām");
		setResizable(false);
		
		init();
		
		setContentPane(panel);
	}

	public void init() {
		panel = new JPanel(null);
		
		fNameL = new JLabel("First Name:", SwingConstants.RIGHT);
		fNameL.setBounds(10, 10, 70, 30);
		
		
		fNameTF = new JTextField();
		fNameTF.setBounds(90, 10, 250, 30);
		
		
		lNameL = new JLabel("Last Name:", SwingConstants.RIGHT);
		lNameL.setBounds(10, 50, 70, 30);
		
		
		lNameTF = new JTextField();
		lNameTF.setBounds(90, 50, 250, 30);
		
		
		eMailL = new JLabel("E-mail:", SwingConstants.RIGHT);
		eMailL.setBounds(10, 90, 70, 30);
		
		
		eMailTF = new JTextField();
		eMailTF.setBounds(90, 90, 250, 30);
		
		
		availableL = new JLabel("Available Topics:");
		availableL.setBounds(10, 130, 150, 30);
		
		
		selectedL = new JLabel("Selected Topics:", SwingConstants.RIGHT);
		selectedL.setBounds(190, 130, 150, 30);
		
		
		availableList = new JList<>(availableModel);
		availableList.setBounds(10, 160, 130, 300);
		
		
		selectedList = new JList<>(selectedModel);
		selectedList.setBounds(210, 160, 130, 300);
		
		
		allToSelectedBTN = new JButton(">>");
		allToSelectedBTN.setBounds(150, 160, 50, 30);
		allToSelectedBTN.addActionListener(this);
		
		toSelectedBTN = new JButton(">");
		toSelectedBTN.setBounds(150, 200, 50, 30);
		toSelectedBTN.addActionListener(this);

		toAvailableBTN = new JButton("<");
		toAvailableBTN.setBounds(150, 240, 50, 30);
		toAvailableBTN.addActionListener(this);

		allToAvailableBTN = new JButton("<<");
		allToAvailableBTN.setBounds(150, 280, 50, 30);
		allToAvailableBTN.addActionListener(this);
		
		topicL = new JLabel("Topic:");
		topicL.setBounds(10, 470, 40, 30);
		
		
		topicTF = new JTextField();
		topicTF.setBounds(50, 470, 290, 30);
		topicTF.addActionListener(this);
		
		addBTN = new JButton("Add");
		addBTN.setBounds(10, 510, 100, 30);
		addBTN.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				availableModel.addElement(topicTF.getText());
				topicTF.setText(" ");
				}
			
	});
		
		removeBTN = new JButton("Remove");
		removeBTN.setBounds(120, 510, 110, 30);
		removeBTN.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!availableModel.isEmpty() && !availableList.isSelectionEmpty()) {
					int index = availableList.getSelectedIndex();
					availableModel.remove(index);
				}
			}
		});
		
		clearBTN = new JButton("Clear");
		clearBTN.setBounds(240, 510, 100, 30);
		clearBTN.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		
		okBTN = new JButton("OK");
		okBTN.setBounds(170, 570, 80, 30);
		okBTN.addActionListener(this);
		
		cancelBTN = new JButton("Cancel");
		cancelBTN.setBounds(260, 570, 80, 30);
		cancelBTN.addActionListener(this);
		
		panel.add(fNameL); panel.add(lNameL); panel.add(eMailL); panel.add(availableL); panel.add(selectedL); panel.add(topicL);
		panel.add(fNameTF); panel.add(lNameTF); panel.add(eMailTF); panel.add(topicTF);
		panel.add(availableList); panel.add(selectedList);
		panel.add(allToSelectedBTN); panel.add(toSelectedBTN); panel.add(toAvailableBTN); panel.add(allToAvailableBTN);
		panel.add(addBTN); panel.add(removeBTN); panel.add(clearBTN); panel.add(okBTN); panel.add(cancelBTN);
		
	}
	
	@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource( )== allToSelectedBTN) {
				System.out.println("Nospied >>");
				for(int i = 0 ; i < availableModel.getSize();i++) {
					String topic = availableModel.get(i);
					selectedModel.addElement(topic);
				}
				availableModel.clear();
			}
			else if(e.getSource()==toSelectedBTN) {
				System.out.println("Nospied >");
				if (!availableModel.isEmpty() && !availableList.isSelectionEmpty()) {
					int index = availableList.getSelectedIndex();
					String topic = availableModel.get(index);
					selectedModel.addElement(topic);
					availableModel.remove(index);
					
					
				}
			}
			else if(e.getSource()==toAvailableBTN) {
				System.out.println("Nospied <");
				 if (!selectedModel.isEmpty() && !selectedList.isSelectionEmpty()) {
					int index = selectedList.getSelectedIndex();
					String topic = selectedModel.get(index);
					availableModel.addElement(topic);
					selectedModel.remove(index);
				}
				
			}
			else if(e.getSource()==allToAvailableBTN) {
				System.out.println("Nospied <<");
				for(int i = 0 ; i < selectedModel.getSize();i++) {
					String topic = selectedModel.get(i);
					availableModel.addElement(topic);
				}
				selectedModel.clear();
				
			}
			else if(e.getSource() == okBTN) {
				String text = "First Name:"+ fNameTF.getText()
				+"\nLast Name:"+ lNameTF.getText()
				+"\nE-Mail"+ eMailTF.getText()
				+"\nSelected tipics:";
				if(!selectedModel.isEmpty()) {
					for(int i =0;i <selectedModel.getSize();i++) {
						if(i<selectedModel.getSize()-1) {
							text +=selectedModel.get(i)+", ";
							text +=",";
						}
						
					}
				
				}
				else {
					text +="-------";
				}
				text +="\n\n";
				IerakstisanaFaila.writeToFile("Dati_No_Formas.txt", text);
			}
		else if(e.getSource()==cancelBTN) {
			System.exit(0);
		}
		}
	
		
	}
	
