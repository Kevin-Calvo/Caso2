package gui;

import javax.swing.*;
import java.awt.Font; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 

public class SanJose extends JFrame{
	JFrame s; 
	JLabel titulo;
	JLabel condicion;
	JLabel condiciont;
	JLabel viento;
	JLabel vientot;
	JLabel aerogenerador;
	JLabel aerogeneradort;
	JLabel generador;
	JLabel generadort;
	JLabel torre;
	JLabel torret;
	JLabel control;
	JLabel controlt;
	JLabel red; 
	JLabel redt; 
	JLabel x;
	Font font1;
	Font font2;
	Font font3; 
	
	public SanJose() {
		font1 = new Font("Arial", Font.BOLD, 35);
		font2 = new Font("Arial", Font.PLAIN, 20); 
		font3 = new Font("Arial", Font.ITALIC, 20); 
		
		s = new JFrame(); 
		s.setVisible(true);
		s.setBounds(250,250,1000,600);
		s.setDefaultCloseOperation(HIDE_ON_CLOSE); 
		s.setTitle("San Jose");
		
		titulo = new JLabel();
		titulo.setText("Red de San Jose");
		titulo.setBounds(350,0,300,100);
		titulo.setFont(font1);
		s.add(titulo); 
		
		condicion = new JLabel();
		condicion.setText("Condicion climatica:");
		condicion.setBounds(10,45,300,100);
		condicion.setFont(font3);
		s.add(condicion); 
		
		condiciont = new JLabel();
		condiciont.setText("###");
		condiciont.setBounds(200,45,300,100);
		condiciont.setFont(font2);
		s.add(condiciont); 
		
		viento = new JLabel();
		viento.setText("Viento: ");
		viento.setBounds(700,45,300,100);
		viento.setFont(font3);
		s.add(viento); 
		
		vientot = new JLabel();
		vientot.setText("###");
		vientot.setBounds(780,45,300,100);
		vientot.setFont(font2);
		s.add(vientot);  
		
		aerogenerador = new JLabel();
		aerogenerador.setText("aerogenerador");
		aerogenerador.setBounds(60,200,300,100);
		aerogenerador.setFont(font2);
		s.add(aerogenerador); 
		
		aerogeneradort = new JLabel();
		aerogeneradort.setText("###");
		aerogeneradort.setBounds(100,160,300,100);
		aerogeneradort.setFont(font2);
		s.add(aerogeneradort); 
		
		generador = new JLabel();
		generador.setText("generador");
		generador.setBounds(420,200,300,100);
		generador.setFont(font2);
		s.add(generador);
		
		generadort = new JLabel();
		generadort.setText("###");
		generadort.setBounds(440,160,300,100);
		generadort.setFont(font2);
		s.add(generadort);
		
		torre = new JLabel();
		torre.setText("torre");
		torre.setBounds(780,200,300,100);
		torre.setFont(font2);
		s.add(torre);
		
		torret = new JLabel();
		torret.setText("###");
		torret.setBounds(785,160,300,100);
		torret.setFont(font2);
		s.add(torret);
		
		control = new JLabel();
		control.setText("Sistema de control");
		control.setBounds(240,400,300,100);
		control.setFont(font2);
		s.add(control);
		
		controlt = new JLabel();
		controlt.setText("###");
		controlt.setBounds(300,360,300,100);
		controlt.setFont(font2);
		s.add(controlt);
		
		red = new JLabel();
		red.setText("Red Nacional");
		red.setBounds(600,400,300,100);
		red.setFont(font2);
		s.add(red);
		
		redt = new JLabel();
		redt.setText("###");
		redt.setBounds(640,360,300,100);
		redt.setFont(font2);
		s.add(redt);
		
		x = new JLabel();
		s.add(x); 
	}
}
