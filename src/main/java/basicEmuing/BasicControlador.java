package basicEmuing;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import interfaces.Comando;
import interfaces.Configuracion;
import interfaces.ConjuntoItems;
import interfaces.Controlador;
import interfaces.GeneradorVista;
import interfaces.Item;
import interfaces.Mostrador;
import interfaces.Persistidor;
import interfaces.Vista;

public class BasicControlador implements Controlador {


	protected Vista vista_actual;
	protected ConjuntoItems conjunto;
	protected Configuracion configuracion;
	protected Persistidor persistidor;
	protected List<Mostrador> lista_mostradores;
	protected Map<Integer, GeneradorVista> mapa_generadores;
	protected Map<String, Comando> mapa_comandos; 
	protected String cmd_retroceso;
	
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
	public void retrocederVista() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notificarMostradores() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void generarVista(int idl, String arg) {
		// TODO Auto-generated method stub
		
	}
	
	public boolean ejecutarCMD(String s) {
		
		//s+=" $";
		String[] argumentos=s.split("\\s+");
		
		String cmd=argumentos[0];
		if(cmd.equals("exit"))return false;
		
		switch (cmd) {
		case "vista_id":
			int vista=Integer.parseInt(argumentos[1]);
			String arg=argumentos.length>2?argumentos[2]:"";
			vista_actual=mapa_generadores.get(vista).genera(vista, arg);
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

	public Vista getVista_actual() {
		return vista_actual;
	}

	//Cambia lo de la vista anterior antes
	public void setVista_actual(Vista vista_actual) {
		cmd_retroceso=vista_actual.cmdRecarga();
		this.vista_actual = vista_actual;
	}

	public Configuracion getConfiguracion() {
		return configuracion;
	}

	public void setConfiguracion(Configuracion configuracion) {
		this.configuracion = configuracion;
	}

	public Persistidor getPersistidor() {
		return persistidor;
	}

	public void setPersistidor(Persistidor persistidor) {
		this.persistidor = persistidor;
	}

	public List<Mostrador> getLista_mostradores() {
		return lista_mostradores;
	}

	public void setLista_mostradores(List<Mostrador> lista_mostradores) {
		this.lista_mostradores = lista_mostradores;
	}

	public Map<Integer, GeneradorVista> getMapa_generadores() {
		return mapa_generadores;
	}

	public void setMapa_generadores(Map<Integer, GeneradorVista> mapa_generadores) {
		this.mapa_generadores = mapa_generadores;
	}

	public Map<String, Comando> getMapa_comandos() {
		return mapa_comandos;
	}

	public void setMapa_comandos(Map<String, Comando> mapa_comandos) {
		this.mapa_comandos = mapa_comandos;
	}

	
	

	
	
}
