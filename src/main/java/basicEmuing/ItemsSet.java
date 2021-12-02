package basicEmuing;

import java.util.HashSet;
import java.util.Set;

import interfaces.ConjuntoItems;
import interfaces.CriterioBusqueda;
import interfaces.Item;

public class ItemsSet extends HashSet<Item> implements ConjuntoItems {

	@Override
	public Set<Item> itemsQuery(CriterioBusqueda criterio) {
		Set<Item> itemsEscogidos=new HashSet<Item>();
		for (Item item : this) {
			if(criterio.buscar(item))itemsEscogidos.add(item);
		}
		
		return itemsEscogidos;
	}

	@Override
	public Set<Item> todosItems() {
		return this;
	}

}
