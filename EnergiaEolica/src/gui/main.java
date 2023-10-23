package gui;
import java.util.ArrayList; 

import java.util.List;

import objetos.historial;
import objetos.Aerogenerador;
import objetos.operador; 
import objetos.Controlador;
import objetos.RedEnergiaNacional; 
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Random; 

public class main {	
	
	public static void main(String[] args) {	
	
		
		Random random = new Random(); 
		int viento = random.nextInt(160);
		
		historial historial1 = new historial();
		historial historial2 = new historial();
		historial historial3 = new historial();
		historial historial4 = new historial();
		historial historial5 = new historial();
		historial historial6 = new historial();
		historial historial7 = new historial();
		historial historial8 = new historial();
		historial historial9 = new historial();
		historial historial10 = new historial();
		historial historial11 = new historial();
		historial historial12 = new historial();
		historial historial13 = new historial();
		historial historial14 = new historial();
		historial historial15 = new historial();
		historial historial16 = new historial();
		historial historial17 = new historial();
		historial historial18 = new historial();
		
        List<Aerogenerador> generadores = new ArrayList<>();
        Aerogenerador generador1 = new Aerogenerador(viento, historial1); 
        generadores.add(generador1);  
        viento = random.nextInt(130);
        Aerogenerador generador2 = new Aerogenerador(viento, historial2); 
        generadores.add(generador2); 
        viento = random.nextInt(130);
        Aerogenerador generador3 = new Aerogenerador(viento, historial3); 
        generadores.add(generador3); 
        viento = random.nextInt(130);
        Aerogenerador generador4 = new Aerogenerador(viento, historial4); 
        generadores.add(generador4); 
        viento = random.nextInt(130);
        Aerogenerador generador5 = new Aerogenerador(viento, historial5); 
        generadores.add(generador5); 
        viento = random.nextInt(130);
        Aerogenerador generador6 = new Aerogenerador(viento, historial6); 
        generadores.add(generador6); 
        viento = random.nextInt(130);
        Aerogenerador generador7 = new Aerogenerador(viento, historial7); 
        generadores.add(generador7);
        viento = random.nextInt(130);
        Aerogenerador generador8 = new Aerogenerador(viento, historial8);
        generadores.add(generador8); 
        viento = random.nextInt(130);
        Aerogenerador generador9 = new Aerogenerador(viento, historial9); 
        generadores.add(generador9); 
        viento = random.nextInt(130);
        Aerogenerador generador10 = new Aerogenerador(viento, historial10); 
        generadores.add(generador10);
        viento = random.nextInt(130);
        Aerogenerador generador11 = new Aerogenerador(viento, historial11); 
        generadores.add(generador11);
        viento = random.nextInt(130);
        Aerogenerador generador12 = new Aerogenerador(viento, historial12); 
        generadores.add(generador11);
        viento = random.nextInt(130);
        Aerogenerador generador13 = new Aerogenerador(viento, historial13); 
        generadores.add(generador13);
        viento = random.nextInt(130);
        Aerogenerador generador14 = new Aerogenerador(viento, historial14); 
        generadores.add(generador14);
        viento = random.nextInt(130);
        Aerogenerador generador15 = new Aerogenerador(viento, historial15); 
        generadores.add(generador15);
        viento = random.nextInt(130);
        Aerogenerador generador16 = new Aerogenerador(viento, historial16); 
        generadores.add(generador16);
        viento = random.nextInt(130);
        Aerogenerador generador17 = new Aerogenerador(viento, historial17); 
        generadores.add(generador17);
        viento = random.nextInt(130);
        Aerogenerador generador18 = new Aerogenerador(viento, historial18);  
        generadores.add(generador18);
        viento = random.nextInt(130);
      
        List<operador> operadores = new ArrayList<>();
        operador operador1 = new operador(generador1);
        operadores.add(operador1);
        operador operador2 = new operador(generador2);
        operadores.add(operador2);
        operador operador3 = new operador(generador3);
        operadores.add(operador3);
        operador operador4 = new operador(generador4);
        operadores.add(operador4);
        operador operador5 = new operador(generador5);
        operadores.add(operador5);
        operador operador6 = new operador(generador6);
        operadores.add(operador6);
        operador operador7 = new operador(generador7);
        operadores.add(operador7);
        operador operador8 = new operador(generador8);
        operadores.add(operador8);
        operador operador9 = new operador(generador9);
        operadores.add(operador9);
        operador operador10 = new operador(generador10);
        operadores.add(operador10);
        operador operador11 = new operador(generador11);
        operadores.add(operador11);
        operador operador12 = new operador(generador12);
        operadores.add(operador12);
        operador operador13 = new operador(generador13);
        operadores.add(operador13);
        operador operador14 = new operador(generador14);
        operadores.add(operador14);
        operador operador15 = new operador(generador15);
        operadores.add(operador15);
        operador operador16 = new operador(generador16);
        operadores.add(operador16);
        operador operador17 = new operador(generador17);
        operadores.add(operador17);
        operador operador18 = new operador(generador18);
        operadores.add(operador18);
        
        
        Calendar calendario = Calendar.getInstance(); 
        RedEnergiaNacional redEnergiaNacional = new RedEnergiaNacional();

        abrir a = new abrir(calendario, generadores, operadores, redEnergiaNacional);   
        
        Controlador controlador = new Controlador(calendario, generadores, redEnergiaNacional);
        controlador.iniciarProduccionEnergia(); 
        
    }
		
}
        	






