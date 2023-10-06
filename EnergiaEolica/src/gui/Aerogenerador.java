package gui;

public class Aerogenerador extends operador {
	float velocidad;
	
	public Aerogenerador(float velocidad) {
        this.velocidad = velocidad; 
        
    }
	
    public float getPotenciaGenerada() {
    	potenciaGenerada = generarPotencia(velocidad, angulo);
        return potenciaGenerada;
    }
}




