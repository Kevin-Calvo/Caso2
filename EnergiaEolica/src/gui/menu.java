package gui;

import javax.swing.*;

import objetos.Aerogenerador;
import java.util.Calendar; 
import java.awt.Font; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import java.util.List; 

import objetos.RedEnergiaNacional;
import objetos.operador; 

public class menu extends JFrame{
	JFrame m;
	JButton historial;
	JButton control;
	JButton estado; 
	JLabel titulo;
	JLabel hora;
	JLabel Hora; 
	JLabel fecha;
	JLabel Fecha; 
	Font font;
	Font font1;
	Font font2;
	JLabel x; 
	public menu(Calendar calendario, List<Aerogenerador> generadores, List<operador> operadores, RedEnergiaNacional red) {     
		
		m = new JFrame();
		m.setVisible(true);
		m.setBounds(250,250, 800, 300);
		m.setLayout(null);
		m.setTitle("Menu"); 
		
		titulo = new JLabel("Energia Eolica de Costa Rica");
		titulo.setBounds(150,10,1000,100); 
		font = new Font("Arial", Font.BOLD, 35);
		titulo.setFont(font);
		m.add(titulo); 
		
		font1 = new Font("Arial", Font.PLAIN, 20); 
		
		fecha = new JLabel("Fecha: ");
		fecha.setBounds(175,80,1000,100);  
		fecha.setFont(font1);
		m.add(fecha);
		
		String year = String.valueOf(calendario.get(Calendar.YEAR));
        String mes = String.valueOf(calendario.get(Calendar.MONTH) + 1); // Los meses comienzan desde 0, así que se suma 1
        String dia = String.valueOf(calendario.get(Calendar.DAY_OF_MONTH));
		Fecha = new JLabel(year+"/"+mes+"/"+dia); 
		Fecha.setBounds(250,80,1000,100);  
		Fecha.setFont(font1);
		m.add(Fecha);
		
		hora = new JLabel("Hora: ");
		hora.setBounds(480,80,1000,100); 		 
		hora.setFont(font1);  
		m.add(hora); 	 	 
		
		String horas = String.valueOf(calendario.get(Calendar.HOUR_OF_DAY));
        String minutos = String.valueOf(calendario.get(Calendar.MINUTE));
        String segundos = String.valueOf(calendario.get(Calendar.SECOND));  
		Hora = new JLabel(horas+":"+minutos+":"+segundos);  
		Hora.setBounds(550,80,1000,100); 		 
		Hora.setFont(font1);  
		m.add(Hora); 
		
		font2 = new Font("Arial", Font.BOLD, 20);  			 
		
		historial = new JButton();     
		historial.setBounds(100,175,150,50);
		historial.setText("Historial");
		m.add(historial);
		
		historial.addActionListener(new ActionListener() { 
            @Override
            public void actionPerformed(ActionEvent e) {
            	new historial(generadores);
            }
        });
		
		control = new JButton();
		control.setBounds(300,175,150,50);
		control.setText("Control");
		m.add(control); 
		
		control.addActionListener(new ActionListener() { 
            @Override
            public void actionPerformed(ActionEvent e) {
            	new control(operadores);
            }
        });
		
		estado = new JButton();
		estado.setBounds(500,175,150,50);
		estado.setText("Estado");
		m.add(estado); 
		 
		estado.addActionListener(new ActionListener() { 
            @Override
            public void actionPerformed(ActionEvent e) {
                new table(generadores, red); 
            }
        });
		
		x = new JLabel();
		m.add(x); 
		
		
	
	}
	
}
