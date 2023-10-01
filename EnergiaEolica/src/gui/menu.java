package gui;

import javax.swing.*;
import java.awt.Font; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 

public class menu extends JFrame{
	JFrame m;
	JButton historial;
	JButton control;
	JLabel titulo;
	JLabel hora;
	JLabel fecha;
	JLabel estado;
	JLabel produccion; 
	JLabel aerogenerador;
	Font font;
	Font font1;
	Font font2;
	JLabel x; 
	String[] parque = {"Tejona","Valle Central","CoopeSantos","Plantas Eolicas S.A.","Aeroenergia","Tilawind","MOVASA","Vientos del este", "Mogote", "Altamira", "Campos Azules",
			"Vientos de Miramar","Vientos de La Perla","PE Guanacaste","Chiripa","Orosi","Cacao","Rio Naranjo"};
	JLabel temporal; 
	
	public menu() {  
		
		m = new JFrame();
		m.setVisible(true);
		m.setBounds(250,250, 1000, 750);
		m.setLayout(null);
		m.setDefaultCloseOperation(EXIT_ON_CLOSE); 
		m.setTitle("Menu"); 
		
		titulo = new JLabel("Energia Eolica de Costa Rica");
		titulo.setBounds(250,10,1000,100); 
		font = new Font("Arial", Font.BOLD, 35);
		titulo.setFont(font);
		m.add(titulo); 
		
		font1 = new Font("Arial", Font.PLAIN, 20); 
		
		fecha = new JLabel("Fecha: ");
		fecha.setBounds(150,50,1000,100);  
		fecha.setFont(font1);
		m.add(fecha);
		
		hora = new JLabel("Hora: ");
		hora.setBounds(700,50,1000,100); 		 
		hora.setFont(font1);  
		m.add(hora); 	 	 
		
		font2 = new Font("Arial", Font.BOLD, 20); 
		aerogenerador = new JLabel("Aerogenerador ");
		aerogenerador.setBounds(100,120,1000,50);  
		aerogenerador.setFont(font2);
		m.add(aerogenerador);  
		
		estado = new JLabel("Estado ");
		estado.setBounds(400,120,1000,50);  
		estado.setFont(font2);
		m.add(estado);  
		
		produccion = new JLabel("Velocidad de Produccion ");
		produccion.setBounds(600,120,1000,50);  
		produccion.setFont(font2);
		m.add(produccion);  
			 
		
		int y = 170;
		Font font3 = new Font("Arial", Font.PLAIN, 15);
		for (int i = 0; i < parque.length; i++)
		{ 
			temporal = new JLabel(parque[i]);
			temporal.setBounds(100, y, 500, 40);
			temporal.setFont(font3);
			m.add(temporal);
			y = y + 25; 
		}
		
		historial = new JButton();     
		historial.setBounds(500,650,150,50);
		historial.setText("Historial");
		m.add(historial);
		
		control = new JButton();
		control.setBounds(300,650,150,50);
		control.setText("Control");
		m.add(control); 
		 
		x = new JLabel();
		m.add(x); 
		
		
	
	}
	
}
