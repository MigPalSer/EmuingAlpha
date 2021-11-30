package interfaces;

import java.util.List;

public interface ConjuntoItems {

	public List<Item> itemsPorLista(int lista);

	public List<Item> itemsConAlerta();

	public List<Item> itemsConDeadline();
}
