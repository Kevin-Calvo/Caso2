package gui;

import javax.swing.*;
import java.awt.Font; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import objetos.Aerogenerador; 

public class historial extends JFrame{
	JFrame h; 
	JLabel titulo;
	JLabel aerogenerador;
	JTextField generador;
	JLabel fi;
	JTextField fecha;
	JButton obtener;
	JLabel produccion;
	JLabel producida;
	Font font1;
	Font font2;
	Font font3; 
	JLabel x; 
	
	public historial(List<Aerogenerador> generadores) {  
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
		
		generador = new JTextField(4);
		generador.setBounds(245,112,50,30);
		h.add(generador);
		
		fi = new JLabel();
		fi.setText("Fecha Inicial: ");
		fi.setBounds(100,125,400,100);
		fi.setFont(font2);
		h.add(fi); 
		
		fecha = new JTextField(4);
		fecha.setBounds(245,162,80,30);
		h.add(fecha);
		
		produccion= new JLabel();
		produccion.setText("Energia producida: ");
		produccion.setBounds(100,170,400,100);
		produccion.setFont(font2);
		h.add(produccion); 
		
		produccion= new JLabel();
		produccion.setText("");
		produccion.setBounds(270,170,400,100);
		produccion.setFont(font2);
		h.add(produccion);
		
		obtener = new JButton();
		obtener.setBounds(600,250,100,50);
		obtener.setText("Obtener");
		h.add(obtener); 
		
		obtener.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener el texto del campo de texto cuando se hace clic en el botón
                String entrada = generador.getText();
                int gen = Integer.parseInt(entrada)-1; 
                String date = fecha.getText();
                
                String energiaproducida = String.valueOf(generadores.get(gen).historial.obtenerEnergiaPorFecha(date)); 
                produccion.setText(energiaproducida);
            }
        });
		x = new JLabel();
		h.add(x);  
	}
}