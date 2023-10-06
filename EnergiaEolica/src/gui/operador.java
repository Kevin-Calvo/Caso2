package gui;


class operador {
	
	int angulo = 5;
	boolean encendido = true; 
    protected float potenciaGenerada; 

    
    
    public void encenderApagar() {
    	if (encendido)
    	{encendido = false;}
    	else
    	{encendido = true;}
    }
    
    public void ajustarAngulo(int nuevoA)
    {
    	if ((nuevoA >= 1) && (nuevoA <= 45))
    	{
    	angulo = nuevoA;
    	}
    }

    public float generarPotencia(float velocidad, int angulo) {
    	if (encendido)
    	{
	    	if (velocidad < 0)
	    	{ 
	    		System.out.println("ERROR");
	    		return 0;
	    	}
	    	if ((velocidad > 0) && (velocidad <=90))
	    	{
	    		potenciaGenerada = (float) (velocidad * 1.5 * angulo)/10;
	    	}
	    	if (velocidad > 90)
	    	{
	    		encenderApagar();
	    	}
	    	return potenciaGenerada; 
    	}
    	else
    	{
    		if ((velocidad > 0) && (velocidad < 90))
    		{
    			encenderApagar();
    			generarPotencia(velocidad, angulo);
    		}
    		
    		return 0; 
    	}
    	
    }
}

