package gui;

import javax.swing.*;

import objetos.operador;

import java.awt.Font; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List; 

public class control extends JFrame{
	JFrame c; 
	JLabel titulo;
	JLabel aerogenerador;
	JTextField generador; 
	JLabel angulo; 
	JTextField anguloset;
	JButton ajustar;
	JButton frenar;
	JButton arrancar;
	Font font1;
	Font font2;
	Font font3; 
	JLabel x; 
	
	public control(List<operador> operadores) {
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
		
		generador = new JTextField(4);
		generador.setBounds(245,100,50,30);
		c.add(generador);
		
		angulo = new JLabel();
		angulo.setText("Angulo: ");
		angulo.setBounds(40,225,400,100);
		angulo.setFont(font3);
		c.add(angulo);
		
		anguloset = new JTextField(4);
		anguloset.setBounds(120,260,50,30);
		c.add(anguloset);
		
		ajustar = new JButton();
		ajustar.setBounds(250,250,100,50);
		ajustar.setText("Ajustar");
		c.add(ajustar);
		
		ajustar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener el texto del campo de texto cuando se hace clic en el botón
                String entrada = generador.getText();
                int gen = Integer.parseInt(entrada)-1; 
                int angle = Integer.parseInt(anguloset.getText());
                operadores.get(gen).ajustarAngulo(angle);  
            }
        });
		
	    arrancar = new JButton();     
		arrancar.setBounds(425,250,100,50);
		arrancar.setText("Arrancar");
		c.add(arrancar); 
		
		arrancar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener el texto del campo de texto cuando se hace clic en el botón
                String entrada = generador.getText();
                int gen = Integer.parseInt(entrada)-1; 
                operadores.get(gen).encender(); 
            }
        });
		
		frenar = new JButton();
		frenar.setBounds(600,250,100,50);
		frenar.setText("Frenar");
		c.add(frenar); 
		
		frenar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener el texto del campo de texto cuando se hace clic en el botón
                String entrada = generador.getText();
                int gen = Integer.parseInt(entrada)-1; 
                operadores.get(gen).apagar();
            }
        });
		
		 
		
		x = new JLabel();
		c.add(x);  
	}
}