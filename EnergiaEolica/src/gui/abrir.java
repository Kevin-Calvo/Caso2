package gui;

import javax.swing.*;

import objetos.Aerogenerador;
import objetos.RedEnergiaNacional;

import java.awt.Font; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.List; 
import objetos.operador; 

public class abrir extends JFrame { 
	JFrame a;
	JButton menu;
	
	public abrir(Calendar calendario, List<Aerogenerador> generadores, List<operador> operadores, RedEnergiaNacional red) { 
		a = new JFrame(); 
		a.setVisible(true);
		a.setBounds(100,100,740,400);
		a.setDefaultCloseOperation(HIDE_ON_CLOSE); 
		a.setDefaultCloseOperation(EXIT_ON_CLOSE); 
		a.setTitle("Abrir aplicacion");
		
		menu = new JButton();
		menu.setBounds(500,175,150,50);
		menu.setText("Abir Menu");
		a.add(menu); 
		 
		menu.addActionListener(new ActionListener() { 
            @Override
            public void actionPerformed(ActionEvent e) {
                new menu(calendario, generadores, operadores, red);  
            }
        });
	}

}
