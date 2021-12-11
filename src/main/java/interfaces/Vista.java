package interfaces;

import java.util.Map;
import java.util.Set;

public interface Vista {

	/*
	Map<Integer, Item> items_vista;	
	Set<Integer> cambios_de_seccion;
	Map<Integer, String> propiedades_items;	

	items vista es el mapa, con los indicadores de cada item que hay en la lista, por orden, mientras que cambio de seccion indica en que indices del mapa hay que hacer un cambio de seccion
	propiedades items permite asignar códigos para ciertos items, como por ejemplo no poder ser editados o completados, tambien permite asignar propiedades estéticas (tipo los deadlines)
*/
	/*
	public Map<Integer, Item> getItems_vista();
	public void setItems_vista(Map<Integer, Item> items_vista);
	
	public Set<Integer> getCambios_de_seccion();
	public void setCambios_de_seccion(Set<Integer> cambios_de_seccion);
	
	public Map<Integer, String> getPropiedades_items();
	public void setPropiedades_items(Map<Integer, String> items_vista);

	public void establecerVista(Set<Item> ...sets);
	*/
	
	public String getStringDescriptor();
	
	public String cmdRecarga();
	
	public default String[] alias(String[] cmd) {
		return cmd;
	};
	
	
}
