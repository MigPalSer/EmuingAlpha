package generadoresvistas;

import basicEmuing.VistaContexto;
import interfaces.GeneradorVista;
import interfaces.Vista;

public class GeneradorContexto implements GeneradorVista {

	public GeneradorContexto() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Vista genera(int id, String arg) {
		Vista ctxt=new VistaContexto(id);
		return ctxt;
	}

}
