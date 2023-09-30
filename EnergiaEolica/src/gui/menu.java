package gui;

import javax.swing.*;
import java.awt.Font; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 

public class menu extends JFrame{
	JFrame m;
	JButton cartago;
	JButton sanjose;
	JButton guanacaste; 
	JLabel titulo;
	Font font;
	
	public menu(Cartago c, Guanacaste g, SanJose s) {  
		m = new JFrame();
		m.setVisible(true);
		m.setBounds(250,250, 600, 400);
		m.setLayout(null);
		m.setDefaultCloseOperation(EXIT_ON_CLOSE); 
		m.setTitle("Menu"); 
		
		titulo = new JLabel("Energia Eolica de Costa Rica");
		titulo.setBounds(65,15,1000,100); 
		font = new Font("Arial", Font.BOLD, 35);
		titulo.setFont(font);
		m.add(titulo); 
		
		cartago = new JButton();     
		cartago.setBounds(75,150,150,50);
		cartago.setText("Cartago");
		m.add(cartago);
		
		sanjose = new JButton();
		sanjose.setBounds(350,150,150,50);
		sanjose.setText("San Jose");
		m.add(sanjose); 
		
		sanjose.addActionListener(new ActionListener() {   
			public void actionPerformed(ActionEvent e) { 
				s.setVisible(true); 
				System.out.println("Dio click"); 
			}
		}); 
	
		guanacaste = new JButton();
		guanacaste.setBounds(215,250,150,50);
		guanacaste.setText("Guanacaste");
		m.add(guanacaste); 
		
		guanacaste.addActionListener(new ActionListener() {   
			public void actionPerformed(ActionEvent e) { 
				g.setVisible(true); 
				System.out.println("Dio click"); 
			}
		}); 
	
	}
	
}
