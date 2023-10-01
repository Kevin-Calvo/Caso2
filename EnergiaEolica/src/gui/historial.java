package gui;

import javax.swing.*;
import java.awt.Font; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 

public class historial extends JFrame{
	JFrame h; 
	JLabel titulo;
	JLabel aerogenerador;
	JLabel fi;
	JLabel ff;
	JLabel produccion;
	Font font1;
	Font font2;
	Font font3; 
	JLabel x; 
	
	public historial() {
		font1 = new Font("Arial", Font.BOLD, 35);
		font2 = new Font("Arial", Font.PLAIN, 20); 
		font3 = new Font("Arial", Font.ITALIC, 20); 
		
		h = new JFrame(); 
		h.setVisible(true);
		h.setBounds(225,250,740,400);
		h.setDefaultCloseOperation(HIDE_ON_CLOSE); 
		h.setTitle("Historial de Produccion");
		
		titulo = new JLabel();
		titulo.setText("Historial de Produccion");
		titulo.setBounds(200,0,400,100);
		titulo.setFont(font1);
		h.add(titulo); 
		
		aerogenerador = new JLabel();
		aerogenerador.setText("Aerogenerador: ");
		aerogenerador.setBounds(100,75,400,100);
		aerogenerador.setFont(font2);
		h.add(aerogenerador);
		
		fi = new JLabel();
		fi.setText("Fecha Inicial: ");
		fi.setBounds(100,125,400,100);
		fi.setFont(font2);
		h.add(fi); 
		
		ff = new JLabel();
		ff.setText("Fecha Final: ");
		ff.setBounds(100,175,400,100);
		ff.setFont(font2);
		h.add(ff); 
		
		produccion= new JLabel();
		produccion.setText("Energia producida: ");
		produccion.setBounds(150,250,400,100);
		produccion.setFont(font2);
		h.add(produccion); 
			
		x = new JLabel();
		h.add(x);  
	}
}