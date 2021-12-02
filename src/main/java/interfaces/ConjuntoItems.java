package interfaces;

import java.util.Set;

public interface ConjuntoItems {

	/*
	public List<Item> itemsPorLista(int lista);

	public List<Item> itemsConAlerta();

	public List<Item> itemsConDeadline();
	*/
	
	public Set<Item> itemsQuery(CriterioBusqueda criterio);

	public Set<Item> todosItems();
	
	//public void add(Item i);

	
}
