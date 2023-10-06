package gui;

public class RedEnergiaNacional {
    private float energiaEnRed; // Energía en la red nacional en kW

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




