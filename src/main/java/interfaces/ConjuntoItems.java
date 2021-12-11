package interfaces;

import java.util.Set;

public interface ConjuntoItems {


	public Set<Item> busqueda(CriterioBusqueda criterio);

	public Set<Item> todos();
	
	public Item obtener(int id);
	
	public void anhadir(Item i);

	
}
