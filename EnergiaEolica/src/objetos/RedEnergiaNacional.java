package objetos;

public class RedEnergiaNacional {
    private float energiaEnRed; 

    public RedEnergiaNacional() {
        this.energiaEnRed = 0; 
    }

    public void recibirEnergia(float energiaGenerada) {
        energiaEnRed += energiaGenerada;
    }

    public float getEnergiaEnRed() { 
        return energiaEnRed;
    }
}




