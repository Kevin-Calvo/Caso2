package gui;

import java.util.ArrayList; 
import java.util.List; 

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		menu m = new menu();   
		historial h = new historial();
		control c = new control();
	*/
		 // Crear varios generadores*
		
        List<Aerogenerador> generadores = new ArrayList<>();
        Aerogenerador generador1 = new Aerogenerador(90); 
        generadores.add(generador1);  
        Aerogenerador generador2 = new Aerogenerador(10); 
        generadores.add(generador2);  
        Aerogenerador generador3 = new Aerogenerador(15); 
        generadores.add(generador3);  
        Aerogenerador generador4 = new Aerogenerador(50); 
        generadores.add(generador4);  
        Aerogenerador generador5 = new Aerogenerador(40); 
        generadores.add(generador5);  
        Aerogenerador generador6 = new Aerogenerador(70); 
        generadores.add(generador6);  
        Aerogenerador generador7 = new Aerogenerador(90); 
        generadores.add(generador7);  
        Aerogenerador generador8 = new Aerogenerador(100);
        generadores.add(generador8);  
        Aerogenerador generador9 = new Aerogenerador(35); 
        generadores.add(generador9);  
        Aerogenerador generador10 = new Aerogenerador(15); 
        generadores.add(generador10);  
        Aerogenerador generador11 = new Aerogenerador(28); 
        generadores.add(generador11);  
        Aerogenerador generador12 = new Aerogenerador(29); 
        generadores.add(generador11);  
        Aerogenerador generador13 = new Aerogenerador(20); 
        generadores.add(generador13);  
        Aerogenerador generador14 = new Aerogenerador(5); 
        generadores.add(generador14);  
        Aerogenerador generador15 = new Aerogenerador(7); 
        generadores.add(generador15);  
        Aerogenerador generador16 = new Aerogenerador(6); 
        generadores.add(generador16);  

        
        // Crear la red de energía nacional
        RedEnergiaNacional redEnergiaNacional = new RedEnergiaNacional();

        // Crear el controlador y comenzar la producción de energía
        Controlador controlador = new Controlador(generadores, redEnergiaNacional);
        controlador.iniciarProduccionEnergia();
        
		
		
	}

}
