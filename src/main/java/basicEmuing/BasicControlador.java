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
	}

	@Override
	public LocalDateTime ahora() {
		return LocalDateTime.now();
	}

	@Override
	public Item anhadirABandeja(String descripcion) {
		Item i=new BasicItem(descripcion);
		i.setLista(0);
		i.setId(asignarIDItem());
		conjunto.anhadir(i);
		//TODO persistencia
		return i;
	}

	@Override
	public Item anhadirABandeja(String descripcion, String info) {
		Item i=new BasicItem(descripcion);
		i.setInfo_adicional(info);
		i.setLista(0);
		i.setId(asignarIDItem());
		conjunto.anhadir(i);
		//TODO persistencia
		return i;
	}

	public int asignarIDItem() {
		//TODO
		return 0;
	}

	@Override
	public void retrocederVista() {
		ejecutarCMD(cmd_retroceso);
	}

	@Override
	public void notificarMostradores() {
		for (Mostrador mostrador : lista_mostradores) {
	mostrador.actualizar();
}		
	}

	@Override
	public void generarVista(int idl, String arg) {
		cmd_retroceso=vista_actual.cmdRecarga();
		vista_actual=mapa_generadores.get(idl).genera(idl, arg);
	}
	
	public boolean ejecutarCMD(String s) {
		
		//s+=" $";
		String[] argumentos=s.split("\\s+");
		
		argumentos=vista_actual.alias(argumentos);
		
		String cmd=argumentos[0];
		if(cmd.equals("exit"))return false;
		
		if(mapa_comandos.containsKey(cmd)) {
			mapa_comandos.get(cmd).ejecutar(this, argumentos);
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
