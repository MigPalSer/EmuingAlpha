package comandos;

import interfaces.Comando;
import interfaces.Controlador;
import interfaces.Vista;

public class Vista_id implements Comando {

	@Override
	public void ejecutar(Controlador ctrl, String[] args) {
		int vista_id=Integer.parseInt(args[1]);
		String arg=args.length>2?args[2]:"";
		Vista vista_actual=ctrl.getMapa_generadores().get(vista_id).genera(vista_id, arg);
		ctrl.setVista_actual(vista_actual);
	}

}
