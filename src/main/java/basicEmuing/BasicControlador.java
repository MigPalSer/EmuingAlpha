package basicEmuing;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.Scanner;

import interfaces.ConjuntoItems;
import interfaces.Controlador;
import interfaces.GeneradorVista;
import interfaces.Item;
import interfaces.Vista;

public class BasicControlador implements Controlador {

	protected ConjuntoItems conjunto;
	protected Vista vista_actual;
	protected Map<Integer, String> mapa_listas;
	protected Map<Integer, GeneradorVista> mapa_estrategias_vista;

	
	public BasicControlador() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public LocalDateTime ahora() {
		return LocalDateTime.now();
	}

	@Override
	public Item anhadirABandeja(String descripcion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Item anhadirABandeja(String descripcion, String info) {
		// TODO Auto-generated method stub
		return null;
	}


	
	public boolean ejecutaCMD(String s) {
		
		//s+=" $";
		String[] argumentos=s.split("\\s+");
		
		String cmd=argumentos[0];
		if(cmd.equals("exit"))return false;
		
		switch (cmd) {
		case "vista_id":
			int vista=Integer.parseInt(argumentos[1]);
			String arg=argumentos.length>2?argumentos[2]:"";
			vista_actual=mapa_estrategias_vista.get(vista).genera(vista, arg);
			break;
			
		case "captura":
			String def_corta="";
			String info_adicional="";
			boolean def=true;
			//construimos el string correspondiente de definición e info adicional, que en el comando separamos con //
			for (int i = 1; i < argumentos.length; i++) {
				String str=argumentos[i];
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
				anhadirABandeja(def_corta);
			}else {
				anhadirABandeja(def_corta, info_adicional);
			}
		default:
			break;
		}
		
		return true;
	}


	//Getters y Setters
	@Override
	public void setConjunto(ConjuntoItems ci) {
		conjunto=ci;
	}

	@Override
	public ConjuntoItems getConjunto() {
		return conjunto;
	}
	

	@Override
	public Map<Integer, String> mapaListas() {
		return mapa_listas;
	}
	
	
}
