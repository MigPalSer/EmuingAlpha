package comandos;

import interfaces.Comando;
import interfaces.Controlador;

public class Captura implements Comando {

	@Override
	public void ejecutar(Controlador ctrl, String[] args) {

		String def_corta="";
		String info_adicional="";
		boolean def=true;
		//construimos el string correspondiente de definición e info adicional, que en el comando separamos con //
		for (int i = 1; i < args.length; i++) {
			String str=args[i];
			if(str.equals("//")) {
				def=false;
				continue;
			}
			if(def) {
				def_corta+=str;
			}else {
				info_adicional+=str;
			}
		}
		//Dependiendo de si hay info adicional, usamos anhadirABandeja con uno u otro argumento.
		if(info_adicional.equals("")) {
			ctrl.anhadirABandeja(def_corta);
		}else {
			ctrl.anhadirABandeja(def_corta, info_adicional);
		}
		
	}

}
