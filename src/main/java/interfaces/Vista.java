package interfaces;

import java.util.Map;
import java.util.Set;

public interface Vista {

	/*
	Map<Integer, Item> items_vista;	
	Set<Integer> cambios_de_seccion;
	items vista 
	
*/
	public Map<Integer, Item> getItems_vista();
	public void setItems_vista(Map<Integer, Item> items_vista);
	
	public Set<Integer> getCambios_de_seccion();
	public void setCambios_de_seccion(Set<Integer> cambios_de_seccion);

	public void establecerVista(Set<Item> ...sets);
	
}
