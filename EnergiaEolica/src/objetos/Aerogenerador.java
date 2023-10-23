package objetos;

public class Aerogenerador{
	public historial historial;
	int velocidad;
	boolean encendido;
	int angulo;
	protected float potenciaGenerada;
	int energiadia; 
	
	public Aerogenerador(int velocidad, historial historial) {
		this.historial = historial;
        this.velocidad = velocidad; 
        this.angulo = 45;
        this.encendido = true;  
        
    }
    
	public void aumentaEnergiaDia(int energia) {
		energiadia += energia;  
	}
	
    public String getEstado()  
    {
    	if (encendido == true)
    		return ("Encendido");
    	else 
    		return ("Apagado");
    }
    
    public String getVelocidad()  
    {
    	return (String.valueOf(velocidad)); 
    }
    
    public int getAngulo()
    {
    	return angulo;  
    }
    
    public float getPotenciaGenerada() {
    	potenciaGenerada = generarPotencia(velocidad, angulo); 
        return potenciaGenerada;
    }
    
    public void encenderApagar() {
    	if (encendido)   
    	{encendido = false;}
    	else
    	{encendido = true;}
    }
    
    public float generarPotencia(float velocidad, int angulo) { 
    	if (encendido == true)
    	{
	    	if (velocidad < 0)
	    	{ 
	    		System.out.println("ERROR");
	    		return 0;
	    	}
	    	if ((velocidad > 0) && (velocidad <=90))
	    	{
	    		potenciaGenerada = (float) (velocidad * angulo)/20;
	    	}
	    	if (velocidad > 90)
	    	{
	    		encenderApagar();
	    	}
	    	return potenciaGenerada; 
    	}
    	else
    	{    		
    		return 0;  
    	} 
    
    }
}




