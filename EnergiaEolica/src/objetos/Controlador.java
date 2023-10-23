package objetos;

import java.util.Calendar;
import java.util.Random;  
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class Controlador {
	
    private List<Aerogenerador> generadores;
    private RedEnergiaNacional redEnergiaNacional;
    private Timer timer;
    private Calendar calendario;
    
    public Controlador(Calendar calendario, List<Aerogenerador> generadores, RedEnergiaNacional redEnergiaNacional) {
        this.generadores = generadores;
        this.redEnergiaNacional = redEnergiaNacional;
        this.timer = new Timer();
        this.calendario = calendario; 
        
    }


    public void iniciarProduccionEnergia() {
        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {
            	calendario.add(Calendar.HOUR_OF_DAY, 1);  
                int energiaTotalGenerada = 0;
                Random random = new Random();
                String year = String.valueOf(calendario.get(Calendar.YEAR));
                String mes = String.valueOf(calendario.get(Calendar.MONTH) + 1); 
                String dia = String.valueOf(calendario.get(Calendar.DAY_OF_MONTH));
                String fecha = year +"-"+ mes +"-"+ dia;  
                for (Aerogenerador generador : generadores) {
                    int potenciaGenerada = (int) generador.getPotenciaGenerada(); 
                    energiaTotalGenerada += potenciaGenerada;
                    generador.aumentaEnergiaDia(potenciaGenerada);
                    generador.velocidad = random.nextInt(130); 
                }
                
                redEnergiaNacional.recibirEnergia(energiaTotalGenerada);
                int horas = calendario.get(Calendar.HOUR_OF_DAY); 
                if (horas == 00)
                {
                	for (Aerogenerador generador : generadores) {
                		generador.historial.registrarEnergia(fecha, generador.energiadia); 
                		generador.energiadia = 0; 
                	}
                }
                
            }
        };
        timer.schedule(tarea, 0, 10000);
        
    }
}






