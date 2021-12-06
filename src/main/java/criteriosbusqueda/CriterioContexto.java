package criteriosbusqueda;

import interfaces.CriterioBusqueda;
import interfaces.Item;

public class CriterioContexto implements CriterioBusqueda {

	protected int lista;
	
	public CriterioContexto(int lista) {
		this.lista=lista;
	}

	@Override
	public boolean buscar(Item i) {

		return i.getLista()==lista&&i.isCompletada()==false;
	}

}
