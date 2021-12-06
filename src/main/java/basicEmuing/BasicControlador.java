package basicEmuing;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.Scanner;

import interfaces.ConjuntoItems;
import interfaces.Controlador;
import interfaces.Item;
import interfaces.Vista;

public class BasicControlador implements Controlador {

	ConjuntoItems conjunto;
	Vista vista_actual;
	
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

	@Override
	public Map<Integer, String> mapaListas() {
		return null;
	}

	@Override
	public void setConjunto(ConjuntoItems ci) {
		conjunto=ci;
	}

	@Override
	public ConjuntoItems getConjunto() {
		return conjunto;
	}
	
	public boolean ejecutaCMD(String s) {
		
		//s+=" $";
		String[] argumentos=s.split("\\s+");
		
		String cmd=argumentos[0];
		if(cmd.equals("exit"))return false;
		
		
		return true;
	}


}
