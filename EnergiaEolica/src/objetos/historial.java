package objetos;

import java.util.HashMap;
import java.util.Map;

public class historial {
	public Map<String, Double> historicoEnergia;
	
		public historial() {
			this.historicoEnergia = new HashMap<>(); 
		}
		
		public void registrarEnergia(String fecha, double energiaProducida) {
	        historicoEnergia.put(fecha, energiaProducida);
	    }
		
		public Map<String, Double> getHistoricoEnergia() {
	        return historicoEnergia;
	    }
		
		public double obtenerEnergiaPorFecha(String fecha) {
	        return historicoEnergia.getOrDefault(fecha, 0.0);
	    }
}
