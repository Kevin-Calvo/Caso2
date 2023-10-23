package objetos;


public class operador {
	
	Aerogenerador generador; 
   
	public operador(Aerogenerador generador) {
		this.generador = generador; 
	}
    
    public void apagar() {
    	if (generador.encendido == true) {
    		generador.encendido = false;
    		System.out.println("apagado");
    	}
    }
    
    public void encender() {
    	if (generador.encendido == false) {
    		generador.encendido = true;
    		System.out.println("encendido"); 
    	}
    }
    
    public void ajustarAngulo(int nuevoA)
    {
    	if ((nuevoA >= 1) && (nuevoA <= 45))
    	{
    	generador.angulo = nuevoA;
    	}
    }
        	
    }


