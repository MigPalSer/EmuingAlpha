package interfaces;

import java.time.LocalDateTime;
import java.util.Map;

public interface Controlador {

	public LocalDateTime ahora();
	
	public Item anhadirABandeja(String descripcion);
	
	public Map<Integer, String> mapaListas();
	
}
