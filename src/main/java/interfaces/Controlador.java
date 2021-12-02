package interfaces;

import java.time.LocalDateTime;
import java.util.Map;

public interface Controlador {

	public LocalDateTime ahora();
	
	public Item anhadirABandeja(String descripcion);
	
	public Item anhadirABandeja(String descripcion, String info);
	
	public Map<Integer, String> mapaListas();
	
	public void setConjunto(ConjuntoItems ci);
	public ConjuntoItems getConjunto();

}
