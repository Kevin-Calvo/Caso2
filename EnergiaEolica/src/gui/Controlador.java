package gui;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class Controlador {
    private List<Aerogenerador> generadores;
    private RedEnergiaNacional redEnergiaNacional;
    private Timer timer;
    
    public Controlador(List<Aerogenerador> generadores, RedEnergiaNacional redEnergiaNacional) {
        this.generadores = generadores;
        this.redEnergiaNacional = redEnergiaNacional;
        this.timer = new Timer();
    }

    // Método para simular la producción de energía cada 5 segundos
    public void iniciarProduccionEnergia() {
        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {
                int energiaTotalGenerada = 0;
                for (Aerogenerador generador : generadores) {
                    int potenciaGenerada = (int) generador.getPotenciaGenerada(); 
                    energiaTotalGenerada += potenciaGenerada;
                }
                redEnergiaNacional.recibirEnergia(energiaTotalGenerada);
                System.out.println("Energía total generada por todos los generadores: " + energiaTotalGenerada + " kW");
                System.out.println("Energía en la red nacional: " + redEnergiaNacional.getEnergiaEnRed() + " kW");
            }
        };

        // Programar la tarea para ejecutarse cada 5 segundos (5000 milisegundos)
        timer.schedule(tarea, 0, 5000);
        
        // Detener la tarea después de 10 segundos
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                timer.cancel(); // Detener el temporizador
                System.out.println("Producción de energía detenida después de 100 segundos");
            }
        }, 100000); 
    }
}






