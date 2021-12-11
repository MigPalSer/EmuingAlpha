package basicEmuing;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import interfaces.ConjuntoItems;
import interfaces.CriterioBusqueda;
import interfaces.Item;

public class ConjuntoSet extends HashSet<Item> implements ConjuntoItems {

	Map<Integer, Item> mapa_items;

	@Override
	public Set<Item> busqueda(CriterioBusqueda criterio) {
		Set<Item> itemsEscogidos=new HashSet<Item>();
		for (Item item : this) {
			if(criterio.verificar(item))itemsEscogidos.add(item);
		}
		
		return itemsEscogidos;
	}

	@Override
	public Set<Item> todos() {
		return this;
	}

	@Override
	public Item obtener(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void anhadir(Item i) {
		this.add(i);
		mapa_items.put(i.getId(), i);
	}

	public Map<Integer, Item> getMapa_items() {
		return mapa_items;
	}

	public void setMapa_items(Map<Integer, Item> mapa_items) {
		this.mapa_items = mapa_items;
	}

	public ConjuntoSet() {
		super();
	}
	
	

}
