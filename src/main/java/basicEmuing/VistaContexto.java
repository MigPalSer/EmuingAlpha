package basicEmuing;

import java.util.Map;
import java.util.Set;

import interfaces.Item;
import interfaces.Vista;

public class VistaContexto implements Vista {

	Map<Integer, Item> items_vista;	
	Set<Integer> cambios_de_seccion;
	Map<Integer, String> propiedades_items;	
	
	public VistaContexto(int lista) {

		
	
	}

	public Map<Integer, Item> getItems_vista() {
		return items_vista;
	}

	public void setItems_vista(Map<Integer, Item> items_vista) {
		this.items_vista = items_vista;
	}

	public Set<Integer> getCambios_de_seccion() {
		return cambios_de_seccion;
	}

	public void setCambios_de_seccion(Set<Integer> cambios_de_seccion) {
		this.cambios_de_seccion = cambios_de_seccion;
	}

	public Map<Integer, String> getPropiedades_items() {
		return propiedades_items;
	}

	public void setPropiedades_items(Map<Integer, String> propiedades_items) {
		this.propiedades_items = propiedades_items;
	}

	@Override
	public void establecerVista(Set<Item>... sets) {
		// TODO Auto-generated method stub
		
	}



}
