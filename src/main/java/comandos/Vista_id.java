package comandos;

import interfaces.Comando;
import interfaces.Controlador;
import interfaces.Vista;

public class Vista_id implements Comando {

	@Override
	public void ejecutar(Controlador ctrl, String[] args) {
		int vista_id=Integer.parseInt(args[1]);
		String arg=args.length>2?args[2]:"";
		ctrl.generarVista(vista_id, arg);
	}

}
