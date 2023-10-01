package gui;

import javax.swing.*;
import java.awt.Font; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 

public class control extends JFrame{
	JFrame c; 
	JLabel titulo;
	JLabel aerogenerador; 
	JLabel angulo; 
	JButton arrancar;
	JButton frenar;
	JButton reparar;
	Font font1;
	Font font2;
	Font font3; 
	JLabel x; 
	
	public control() {
		font1 = new Font("Arial", Font.BOLD, 35);
		font2 = new Font("Arial", Font.PLAIN, 20); 
		font3 = new Font("Arial", Font.ITALIC, 20); 
		
		c = new JFrame(); 
		c.setVisible(true);
		c.setBounds(225,250,740,400);
		c.setDefaultCloseOperation(HIDE_ON_CLOSE); 
		c.setTitle("Maquina de Control");
		
		titulo = new JLabel();
		titulo.setText("Control Aerogeneradores");
		titulo.setBounds(180,0,450,100);
		titulo.setFont(font1);
		c.add(titulo); 
		
		aerogenerador = new JLabel();
		aerogenerador.setText("Aerogenerador: ");
		aerogenerador.setBounds(100,65,400,100);
		aerogenerador.setFont(font2);
		c.add(aerogenerador); 
			
		angulo = new JLabel();
		angulo.setText("Angulo: ");
		angulo.setBounds(40,225,400,100);
		angulo.setFont(font3);
		c.add(angulo);
		
	    arrancar = new JButton();     
		arrancar.setBounds(250,250,100,50);
		arrancar.setText("Arrancar");
		c.add(arrancar);
		
		frenar = new JButton();
		frenar.setBounds(425,250,100,50);
		frenar.setText("Frenar");
		c.add(frenar); 
		
		reparar = new JButton();
		reparar.setBounds(600,250,100,50);
		reparar.setText("Reparar");
		c.add(reparar); 
		
		x = new JLabel();
		c.add(x);  
	}
}